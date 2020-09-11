
public class Test35 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(3),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(3),
            new Druga.Mesto(1),
            new Druga.Mesto(3),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(6),
            new Druga.Mesto(7),
            new Druga.Mesto(4),
            new Druga.Mesto(1),
            new Druga.Mesto(3),
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(6),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(3),
            new Druga.Mesto(2),
            new Druga.Mesto(3),
            new Druga.Mesto(3),
            new Druga.Mesto(3),
            new Druga.Mesto(0),
            new Druga.Mesto(6),
            new Druga.Mesto(5),
            new Druga.Mesto(4),
            new Druga.Mesto(0),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[5], mesta[8], mesta[16], mesta[22], mesta[25]},
                new Druga.Mesto[]{mesta[4], mesta[10], mesta[11], mesta[18], mesta[19], mesta[20], mesta[24], mesta[27], mesta[28], mesta[30]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[3], mesta[7], mesta[8], mesta[13], mesta[17], mesta[18], mesta[23], mesta[29]},
                new Druga.Mesto[]{mesta[30]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[6], mesta[17], mesta[22], mesta[23], mesta[25]},
                new Druga.Mesto[]{mesta[4], mesta[5], mesta[7], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[16], mesta[18], mesta[19], mesta[20], mesta[21], mesta[24], mesta[26], mesta[27], mesta[28]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[5], mesta[9], mesta[12], mesta[17], mesta[22]},
                new Druga.Mesto[]{mesta[4], mesta[10], mesta[14], mesta[18], mesta[19], mesta[24], mesta[26], mesta[27], mesta[28], mesta[29], mesta[30], mesta[31]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[3], mesta[5], mesta[9], mesta[12], mesta[14], mesta[16], mesta[21], mesta[22], mesta[25], mesta[26], mesta[29]},
                new Druga.Mesto[]{mesta[13]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[3], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[12], mesta[16], mesta[17], mesta[21], mesta[22], mesta[23], mesta[25]},
                new Druga.Mesto[]{mesta[4], mesta[13], mesta[19], mesta[29], mesta[31]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[31]},
                new Druga.Mesto[]{mesta[4], mesta[11], mesta[18], mesta[27], mesta[30]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[17], mesta[21], mesta[23], mesta[31]},
                new Druga.Mesto[]{mesta[4], mesta[10], mesta[11], mesta[18], mesta[20], mesta[24], mesta[27]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[5], mesta[6], mesta[7], mesta[9], mesta[17]},
                new Druga.Mesto[]{mesta[10], mesta[11], mesta[14], mesta[19], mesta[24], mesta[26], mesta[31]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[15], mesta[23]},
                new Druga.Mesto[]{mesta[4], mesta[10], mesta[11], mesta[20], mesta[27], mesta[28], mesta[31]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2]},
                new Druga.Mesto[]{mesta[6], mesta[19], mesta[22]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[7], mesta[9], mesta[17], mesta[22], mesta[25]},
                new Druga.Mesto[]{mesta[8], mesta[10], mesta[11], mesta[16], mesta[20], mesta[24], mesta[26], mesta[27], mesta[28], mesta[29], mesta[30], mesta[31]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[3], mesta[6], mesta[17], mesta[22], mesta[25]},
                new Druga.Mesto[]{mesta[4], mesta[5], mesta[7], mesta[8], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[16], mesta[18], mesta[20], mesta[24], mesta[26], mesta[27], mesta[28], mesta[29], mesta[30]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[6], mesta[7], mesta[8], mesta[19], mesta[23], mesta[25], mesta[29]},
                new Druga.Mesto[]{mesta[10], mesta[11], mesta[30]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5], prehodi[10], prehodi[12]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[5], prehodi[8], prehodi[11]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[4], prehodi[5], prehodi[8], prehodi[9], prehodi[10], prehodi[12]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[5], prehodi[12]});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[5], prehodi[6], prehodi[7], prehodi[9], prehodi[12]}, new Druga.Prehod[]{});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[12]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[4], prehodi[5], prehodi[8]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[10]}, new Druga.Prehod[]{prehodi[2], prehodi[5], prehodi[8], prehodi[12], prehodi[13]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[12]}, new Druga.Prehod[]{prehodi[1], prehodi[5], prehodi[8], prehodi[11], prehodi[13]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[11], prehodi[12]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[5], prehodi[13]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[12]}, new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5], prehodi[8], prehodi[11]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[7], prehodi[8], prehodi[9], prehodi[11], prehodi[12], prehodi[13]}, new Druga.Prehod[]{});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[6], prehodi[7], prehodi[8], prehodi[9], prehodi[11], prehodi[12], prehodi[13]}, new Druga.Prehod[]{});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[12]}, new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[4], prehodi[5], prehodi[12]}, new Druga.Prehod[]{prehodi[1]});
        mesta[14].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[8], prehodi[12]}, new Druga.Prehod[]{prehodi[4]});
        mesta[15].nastaviPrehode(new Druga.Prehod[]{prehodi[2]}, new Druga.Prehod[]{prehodi[9]});
        mesta[16].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[11], prehodi[12]}, new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[5]});
        mesta[17].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[5], prehodi[7], prehodi[8], prehodi[11], prehodi[12]});
        mesta[18].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[6], prehodi[7], prehodi[12]}, new Druga.Prehod[]{prehodi[1]});
        mesta[19].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[5], prehodi[8], prehodi[10]}, new Druga.Prehod[]{prehodi[13]});
        mesta[20].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[7], prehodi[9], prehodi[11], prehodi[12]}, new Druga.Prehod[]{});
        mesta[21].nastaviPrehode(new Druga.Prehod[]{prehodi[2]}, new Druga.Prehod[]{prehodi[4], prehodi[5], prehodi[7]});
        mesta[22].nastaviPrehode(new Druga.Prehod[]{prehodi[10]}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[4], prehodi[5], prehodi[11], prehodi[12]});
        mesta[23].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[5], prehodi[7], prehodi[9], prehodi[13]});
        mesta[24].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[7], prehodi[8], prehodi[11], prehodi[12]}, new Druga.Prehod[]{});
        mesta[25].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[4], prehodi[5], prehodi[11], prehodi[12], prehodi[13]});
        mesta[26].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[8], prehodi[11], prehodi[12]}, new Druga.Prehod[]{prehodi[4]});
        mesta[27].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[6], prehodi[7], prehodi[9], prehodi[11], prehodi[12]}, new Druga.Prehod[]{});
        mesta[28].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[9], prehodi[11], prehodi[12]}, new Druga.Prehod[]{});
        mesta[29].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[5], prehodi[11], prehodi[12]}, new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[13]});
        mesta[30].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[6], prehodi[11], prehodi[12], prehodi[13]}, new Druga.Prehod[]{});
        mesta[31].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[5], prehodi[8], prehodi[9], prehodi[11]}, new Druga.Prehod[]{prehodi[6], prehodi[7]});

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
