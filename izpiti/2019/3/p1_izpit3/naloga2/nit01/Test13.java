
public class Test13 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(1),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(0),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[3], mesta[4], mesta[8]},
                new Druga.Mesto[]{mesta[1], mesta[5], mesta[10]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2]},
                new Druga.Mesto[]{mesta[9]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[3], mesta[4], mesta[7], mesta[8], mesta[10]},
                new Druga.Mesto[]{mesta[6], mesta[9]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[4]},
                new Druga.Mesto[]{mesta[1], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[3], mesta[5], mesta[6], mesta[7], mesta[10]},
                new Druga.Mesto[]{mesta[9]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[3]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[3]}, new Druga.Prehod[]{prehodi[2]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[3]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[4]});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3]});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[3]}, new Druga.Prehod[]{prehodi[4]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3]}, new Druga.Prehod[]{prehodi[4]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[2], prehodi[4]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[0], prehodi[2]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[4]}, new Druga.Prehod[]{});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[3]}, new Druga.Prehod[]{prehodi[2], prehodi[4]});

        Druga.Mreza mreza = new Druga.Mreza(mesta, prehodi);

        prehodi[3].sprozi();

        for (int i = 0;  i < mesta.length;  i++) {
            System.out.println(mesta[i].vrniStZetonov());
        }
    }
}
