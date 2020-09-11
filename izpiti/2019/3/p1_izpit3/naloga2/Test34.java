
public class Test34 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(6),
            new Druga.Mesto(3),
            new Druga.Mesto(3),
            new Druga.Mesto(6),
            new Druga.Mesto(2),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(5),
            new Druga.Mesto(1),
            new Druga.Mesto(5),
            new Druga.Mesto(4),
            new Druga.Mesto(3),
            new Druga.Mesto(6),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(6),
            new Druga.Mesto(1),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(6),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(4),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(1),
            new Druga.Mesto(6),
            new Druga.Mesto(1),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(6),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[5], mesta[6], mesta[8], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[17], mesta[18], mesta[19], mesta[21], mesta[22], mesta[24], mesta[26], mesta[28], mesta[29], mesta[30], mesta[31], mesta[33], mesta[34], mesta[36], mesta[38], mesta[39], mesta[40], mesta[42], mesta[43], mesta[44], mesta[45]},
                new Druga.Mesto[]{mesta[32]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[16]},
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[3], mesta[11], mesta[20], mesta[25], mesta[27], mesta[30], mesta[37], mesta[39], mesta[41], mesta[42], mesta[43]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5], mesta[12], mesta[19], mesta[26]},
                new Druga.Mesto[]{mesta[35]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5], mesta[7], mesta[10], mesta[12], mesta[16], mesta[19], mesta[23], mesta[24], mesta[29], mesta[31], mesta[34], mesta[38], mesta[40]},
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[3], mesta[6], mesta[8], mesta[11], mesta[13], mesta[15], mesta[17], mesta[18], mesta[20], mesta[21], mesta[25], mesta[27], mesta[28], mesta[30], mesta[33], mesta[35], mesta[39], mesta[42], mesta[43], mesta[44], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[10], mesta[12], mesta[19], mesta[23], mesta[24], mesta[26], mesta[31], mesta[38], mesta[45]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[13]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[38], mesta[42]},
                new Druga.Mesto[]{mesta[3], mesta[11], mesta[15], mesta[28], mesta[32]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[5], mesta[12], mesta[18], mesta[19], mesta[29], mesta[30], mesta[31], mesta[34], mesta[36], mesta[40], mesta[45]},
                new Druga.Mesto[]{mesta[25], mesta[39], mesta[44]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[10], mesta[17], mesta[22], mesta[24], mesta[29], mesta[30], mesta[33], mesta[37], mesta[42], mesta[43], mesta[45]},
                new Druga.Mesto[]{mesta[32]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5], mesta[7], mesta[10], mesta[19], mesta[23], mesta[24], mesta[35], mesta[38]},
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[3], mesta[9], mesta[13], mesta[18], mesta[27], mesta[37], mesta[39], mesta[41]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[8], mesta[22], mesta[35], mesta[37], mesta[39], mesta[41], mesta[45]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[13]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5], mesta[12], mesta[19], mesta[23], mesta[26], mesta[36]},
                new Druga.Mesto[]{mesta[0], mesta[7], mesta[8], mesta[14], mesta[18], mesta[21], mesta[24], mesta[25], mesta[33], mesta[34], mesta[35], mesta[38], mesta[39], mesta[42], mesta[43], mesta[44], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[16], mesta[17], mesta[19], mesta[20], mesta[21], mesta[22], mesta[23], mesta[26], mesta[29], mesta[30], mesta[31], mesta[33], mesta[34], mesta[37], mesta[38], mesta[40], mesta[41], mesta[42], mesta[45]},
                new Druga.Mesto[]{mesta[3], mesta[15], mesta[25], mesta[32]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[8]},
                new Druga.Mesto[]{mesta[0], mesta[4], mesta[13], mesta[15], mesta[21], mesta[39], mesta[43]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5], mesta[7], mesta[10], mesta[12], mesta[19], mesta[23], mesta[29], mesta[31], mesta[34], mesta[36]},
                new Druga.Mesto[]{mesta[6], mesta[11], mesta[14], mesta[15], mesta[16], mesta[18], mesta[25], mesta[27], mesta[28], mesta[32], mesta[33], mesta[37], mesta[42], mesta[44]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[5], mesta[6], mesta[7], mesta[8], mesta[10], mesta[12], mesta[14], mesta[16], mesta[17], mesta[24], mesta[26], mesta[27], mesta[30], mesta[33], mesta[34], mesta[36], mesta[37], mesta[45]},
                new Druga.Mesto[]{mesta[4], mesta[9], mesta[11], mesta[21], mesta[25], mesta[32], mesta[39], mesta[41], mesta[42]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[5], mesta[7], mesta[10], mesta[16], mesta[17], mesta[22], mesta[23], mesta[26], mesta[27], mesta[31], mesta[34], mesta[35], mesta[38], mesta[40], mesta[45]},
                new Druga.Mesto[]{mesta[3], mesta[9], mesta[11], mesta[13], mesta[32], mesta[37], mesta[41], mesta[44]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[5], mesta[7], mesta[12], mesta[24], mesta[26], mesta[34], mesta[36]},
                new Druga.Mesto[]{mesta[1], mesta[14], mesta[28], mesta[32]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[12]},
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[4], mesta[7], mesta[8], mesta[10], mesta[11], mesta[13], mesta[14], mesta[15], mesta[16], mesta[18], mesta[19], mesta[20], mesta[21], mesta[22], mesta[23], mesta[25], mesta[30], mesta[31], mesta[32], mesta[33], mesta[34], mesta[36], mesta[38], mesta[39], mesta[40], mesta[41], mesta[42], mesta[43], mesta[44], mesta[45]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[8], prehodi[9], prehodi[10], prehodi[12], prehodi[17]}, new Druga.Prehod[]{prehodi[0]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[16], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[5], prehodi[7], prehodi[11], prehodi[14], prehodi[15]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[8], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[6], prehodi[11], prehodi[14]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[4], prehodi[5], prehodi[8], prehodi[9], prehodi[11], prehodi[15]}, new Druga.Prehod[]{});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{prehodi[12], prehodi[14], prehodi[17]}, new Druga.Prehod[]{});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[6], prehodi[8], prehodi[10], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[16]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[13]}, new Druga.Prehod[]{prehodi[0], prehodi[11], prehodi[14]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[10], prehodi[17]}, new Druga.Prehod[]{prehodi[3], prehodi[8], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[16]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[10], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[9], prehodi[11], prehodi[12], prehodi[14]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{prehodi[8], prehodi[14], prehodi[15]}, new Druga.Prehod[]{prehodi[0], prehodi[11]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[4], prehodi[7], prehodi[8], prehodi[11], prehodi[13], prehodi[14], prehodi[15]});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[5], prehodi[13], prehodi[14], prehodi[15], prehodi[17]}, new Druga.Prehod[]{prehodi[0]});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[4], prehodi[6], prehodi[10], prehodi[13], prehodi[14], prehodi[16], prehodi[17]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[8], prehodi[9], prehodi[12], prehodi[15], prehodi[17]}, new Druga.Prehod[]{prehodi[0]});
        mesta[14].nastaviPrehode(new Druga.Prehod[]{prehodi[10], prehodi[13], prehodi[16], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[14]});
        mesta[15].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[5], prehodi[11], prehodi[12], prehodi[13], prehodi[17]}, new Druga.Prehod[]{prehodi[0]});
        mesta[16].nastaviPrehode(new Druga.Prehod[]{prehodi[13], prehodi[17]}, new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[11], prehodi[14], prehodi[15]});
        mesta[17].nastaviPrehode(new Druga.Prehod[]{prehodi[3]}, new Druga.Prehod[]{prehodi[0], prehodi[7], prehodi[11], prehodi[14], prehodi[15]});
        mesta[18].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[8], prehodi[10], prehodi[13], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[6]});
        mesta[19].nastaviPrehode(new Druga.Prehod[]{prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[4], prehodi[6], prehodi[8], prehodi[10], prehodi[11], prehodi[13]});
        mesta[20].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[17]}, new Druga.Prehod[]{prehodi[11]});
        mesta[21].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[10], prehodi[12], prehodi[14], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[11]});
        mesta[22].nastaviPrehode(new Druga.Prehod[]{prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[7], prehodi[9], prehodi[11], prehodi[15]});
        mesta[23].nastaviPrehode(new Druga.Prehod[]{prehodi[17]}, new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[8], prehodi[10], prehodi[11], prehodi[13], prehodi[15]});
        mesta[24].nastaviPrehode(new Druga.Prehod[]{prehodi[10]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[4], prehodi[7], prehodi[8], prehodi[14], prehodi[16]});
        mesta[25].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[6], prehodi[10], prehodi[11], prehodi[13], prehodi[14], prehodi[17]}, new Druga.Prehod[]{});
        mesta[26].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[4], prehodi[10], prehodi[11], prehodi[14], prehodi[15], prehodi[16]});
        mesta[27].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[8], prehodi[13]}, new Druga.Prehod[]{prehodi[14], prehodi[15]});
        mesta[28].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[5], prehodi[13], prehodi[16]}, new Druga.Prehod[]{prehodi[0]});
        mesta[29].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[6], prehodi[7], prehodi[11], prehodi[13]});
        mesta[30].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[6], prehodi[7], prehodi[11], prehodi[14]});
        mesta[31].nastaviPrehode(new Druga.Prehod[]{prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[4], prehodi[6], prehodi[11], prehodi[13], prehodi[15]});
        mesta[32].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[5], prehodi[7], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[16], prehodi[17]}, new Druga.Prehod[]{});
        mesta[33].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[10], prehodi[13], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[7], prehodi[11], prehodi[14]});
        mesta[34].nastaviPrehode(new Druga.Prehod[]{prehodi[10], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[6], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[16]});
        mesta[35].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[10]}, new Druga.Prehod[]{prehodi[8], prehodi[9], prehodi[15]});
        mesta[36].nastaviPrehode(new Druga.Prehod[]{prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[6], prehodi[10], prehodi[13], prehodi[14], prehodi[16]});
        mesta[37].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[8], prehodi[13], prehodi[15]}, new Druga.Prehod[]{prehodi[7], prehodi[9], prehodi[11], prehodi[14]});
        mesta[38].nastaviPrehode(new Druga.Prehod[]{prehodi[10], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[4], prehodi[5], prehodi[8], prehodi[11], prehodi[15]});
        mesta[39].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[6], prehodi[8], prehodi[10], prehodi[12], prehodi[14], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[9]});
        mesta[40].nastaviPrehode(new Druga.Prehod[]{prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[6], prehodi[11], prehodi[15]});
        mesta[41].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[8], prehodi[14], prehodi[15], prehodi[17]}, new Druga.Prehod[]{prehodi[9], prehodi[11]});
        mesta[42].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[10], prehodi[13], prehodi[14], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[5], prehodi[7], prehodi[11]});
        mesta[43].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[10], prehodi[12], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[7]});
        mesta[44].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[6], prehodi[10], prehodi[13], prehodi[15], prehodi[17]}, new Druga.Prehod[]{prehodi[0]});
        mesta[45].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[10], prehodi[17]}, new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[6], prehodi[7], prehodi[9], prehodi[11], prehodi[14], prehodi[15]});

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
