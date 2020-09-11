
public class Test09 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(3),
            new Druga.Mesto(1),
            new Druga.Mesto(4),
            new Druga.Mesto(0),
            new Druga.Mesto(3),
            new Druga.Mesto(0),
            new Druga.Mesto(4),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[3], mesta[5], mesta[7], mesta[9], mesta[11], mesta[12], mesta[14], mesta[16]},
                new Druga.Mesto[]{mesta[2], mesta[4], mesta[15]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[3], mesta[5], mesta[9], mesta[11], mesta[12]},
                new Druga.Mesto[]{mesta[2]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[4], mesta[6], mesta[7], mesta[9], mesta[10], mesta[11], mesta[12], mesta[14], mesta[16]},
                new Druga.Mesto[]{mesta[15]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[3], mesta[5], mesta[12]},
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[4], mesta[6], mesta[7], mesta[8], mesta[10], mesta[11], mesta[13], mesta[14], mesta[15], mesta[16]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5]},
                new Druga.Mesto[]{mesta[3], mesta[4], mesta[7], mesta[8], mesta[12], mesta[13], mesta[15], mesta[16]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[6]},
                new Druga.Mesto[]{mesta[0], mesta[8], mesta[10], mesta[13], mesta[15]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[5], mesta[9], mesta[12]},
                new Druga.Mesto[]{mesta[3], mesta[16]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[5]}, new Druga.Prehod[]{prehodi[2]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[5], prehodi[6]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3]}, new Druga.Prehod[]{prehodi[2], prehodi[5]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3]});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[4]}, new Druga.Prehod[]{prehodi[2]});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[4], prehodi[6]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[2], prehodi[5]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4]}, new Druga.Prehod[]{prehodi[0], prehodi[2]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5]}, new Druga.Prehod[]{});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[6]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[5]}, new Druga.Prehod[]{prehodi[2]});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2]});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{prehodi[4]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[3], prehodi[6]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5]}, new Druga.Prehod[]{});
        mesta[14].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[0], prehodi[2]});
        mesta[15].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[4], prehodi[5]}, new Druga.Prehod[]{});
        mesta[16].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[2]});

        Druga.Mreza mreza = new Druga.Mreza(mesta, prehodi);

        for (int i = 0;  i < prehodi.length;  i++) {
            System.out.println(prehodi[i].seLahkoSprozi());
        }
    }
}
