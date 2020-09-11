
public class Test43 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[5], mesta[8]},
                new Druga.Mesto[]{mesta[3], mesta[11], mesta[12]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[9]},
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[10], mesta[14]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[4], mesta[8], mesta[9], mesta[10]},
                new Druga.Mesto[]{mesta[11], mesta[12], mesta[14]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[3]},
                new Druga.Mesto[]{mesta[11], mesta[14]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[4], mesta[5], mesta[8], mesta[9], mesta[15]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[7], mesta[12], mesta[14]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[4], mesta[5], mesta[6], mesta[7], mesta[9], mesta[10], mesta[12], mesta[13]},
                new Druga.Mesto[]{mesta[3], mesta[11]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[4]}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[5]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{prehodi[1]}, new Druga.Prehod[]{prehodi[2]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{prehodi[1]}, new Druga.Prehod[]{prehodi[4], prehodi[5]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[5]}, new Druga.Prehod[]{prehodi[3]});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[2], prehodi[4], prehodi[5]});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[5]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[5]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[4]}, new Druga.Prehod[]{prehodi[5]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[4]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[4], prehodi[5]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[1]}, new Druga.Prehod[]{prehodi[2], prehodi[5]});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[5]}, new Druga.Prehod[]{});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[4]}, new Druga.Prehod[]{prehodi[5]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[5]});
        mesta[14].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[4]}, new Druga.Prehod[]{});
        mesta[15].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[4]});

        Druga.Mreza mreza = new Druga.Mreza(mesta, prehodi);

        mreza.doKonca();

        for (int i = 0;  i < mesta.length;  i++) {
            System.out.println(mesta[i].vrniStZetonov());
        }
    }
}
