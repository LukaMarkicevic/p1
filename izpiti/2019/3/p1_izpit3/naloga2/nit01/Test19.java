
public class Test19 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(2),
            new Druga.Mesto(4),
            new Druga.Mesto(6),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(5),
            new Druga.Mesto(6),
            new Druga.Mesto(4),
            new Druga.Mesto(8),
            new Druga.Mesto(3),
            new Druga.Mesto(4),
            new Druga.Mesto(5),
            new Druga.Mesto(3),
            new Druga.Mesto(7),
            new Druga.Mesto(7),
            new Druga.Mesto(3),
            new Druga.Mesto(0),
            new Druga.Mesto(6),
            new Druga.Mesto(3),
            new Druga.Mesto(7),
            new Druga.Mesto(7),
            new Druga.Mesto(2),
            new Druga.Mesto(8),
            new Druga.Mesto(1),
            new Druga.Mesto(8),
            new Druga.Mesto(5),
            new Druga.Mesto(6),
            new Druga.Mesto(5),
            new Druga.Mesto(7),
            new Druga.Mesto(3),
            new Druga.Mesto(1),
            new Druga.Mesto(7),
            new Druga.Mesto(2),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(0),
            new Druga.Mesto(6),
            new Druga.Mesto(6),
            new Druga.Mesto(1),
            new Druga.Mesto(4),
            new Druga.Mesto(1),
            new Druga.Mesto(1),
            new Druga.Mesto(6),
            new Druga.Mesto(6),
            new Druga.Mesto(3),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[3], mesta[6], mesta[7], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[18], mesta[19], mesta[21], mesta[22], mesta[23], mesta[24], mesta[26], mesta[27], mesta[29], mesta[30], mesta[33], mesta[35], mesta[36], mesta[38], mesta[42], mesta[45], mesta[46]},
                new Druga.Mesto[]{mesta[8], mesta[17]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[4], mesta[9], mesta[11], mesta[12], mesta[14], mesta[15], mesta[16], mesta[18], mesta[19], mesta[20], mesta[26], mesta[27], mesta[28], mesta[30], mesta[33], mesta[35], mesta[36], mesta[37], mesta[42], mesta[43], mesta[46]},
                new Druga.Mesto[]{mesta[3], mesta[5], mesta[7], mesta[8], mesta[31], mesta[34]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[12], mesta[13], mesta[36]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[7], mesta[11], mesta[17], mesta[18], mesta[25], mesta[30], mesta[31], mesta[34], mesta[37]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[13], mesta[15], mesta[21], mesta[23], mesta[29], mesta[36], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[5], mesta[8], mesta[10], mesta[17], mesta[24], mesta[27], mesta[30], mesta[34], mesta[35], mesta[37], mesta[40], mesta[42]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[19], mesta[22]},
                new Druga.Mesto[]{mesta[0], mesta[4], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[14], mesta[17], mesta[18], mesta[25], mesta[27], mesta[28], mesta[30], mesta[31], mesta[35], mesta[38], mesta[39], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[11], mesta[12], mesta[14], mesta[15], mesta[20], mesta[21], mesta[22], mesta[32], mesta[35], mesta[36], mesta[46]},
                new Druga.Mesto[]{mesta[3], mesta[8], mesta[9], mesta[10], mesta[17], mesta[27], mesta[38]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[12], mesta[13], mesta[20], mesta[29], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[4], mesta[6], mesta[9], mesta[10], mesta[11], mesta[15], mesta[17], mesta[18], mesta[22], mesta[23], mesta[24], mesta[28], mesta[30], mesta[32], mesta[34], mesta[35], mesta[37], mesta[38], mesta[40], mesta[41]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[4], mesta[11], mesta[14], mesta[18], mesta[19], mesta[20], mesta[22], mesta[23], mesta[25], mesta[26], mesta[27], mesta[29], mesta[30], mesta[33], mesta[36], mesta[42], mesta[43], mesta[45]},
                new Druga.Mesto[]{mesta[17]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[20], mesta[21], mesta[26], mesta[29], mesta[46]},
                new Druga.Mesto[]{mesta[9], mesta[16], mesta[17], mesta[28]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[3], mesta[4], mesta[6], mesta[8], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[15], mesta[16], mesta[18], mesta[19], mesta[21], mesta[22], mesta[23], mesta[24], mesta[25], mesta[26], mesta[27], mesta[28], mesta[29], mesta[30], mesta[32], mesta[33], mesta[35], mesta[36], mesta[37], mesta[38], mesta[39], mesta[40], mesta[42], mesta[43], mesta[44], mesta[45], mesta[46]},
                new Druga.Mesto[]{mesta[5], mesta[31]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[40]},
                new Druga.Mesto[]{mesta[31]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[12], mesta[19]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[4], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[14], mesta[17], mesta[18], mesta[24], mesta[25], mesta[27], mesta[28], mesta[30], mesta[31], mesta[33], mesta[34], mesta[35], mesta[38], mesta[39], mesta[40], mesta[41], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[13], mesta[15], mesta[21], mesta[22], mesta[23], mesta[24], mesta[29], mesta[35], mesta[41], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[8], mesta[9], mesta[17], mesta[28], mesta[31], mesta[34], mesta[39]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1]},
                new Druga.Mesto[]{mesta[3], mesta[4], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[11], mesta[14], mesta[16], mesta[17], mesta[18], mesta[19], mesta[21], mesta[22], mesta[23], mesta[24], mesta[25], mesta[27], mesta[28], mesta[30], mesta[31], mesta[33], mesta[34], mesta[35], mesta[37], mesta[38], mesta[39], mesta[40], mesta[41], mesta[42], mesta[43], mesta[44], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[11], mesta[12], mesta[15], mesta[16], mesta[20], mesta[21], mesta[23], mesta[26], mesta[29], mesta[36], mesta[37], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[4], mesta[10], mesta[27], mesta[30], mesta[31], mesta[33], mesta[34], mesta[39], mesta[40], mesta[41], mesta[42], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[13], mesta[16], mesta[19], mesta[22], mesta[26], mesta[37], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[4], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[17], mesta[18], mesta[25], mesta[27], mesta[30], mesta[31], mesta[34], mesta[38], mesta[39], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[11], mesta[13], mesta[15], mesta[16], mesta[19], mesta[21], mesta[23], mesta[26], mesta[36], mesta[37], mesta[46]},
                new Druga.Mesto[]{mesta[9], mesta[35], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[11], mesta[13], mesta[15], mesta[16], mesta[20], mesta[21], mesta[22], mesta[23], mesta[29], mesta[32], mesta[33], mesta[35]},
                new Druga.Mesto[]{mesta[3], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[14], mesta[18], mesta[25], mesta[27], mesta[30], mesta[31], mesta[34], mesta[39], mesta[40], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[7], mesta[11], mesta[12], mesta[13], mesta[15], mesta[18], mesta[21], mesta[22], mesta[25], mesta[26], mesta[27], mesta[28], mesta[29], mesta[30], mesta[32], mesta[35], mesta[38], mesta[40], mesta[41], mesta[43], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[5], mesta[17], mesta[34]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[12], mesta[36]},
                new Druga.Mesto[]{mesta[0], mesta[4], mesta[9], mesta[17], mesta[24], mesta[25], mesta[29], mesta[38], mesta[43]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[13], mesta[15], mesta[21], mesta[22], mesta[32], mesta[35], mesta[43], mesta[44]},
                new Druga.Mesto[]{mesta[18], mesta[34], mesta[40]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[12], mesta[13], mesta[15], mesta[20], mesta[21], mesta[26], mesta[29], mesta[36], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[5], mesta[6], mesta[7], mesta[9], mesta[11], mesta[16], mesta[17], mesta[24], mesta[28], mesta[31], mesta[37], mesta[38], mesta[39], mesta[42]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[3], mesta[4], mesta[5], mesta[6], mesta[7], mesta[8], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[16], mesta[17], mesta[18], mesta[19], mesta[20], mesta[21], mesta[22], mesta[23], mesta[24], mesta[25], mesta[26], mesta[27], mesta[28], mesta[29], mesta[30], mesta[32], mesta[33], mesta[34], mesta[35], mesta[36], mesta[37], mesta[38], mesta[39], mesta[40], mesta[41], mesta[42], mesta[43], mesta[44], mesta[45]},
                new Druga.Mesto[]{mesta[31]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[24], mesta[36]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[4], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[14], mesta[18], mesta[25], mesta[27], mesta[28], mesta[30], mesta[31], mesta[35], mesta[38], mesta[39], mesta[40], mesta[41], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[16], mesta[20], mesta[22], mesta[25], mesta[26], mesta[29], mesta[30], mesta[32], mesta[33], mesta[35], mesta[36], mesta[43], mesta[44], mesta[45], mesta[46]},
                new Druga.Mesto[]{mesta[5], mesta[6], mesta[7], mesta[8], mesta[10], mesta[17], mesta[27], mesta[28], mesta[38], mesta[39], mesta[40], mesta[42]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[13], mesta[16], mesta[23], mesta[46]},
                new Druga.Mesto[]{mesta[3], mesta[4], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[11], mesta[14], mesta[17], mesta[18], mesta[19], mesta[22], mesta[25], mesta[27], mesta[30], mesta[31], mesta[34], mesta[35], mesta[37], mesta[38], mesta[39], mesta[40], mesta[41], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[12], mesta[13], mesta[15], mesta[20], mesta[21], mesta[23], mesta[26], mesta[29], mesta[36], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[7], mesta[8], mesta[10], mesta[11], mesta[14], mesta[16], mesta[19], mesta[25], mesta[27], mesta[32], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1]},
                new Druga.Mesto[]{mesta[3], mesta[6], mesta[8], mesta[9], mesta[10], mesta[13], mesta[14], mesta[18], mesta[19], mesta[20], mesta[21], mesta[22], mesta[24], mesta[26], mesta[28], mesta[30], mesta[33], mesta[36], mesta[39], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2]},
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[3], mesta[4], mesta[6], mesta[8], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[16], mesta[17], mesta[20], mesta[21], mesta[22], mesta[23], mesta[25], mesta[27], mesta[29], mesta[32], mesta[33], mesta[35], mesta[36], mesta[37], mesta[39], mesta[40], mesta[42], mesta[43], mesta[44], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[12], mesta[13], mesta[20], mesta[29], mesta[36]},
                new Druga.Mesto[]{mesta[30], mesta[34], mesta[38], mesta[45]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[4], prehodi[6], prehodi[11], prehodi[15], prehodi[19], prehodi[21], prehodi[23], prehodi[26], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[7], prehodi[9], prehodi[12], prehodi[17], prehodi[18], prehodi[22], prehodi[24]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[5], prehodi[7], prehodi[8], prehodi[9], prehodi[12], prehodi[13], prehodi[16], prehodi[17], prehodi[19], prehodi[21], prehodi[22], prehodi[23], prehodi[24], prehodi[26], prehodi[27]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[5], prehodi[7], prehodi[8], prehodi[9], prehodi[12], prehodi[14], prehodi[16], prehodi[17], prehodi[18], prehodi[19], prehodi[20], prehodi[21], prehodi[22], prehodi[23], prehodi[24], prehodi[25], prehodi[26], prehodi[28]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[5], prehodi[6], prehodi[11], prehodi[13], prehodi[15], prehodi[17], prehodi[23], prehodi[25], prehodi[26], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[9], prehodi[22]});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[6], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[19], prehodi[23], prehodi[25], prehodi[28]}, new Druga.Prehod[]{prehodi[1], prehodi[7], prehodi[9], prehodi[22]});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[4], prehodi[9], prehodi[11], prehodi[15], prehodi[17], prehodi[18], prehodi[21], prehodi[23], prehodi[24], prehodi[25]}, new Druga.Prehod[]{prehodi[22]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[6], prehodi[11], prehodi[13], prehodi[15], prehodi[17], prehodi[21], prehodi[23], prehodi[24], prehodi[25], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[9], prehodi[22]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[4], prehodi[11], prehodi[13], prehodi[15], prehodi[17], prehodi[21], prehodi[23], prehodi[24], prehodi[25], prehodi[26]}, new Druga.Prehod[]{prehodi[0], prehodi[18], prehodi[22]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[4], prehodi[5], prehodi[11], prehodi[12], prehodi[13], prehodi[15], prehodi[17], prehodi[23], prehodi[24], prehodi[25], prehodi[26], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[9], prehodi[22]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[5], prehodi[6], prehodi[8], prehodi[11], prehodi[12], prehodi[13], prehodi[15], prehodi[16], prehodi[17], prehodi[19], prehodi[21], prehodi[23], prehodi[25], prehodi[27]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[9]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5], prehodi[6], prehodi[11], prehodi[13], prehodi[14], prehodi[17], prehodi[23], prehodi[24], prehodi[25], prehodi[26], prehodi[27]}, new Druga.Prehod[]{prehodi[0], prehodi[9], prehodi[22]});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[6], prehodi[13], prehodi[21], prehodi[25], prehodi[26], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[5], prehodi[7], prehodi[9], prehodi[14], prehodi[16], prehodi[17], prehodi[18], prehodi[22], prehodi[24]});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[5], prehodi[6], prehodi[9], prehodi[11], prehodi[14], prehodi[18], prehodi[19], prehodi[21], prehodi[22], prehodi[24], prehodi[26], prehodi[29]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[6], prehodi[9], prehodi[12], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[20], prehodi[21], prehodi[22], prehodi[24], prehodi[25], prehodi[26], prehodi[29]});
        mesta[14].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[11], prehodi[13], prehodi[17], prehodi[23], prehodi[25], prehodi[26], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[5], prehodi[7], prehodi[22], prehodi[24]});
        mesta[15].nastaviPrehode(new Druga.Prehod[]{prehodi[6], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[5], prehodi[9], prehodi[12], prehodi[14], prehodi[16], prehodi[17], prehodi[18], prehodi[20], prehodi[21], prehodi[22], prehodi[24], prehodi[26]});
        mesta[16].nastaviPrehode(new Druga.Prehod[]{prehodi[8], prehodi[13], prehodi[21], prehodi[26], prehodi[28]}, new Druga.Prehod[]{prehodi[1], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[17], prehodi[22], prehodi[24], prehodi[25]});
        mesta[17].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[4], prehodi[5], prehodi[6], prehodi[7], prehodi[8], prehodi[11], prehodi[12], prehodi[13], prehodi[15], prehodi[18], prehodi[19], prehodi[21], prehodi[24], prehodi[25], prehodi[28]}, new Druga.Prehod[]{prehodi[22]});
        mesta[18].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[4], prehodi[6], prehodi[11], prehodi[13], prehodi[15], prehodi[17], prehodi[20], prehodi[23], prehodi[25], prehodi[27]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[9], prehodi[18], prehodi[22]});
        mesta[19].nastaviPrehode(new Druga.Prehod[]{prehodi[13], prehodi[25], prehodi[26], prehodi[27]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[4], prehodi[7], prehodi[9], prehodi[11], prehodi[15], prehodi[16], prehodi[22]});
        mesta[20].nastaviPrehode(new Druga.Prehod[]{prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[1], prehodi[5], prehodi[6], prehodi[7], prehodi[8], prehodi[14], prehodi[17], prehodi[21], prehodi[22], prehodi[24], prehodi[26], prehodi[29]});
        mesta[21].nastaviPrehode(new Druga.Prehod[]{prehodi[13], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[5], prehodi[8], prehodi[9], prehodi[12], prehodi[14], prehodi[16], prehodi[17], prehodi[18], prehodi[20], prehodi[21], prehodi[22], prehodi[26]});
        mesta[22].nastaviPrehode(new Druga.Prehod[]{prehodi[6], prehodi[13], prehodi[25], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[5], prehodi[7], prehodi[9], prehodi[12], prehodi[15], prehodi[17], prehodi[18], prehodi[20], prehodi[22], prehodi[24]});
        mesta[23].nastaviPrehode(new Druga.Prehod[]{prehodi[6], prehodi[13], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[7], prehodi[9], prehodi[12], prehodi[14], prehodi[16], prehodi[17], prehodi[22], prehodi[25], prehodi[26]});
        mesta[24].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[6], prehodi[11], prehodi[13], prehodi[19], prehodi[21], prehodi[27]}, new Druga.Prehod[]{prehodi[0], prehodi[9], prehodi[12], prehodi[22], prehodi[23]});
        mesta[25].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[4], prehodi[11], prehodi[13], prehodi[15], prehodi[17], prehodi[19], prehodi[23], prehodi[25], prehodi[26], prehodi[28]}, new Druga.Prehod[]{prehodi[7], prehodi[9], prehodi[18], prehodi[22], prehodi[24]});
        mesta[26].nastaviPrehode(new Druga.Prehod[]{prehodi[27]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[8], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[21], prehodi[22], prehodi[24], prehodi[26]});
        mesta[27].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[5], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[17], prehodi[23], prehodi[24], prehodi[25], prehodi[26], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[9], prehodi[18], prehodi[22]});
        mesta[28].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[6], prehodi[8], prehodi[11], prehodi[12], prehodi[13], prehodi[21], prehodi[23], prehodi[24], prehodi[27]}, new Druga.Prehod[]{prehodi[1], prehodi[9], prehodi[18], prehodi[22]});
        mesta[29].nastaviPrehode(new Druga.Prehod[]{prehodi[19], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[3], prehodi[6], prehodi[7], prehodi[8], prehodi[9], prehodi[12], prehodi[14], prehodi[17], prehodi[18], prehodi[21], prehodi[22], prehodi[24], prehodi[26], prehodi[29]});
        mesta[30].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[4], prehodi[6], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[17], prehodi[23], prehodi[25], prehodi[27], prehodi[29]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[9], prehodi[18], prehodi[22], prehodi[24]});
        mesta[31].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[4], prehodi[9], prehodi[10], prehodi[11], prehodi[12], prehodi[13], prehodi[14], prehodi[15], prehodi[17], prehodi[21], prehodi[22], prehodi[23], prehodi[25]}, new Druga.Prehod[]{});
        mesta[32].nastaviPrehode(new Druga.Prehod[]{prehodi[6], prehodi[26], prehodi[28]}, new Druga.Prehod[]{prehodi[5], prehodi[9], prehodi[17], prehodi[18], prehodi[20], prehodi[22], prehodi[24]});
        mesta[33].nastaviPrehode(new Druga.Prehod[]{prehodi[11], prehodi[13], prehodi[14], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[9], prehodi[17], prehodi[22], prehodi[24]});
        mesta[34].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[6], prehodi[11], prehodi[12], prehodi[13], prehodi[14], prehodi[15], prehodi[17], prehodi[18], prehodi[20], prehodi[25], prehodi[29]}, new Druga.Prehod[]{prehodi[22]});
        mesta[35].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[6], prehodi[11], prehodi[13], prehodi[16], prehodi[23], prehodi[25], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[5], prehodi[9], prehodi[12], prehodi[17], prehodi[18], prehodi[20], prehodi[22], prehodi[24]});
        mesta[36].nastaviPrehode(new Druga.Prehod[]{prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[3], prehodi[5], prehodi[7], prehodi[9], prehodi[14], prehodi[16], prehodi[19], prehodi[21], prehodi[22], prehodi[23], prehodi[24], prehodi[26], prehodi[29]});
        mesta[37].nastaviPrehode(new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[6], prehodi[13], prehodi[21], prehodi[25], prehodi[28]}, new Druga.Prehod[]{prehodi[1], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[22]});
        mesta[38].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[5], prehodi[6], prehodi[11], prehodi[13], prehodi[15], prehodi[19], prehodi[21], prehodi[23], prehodi[24], prehodi[25], prehodi[29]}, new Druga.Prehod[]{prehodi[0], prehodi[9], prehodi[18], prehodi[22]});
        mesta[39].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[11], prehodi[12], prehodi[13], prehodi[14], prehodi[15], prehodi[17], prehodi[21], prehodi[23], prehodi[24], prehodi[25], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[9], prehodi[22]});
        mesta[40].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[6], prehodi[11], prehodi[13], prehodi[14], prehodi[17], prehodi[20], prehodi[23], prehodi[24], prehodi[25], prehodi[28]}, new Druga.Prehod[]{prehodi[9], prehodi[10], prehodi[18], prehodi[22]});
        mesta[41].nastaviPrehode(new Druga.Prehod[]{prehodi[6], prehodi[11], prehodi[13], prehodi[14], prehodi[23], prehodi[25]}, new Druga.Prehod[]{prehodi[12], prehodi[18], prehodi[22]});
        mesta[42].nastaviPrehode(new Druga.Prehod[]{prehodi[3], prehodi[4], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[17], prehodi[21], prehodi[23], prehodi[24], prehodi[25], prehodi[26], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[9], prehodi[22]});
        mesta[43].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[11], prehodi[13], prehodi[15], prehodi[16], prehodi[17], prehodi[19], prehodi[23], prehodi[25], prehodi[26], prehodi[27], prehodi[28]}, new Druga.Prehod[]{prehodi[1], prehodi[7], prehodi[9], prehodi[18], prehodi[20], prehodi[22], prehodi[24]});
        mesta[44].nastaviPrehode(new Druga.Prehod[]{prehodi[13], prehodi[28]}, new Druga.Prehod[]{prehodi[6], prehodi[9], prehodi[12], prehodi[14], prehodi[18], prehodi[20], prehodi[21], prehodi[22], prehodi[24], prehodi[26]});
        mesta[45].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[11], prehodi[13], prehodi[14], prehodi[15], prehodi[16], prehodi[17], prehodi[23], prehodi[25], prehodi[26], prehodi[27], prehodi[28], prehodi[29]}, new Druga.Prehod[]{prehodi[0], prehodi[7], prehodi[9], prehodi[22], prehodi[24]});
        mesta[46].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[5], prehodi[6], prehodi[8], prehodi[9], prehodi[12], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[21], prehodi[24], prehodi[25], prehodi[26]});

        Druga.Mreza mreza = new Druga.Mreza(mesta, prehodi);

        prehodi[27].sprozi();
        prehodi[26].sprozi();
        prehodi[8].sprozi();
        prehodi[4].sprozi();
        prehodi[8].sprozi();
        prehodi[28].sprozi();
        prehodi[17].sprozi();
        prehodi[20].sprozi();
        prehodi[29].sprozi();
        prehodi[11].sprozi();

        for (int i = 0;  i < mesta.length;  i++) {
            System.out.println(mesta[i].vrniStZetonov());
        }
    }
}
