
public class Test48 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(1),
            new Druga.Mesto(1),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(0),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[4], mesta[5], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[16], mesta[17], mesta[18], mesta[20], mesta[21]},
                new Druga.Mesto[]{mesta[3], mesta[19]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5]},
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[3], mesta[4], mesta[6], mesta[7], mesta[12], mesta[13], mesta[14], mesta[20], mesta[21]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5], mesta[13], mesta[16]},
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[3], mesta[4], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[11], mesta[12], mesta[14], mesta[15], mesta[17], mesta[18], mesta[19], mesta[21]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[4], mesta[5], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[16], mesta[17], mesta[21]},
                new Druga.Mesto[]{mesta[0], mesta[8]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[9], mesta[13], mesta[16]},
                new Druga.Mesto[]{mesta[3], mesta[7], mesta[10], mesta[12], mesta[19]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[4], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[16], mesta[17], mesta[21]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[6], mesta[18], mesta[19], mesta[20]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5], mesta[16]},
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[9], mesta[13], mesta[14], mesta[15], mesta[19], mesta[20]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[4], mesta[5], mesta[9], mesta[11], mesta[12], mesta[13], mesta[16], mesta[21]},
                new Druga.Mesto[]{mesta[3], mesta[6], mesta[7], mesta[8], mesta[15], mesta[17], mesta[18]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[4], mesta[5], mesta[6], mesta[8], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[15], mesta[16], mesta[18], mesta[19], mesta[20], mesta[21]},
                new Druga.Mesto[]{mesta[3], mesta[7]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[5], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[8]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2]}, new Druga.Prehod[]{prehodi[0], prehodi[8]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[5], prehodi[8]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[4], prehodi[5], prehodi[7], prehodi[8]}, new Druga.Prehod[]{});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[5], prehodi[7], prehodi[8]});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[3], prehodi[6], prehodi[7], prehodi[8]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[5], prehodi[7]}, new Druga.Prehod[]{prehodi[8]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[4], prehodi[7], prehodi[8]}, new Druga.Prehod[]{});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[7]}, new Druga.Prehod[]{prehodi[8]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[6]}, new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[7], prehodi[8]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[4]}, new Druga.Prehod[]{prehodi[3], prehodi[8]});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{prehodi[2]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[5], prehodi[7], prehodi[8]});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[4]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[5], prehodi[7], prehodi[8]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[4], prehodi[5], prehodi[7], prehodi[8]});
        mesta[14].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[5]});
        mesta[15].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[6], prehodi[7]}, new Druga.Prehod[]{prehodi[0], prehodi[5], prehodi[8]});
        mesta[16].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[4], prehodi[5], prehodi[6], prehodi[7], prehodi[8]});
        mesta[17].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[7]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[5]});
        mesta[18].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[5], prehodi[7]}, new Druga.Prehod[]{prehodi[0], prehodi[8]});
        mesta[19].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[4], prehodi[5], prehodi[6]}, new Druga.Prehod[]{prehodi[8]});
        mesta[20].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[5], prehodi[6]}, new Druga.Prehod[]{prehodi[0], prehodi[8]});
        mesta[21].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[5], prehodi[7], prehodi[8]});

        Druga.Mreza mreza = new Druga.Mreza(mesta, prehodi);

        mreza.doKonca();

        for (int i = 0;  i < mesta.length;  i++) {
            System.out.println(mesta[i].vrniStZetonov());
        }
    }
}
