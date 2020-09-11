
public class Test33 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(4),
            new Druga.Mesto(4),
            new Druga.Mesto(0),
            new Druga.Mesto(4),
            new Druga.Mesto(1),
            new Druga.Mesto(3),
            new Druga.Mesto(4),
            new Druga.Mesto(5),
            new Druga.Mesto(4),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2]},
                new Druga.Mesto[]{mesta[3], mesta[4], mesta[5], mesta[6], mesta[8]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2]},
                new Druga.Mesto[]{mesta[0], mesta[1]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[6]},
                new Druga.Mesto[]{mesta[0], mesta[3]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[7]},
                new Druga.Mesto[]{mesta[3], mesta[8]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2]}, new Druga.Prehod[]{});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{prehodi[1]}, new Druga.Prehod[]{prehodi[2]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3]}, new Druga.Prehod[]{});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{prehodi[0]}, new Druga.Prehod[]{});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{prehodi[0]}, new Druga.Prehod[]{});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[0]}, new Druga.Prehod[]{prehodi[2]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[3]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[3]}, new Druga.Prehod[]{});

        Druga.Mreza mreza = new Druga.Mreza(mesta, prehodi);

        for (int i = 0;  i < mesta.length;  i++) {
            for (int j = 0;  j < mesta.length;  j++) {
                if (i == j) {
                    System.out.print("-");
                } else {
                    System.out.print(mesta[j].jeNaslednikOd(mesta[i]) ? 1 : 0);
                }
            }
            System.out.println();
        }
    }
}
