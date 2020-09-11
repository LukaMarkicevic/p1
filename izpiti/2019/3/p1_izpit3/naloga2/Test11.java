
public class Test11 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(3),
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(4),
            new Druga.Mesto(4),
            new Druga.Mesto(4),
            new Druga.Mesto(4),
            new Druga.Mesto(3),
            new Druga.Mesto(4),
            new Druga.Mesto(0),
            new Druga.Mesto(3),
            new Druga.Mesto(4),
            new Druga.Mesto(4),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(3),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(2),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[5], mesta[13], mesta[14], mesta[15], mesta[16], mesta[19]},
                new Druga.Mesto[]{mesta[6], mesta[17], mesta[18], mesta[23]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[14]},
                new Druga.Mesto[]{mesta[12], mesta[18]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[5]},
                new Druga.Mesto[]{mesta[8]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[9], mesta[14], mesta[20]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[5], mesta[8], mesta[15], mesta[17], mesta[24]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[4], mesta[5], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[20], mesta[22], mesta[24]},
                new Druga.Mesto[]{mesta[19]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[5], mesta[9], mesta[12], mesta[14], mesta[20]},
                new Druga.Mesto[]{mesta[15]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[4], mesta[5], mesta[7], mesta[8], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[16], mesta[19], mesta[20], mesta[21], mesta[22], mesta[25]},
                new Druga.Mesto[]{mesta[6], mesta[15], mesta[17], mesta[18], mesta[23]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[2], prehodi[5], prehodi[6]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[3], prehodi[4]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[6]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[5]});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[4], prehodi[6]});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[4], prehodi[5], prehodi[6]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[6]}, new Druga.Prehod[]{});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[6]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3]}, new Druga.Prehod[]{prehodi[6]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5], prehodi[6]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[4], prehodi[6]});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[4], prehodi[6]});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{prehodi[1]}, new Druga.Prehod[]{prehodi[4], prehodi[5], prehodi[6]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[6]});
        mesta[14].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[4], prehodi[5], prehodi[6]});
        mesta[15].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[5], prehodi[6]}, new Druga.Prehod[]{prehodi[0]});
        mesta[16].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[6]});
        mesta[17].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[6]}, new Druga.Prehod[]{});
        mesta[18].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[6]}, new Druga.Prehod[]{});
        mesta[19].nastaviPrehode(new Druga.Prehod[]{prehodi[4]}, new Druga.Prehod[]{prehodi[0], prehodi[6]});
        mesta[20].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5], prehodi[6]});
        mesta[21].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[6]});
        mesta[22].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[4], prehodi[6]});
        mesta[23].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[6]}, new Druga.Prehod[]{});
        mesta[24].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[4]});
        mesta[25].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[6]});

        Druga.Mreza mreza = new Druga.Mreza(mesta, prehodi);

        for (int i = 0;  i < prehodi.length;  i++) {
            System.out.println(prehodi[i].seLahkoSprozi());
        }
    }
}
