
public class Test29 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(6),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(6),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(0),
            new Druga.Mesto(6),
            new Druga.Mesto(5),
            new Druga.Mesto(5),
            new Druga.Mesto(2),
            new Druga.Mesto(6),
            new Druga.Mesto(4),
            new Druga.Mesto(5),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[5], mesta[6], mesta[8], mesta[9], mesta[10], mesta[11]},
                new Druga.Mesto[]{mesta[3], mesta[7], mesta[12]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[4], mesta[5], mesta[6], mesta[9], mesta[10], mesta[11], mesta[12]},
                new Druga.Mesto[]{mesta[7]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[4], mesta[5], mesta[6], mesta[8], mesta[9], mesta[10], mesta[13]},
                new Druga.Mesto[]{mesta[12]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[9], mesta[13]},
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[3], mesta[4], mesta[5], mesta[7], mesta[10], mesta[12]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[6]},
                new Druga.Mesto[]{mesta[0], mesta[4], mesta[7], mesta[8], mesta[9], mesta[11], mesta[12], mesta[13]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[8]},
                new Druga.Mesto[]{mesta[3], mesta[5], mesta[12]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[8], mesta[9]},
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[3], mesta[4], mesta[5], mesta[7], mesta[10], mesta[11], mesta[12]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[9]},
                new Druga.Mesto[]{mesta[1], mesta[3], mesta[5], mesta[7], mesta[12]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[7]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[7]}, new Druga.Prehod[]{prehodi[0], prehodi[1]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[7]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[5], prehodi[6], prehodi[7]}, new Druga.Prehod[]{});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[6]}, new Druga.Prehod[]{prehodi[1], prehodi[2]});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[5], prehodi[6], prehodi[7]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[4]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[4], prehodi[6], prehodi[7]}, new Druga.Prehod[]{});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[4]}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[5], prehodi[6]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{prehodi[4]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[3], prehodi[6], prehodi[7]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2]});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[1]});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[4], prehodi[5], prehodi[6], prehodi[7]}, new Druga.Prehod[]{prehodi[1]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{prehodi[4]}, new Druga.Prehod[]{prehodi[2], prehodi[3]});

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
