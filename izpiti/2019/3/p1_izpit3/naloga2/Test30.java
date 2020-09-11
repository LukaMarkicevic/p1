
public class Test30 {

    public static void main(String[] args) {
        Druga.Mesto[] mesta = {
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(2),
            new Druga.Mesto(3),
            new Druga.Mesto(4),
            new Druga.Mesto(5),
            new Druga.Mesto(6),
            new Druga.Mesto(5),
            new Druga.Mesto(6),
            new Druga.Mesto(5),
            new Druga.Mesto(4),
            new Druga.Mesto(2),
            new Druga.Mesto(6),
            new Druga.Mesto(3),
            new Druga.Mesto(6),
            new Druga.Mesto(5),
            new Druga.Mesto(4),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(1),
            new Druga.Mesto(0),
            new Druga.Mesto(3),
            new Druga.Mesto(1),
            new Druga.Mesto(6),
            new Druga.Mesto(3),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(0),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(2),
            new Druga.Mesto(5),
            new Druga.Mesto(5),
            new Druga.Mesto(0),
            new Druga.Mesto(0),
            new Druga.Mesto(4),
            new Druga.Mesto(3),
            new Druga.Mesto(3),
            new Druga.Mesto(0),
            new Druga.Mesto(1),
            new Druga.Mesto(1),
            new Druga.Mesto(3),
            new Druga.Mesto(2),
            new Druga.Mesto(5),
            new Druga.Mesto(6),
            new Druga.Mesto(1),
        };

        Druga.Prehod[] prehodi = {
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[3], mesta[6], mesta[38], mesta[41]},
                new Druga.Mesto[]{mesta[2], mesta[5], mesta[7], mesta[9], mesta[10], mesta[11], mesta[12], mesta[14], mesta[15], mesta[16], mesta[17], mesta[18], mesta[20], mesta[24], mesta[27], mesta[28], mesta[30], mesta[31], mesta[32], mesta[34], mesta[35], mesta[37], mesta[39], mesta[40], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[3], mesta[6], mesta[9], mesta[15], mesta[18], mesta[20], mesta[21], mesta[27], mesta[33], mesta[38], mesta[41], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[4], mesta[5], mesta[7], mesta[8], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[17], mesta[19], mesta[22], mesta[23], mesta[25], mesta[26], mesta[28], mesta[29], mesta[30], mesta[31], mesta[34], mesta[35], mesta[36], mesta[39], mesta[40], mesta[42], mesta[44]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[5], mesta[6], mesta[8], mesta[9], mesta[11], mesta[12], mesta[15], mesta[16], mesta[18], mesta[19], mesta[20], mesta[21], mesta[22], mesta[24], mesta[25], mesta[26], mesta[27], mesta[28], mesta[29], mesta[30], mesta[31], mesta[33], mesta[35], mesta[36], mesta[38], mesta[39], mesta[41], mesta[42], mesta[44], mesta[45], mesta[46]},
                new Druga.Mesto[]{mesta[7], mesta[10], mesta[23], mesta[32], mesta[37], mesta[43]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[5], mesta[12], mesta[16], mesta[19], mesta[22], mesta[25], mesta[26], mesta[27], mesta[35], mesta[36], mesta[39], mesta[41], mesta[42], mesta[44]},
                new Druga.Mesto[]{mesta[7], mesta[13], mesta[17], mesta[23], mesta[31], mesta[34], mesta[37]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[3], mesta[9], mesta[18], mesta[27], mesta[41]},
                new Druga.Mesto[]{mesta[0], mesta[4], mesta[8], mesta[12], mesta[13], mesta[14], mesta[15], mesta[16], mesta[19], mesta[21], mesta[22], mesta[26], mesta[28], mesta[29], mesta[31], mesta[36], mesta[40], mesta[42]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[3], mesta[6], mesta[8], mesta[9], mesta[11], mesta[16], mesta[18], mesta[19], mesta[21], mesta[22], mesta[25], mesta[26], mesta[29], mesta[30], mesta[33], mesta[36], mesta[38], mesta[40], mesta[41]},
                new Druga.Mesto[]{mesta[4], mesta[7], mesta[10], mesta[13], mesta[14], mesta[17], mesta[23], mesta[24], mesta[32], mesta[34], mesta[37]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[3], mesta[6], mesta[8], mesta[9], mesta[12], mesta[19], mesta[21], mesta[29], mesta[40], mesta[45]},
                new Druga.Mesto[]{mesta[31], mesta[42], mesta[43]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[3], mesta[38], mesta[41]},
                new Druga.Mesto[]{mesta[0], mesta[2], mesta[4], mesta[5], mesta[6], mesta[7], mesta[8], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[17], mesta[19], mesta[21], mesta[22], mesta[23], mesta[25], mesta[26], mesta[27], mesta[28], mesta[29], mesta[31], mesta[32], mesta[34], mesta[35], mesta[37], mesta[39], mesta[40], mesta[42], mesta[43], mesta[44], mesta[46]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[6], mesta[18]},
                new Druga.Mesto[]{mesta[19], mesta[46]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[9], mesta[18], mesta[27], mesta[33], mesta[38], mesta[41]},
                new Druga.Mesto[]{mesta[1], mesta[4], mesta[5], mesta[7], mesta[8], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[17], mesta[19], mesta[21], mesta[22], mesta[25], mesta[26], mesta[28], mesta[29], mesta[31], mesta[32], mesta[34], mesta[35], mesta[40], mesta[42], mesta[44], mesta[45], mesta[46]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[5], mesta[6], mesta[9], mesta[11], mesta[12], mesta[15], mesta[16], mesta[18], mesta[19], mesta[20], mesta[21], mesta[25], mesta[27], mesta[29], mesta[39], mesta[40], mesta[41], mesta[44], mesta[45]},
                new Druga.Mesto[]{mesta[4]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[3], mesta[6], mesta[7], mesta[9], mesta[11], mesta[12], mesta[13], mesta[16], mesta[18], mesta[20], mesta[21], mesta[25], mesta[26], mesta[28], mesta[29], mesta[33], mesta[38], mesta[43], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[10], mesta[14], mesta[17], mesta[34]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[0], mesta[3], mesta[5], mesta[6], mesta[8], mesta[12], mesta[16], mesta[18], mesta[19], mesta[21], mesta[22], mesta[24], mesta[25], mesta[28], mesta[31], mesta[35], mesta[36], mesta[38], mesta[41], mesta[42], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[10], mesta[17], mesta[34], mesta[43]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[29]},
                new Druga.Mesto[]{mesta[4], mesta[7], mesta[37], mesta[43]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[18]},
                new Druga.Mesto[]{mesta[0], mesta[1], mesta[2], mesta[4], mesta[5], mesta[7], mesta[8], mesta[9], mesta[10], mesta[11], mesta[12], mesta[13], mesta[14], mesta[15], mesta[17], mesta[19], mesta[20], mesta[21], mesta[22], mesta[23], mesta[24], mesta[25], mesta[26], mesta[29], mesta[30], mesta[31], mesta[32], mesta[33], mesta[34], mesta[35], mesta[36], mesta[37], mesta[39], mesta[40], mesta[42], mesta[43], mesta[44], mesta[45], mesta[46]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[3], mesta[6], mesta[9], mesta[12], mesta[15], mesta[16], mesta[18], mesta[19], mesta[21], mesta[26], mesta[27], mesta[33], mesta[38], mesta[41], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[4], mesta[5], mesta[7], mesta[8], mesta[10], mesta[11], mesta[13], mesta[14], mesta[17], mesta[22], mesta[23], mesta[24], mesta[25], mesta[28], mesta[29], mesta[30], mesta[31], mesta[32], mesta[34], mesta[35], mesta[36], mesta[39], mesta[40], mesta[42], mesta[43], mesta[44], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[3], mesta[5], mesta[6], mesta[9], mesta[12], mesta[15], mesta[16], mesta[19], mesta[20], mesta[21], mesta[25], mesta[26], mesta[33], mesta[38], mesta[41], mesta[46]},
                new Druga.Mesto[]{mesta[4], mesta[7], mesta[8], mesta[10], mesta[11], mesta[13], mesta[14], mesta[17], mesta[22], mesta[23], mesta[24], mesta[28], mesta[31], mesta[32], mesta[34], mesta[35], mesta[36], mesta[37], mesta[39], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[3], mesta[6], mesta[9], mesta[12], mesta[15], mesta[16], mesta[18], mesta[20], mesta[21], mesta[27], mesta[33], mesta[38], mesta[41], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[5], mesta[17], mesta[24], mesta[30], mesta[35], mesta[36], mesta[39]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[3], mesta[9], mesta[12], mesta[15], mesta[18], mesta[19], mesta[20], mesta[21], mesta[25], mesta[26], mesta[27], mesta[29], mesta[33], mesta[38], mesta[41], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[4], mesta[7], mesta[8], mesta[10], mesta[11], mesta[13], mesta[14], mesta[17], mesta[22], mesta[23], mesta[24], mesta[28], mesta[30], mesta[31], mesta[32], mesta[34], mesta[36], mesta[37], mesta[40], mesta[42], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[2], mesta[3], mesta[6], mesta[9], mesta[18], mesta[20], mesta[27], mesta[38], mesta[41]},
                new Druga.Mesto[]{mesta[1], mesta[7], mesta[8], mesta[10], mesta[11], mesta[12], mesta[14], mesta[16], mesta[17], mesta[22], mesta[23], mesta[24], mesta[26], mesta[28], mesta[29], mesta[30], mesta[31], mesta[32], mesta[35], mesta[39], mesta[40], mesta[43], mesta[45]}
            ),
            new Druga.Prehod(
                new Druga.Mesto[]{mesta[1], mesta[2], mesta[3], mesta[5], mesta[8], mesta[9], mesta[11], mesta[18], mesta[20], mesta[21], mesta[25], mesta[29], mesta[33], mesta[35], mesta[44], mesta[46]},
                new Druga.Mesto[]{mesta[0], mesta[14], mesta[17], mesta[22], mesta[23], mesta[24], mesta[28], mesta[30], mesta[31], mesta[32], mesta[40], mesta[42], mesta[43], mesta[45]}
            ),
        };

        mesta[0].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[7], prehodi[14], prehodi[15], prehodi[17], prehodi[18], prehodi[20]}, new Druga.Prehod[]{prehodi[2], prehodi[6], prehodi[12]});
        mesta[1].nastaviPrehode(new Druga.Prehod[]{prehodi[9], prehodi[14], prehodi[19]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[5], prehodi[10], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[20]});
        mesta[2].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[7], prehodi[14]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[6], prehodi[9], prehodi[10], prehodi[11], prehodi[15], prehodi[17], prehodi[18], prehodi[19], prehodi[20]});
        mesta[3].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[4], prehodi[5], prehodi[6], prehodi[7], prehodi[11], prehodi[12], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[19], prehodi[20]});
        mesta[4].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[5], prehodi[7], prehodi[9], prehodi[10], prehodi[13], prehodi[14], prehodi[15], prehodi[16], prehodi[18]}, new Druga.Prehod[]{});
        mesta[5].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[17]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[10], prehodi[12], prehodi[16], prehodi[20]});
        mesta[6].nastaviPrehode(new Druga.Prehod[]{prehodi[7]}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[5], prehodi[6], prehodi[8], prehodi[10], prehodi[11], prehodi[12], prehodi[15], prehodi[16], prehodi[17], prehodi[19]});
        mesta[7].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[3], prehodi[5], prehodi[7], prehodi[9], prehodi[13], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19]}, new Druga.Prehod[]{prehodi[11]});
        mesta[8].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19]}, new Druga.Prehod[]{prehodi[2], prehodi[5], prehodi[6], prehodi[12], prehodi[20]});
        mesta[9].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[7], prehodi[14]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[4], prehodi[5], prehodi[6], prehodi[9], prehodi[10], prehodi[11], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[19], prehodi[20]});
        mesta[10].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[5], prehodi[7], prehodi[9], prehodi[11], prehodi[12], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19]}, new Druga.Prehod[]{});
        mesta[11].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19]}, new Druga.Prehod[]{prehodi[2], prehodi[5], prehodi[10], prehodi[11], prehodi[20]});
        mesta[12].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[4], prehodi[7], prehodi[9], prehodi[14], prehodi[19]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[6], prehodi[10], prehodi[11], prehodi[12], prehodi[15], prehodi[16], prehodi[17], prehodi[18]});
        mesta[13].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[3], prehodi[4], prehodi[5], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[18]}, new Druga.Prehod[]{prehodi[11]});
        mesta[14].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[4], prehodi[5], prehodi[9], prehodi[11], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{});
        mesta[15].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[9], prehodi[14]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[10], prehodi[15], prehodi[16], prehodi[17], prehodi[18]});
        mesta[16].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[4], prehodi[19]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[5], prehodi[10], prehodi[11], prehodi[12], prehodi[15], prehodi[16], prehodi[17]});
        mesta[17].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[5], prehodi[7], prehodi[9], prehodi[11], prehodi[12], prehodi[14], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{});
        mesta[18].nastaviPrehode(new Druga.Prehod[]{prehodi[0]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[4], prehodi[5], prehodi[8], prehodi[9], prehodi[10], prehodi[11], prehodi[12], prehodi[14], prehodi[15], prehodi[17], prehodi[18], prehodi[19], prehodi[20]});
        mesta[19].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[7], prehodi[8], prehodi[9], prehodi[14]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[5], prehodi[6], prehodi[10], prehodi[12], prehodi[15], prehodi[16], prehodi[18]});
        mesta[20].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[14]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[10], prehodi[11], prehodi[16], prehodi[17], prehodi[18], prehodi[19], prehodi[20]});
        mesta[21].nastaviPrehode(new Druga.Prehod[]{prehodi[4], prehodi[7], prehodi[9], prehodi[14]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[5], prehodi[6], prehodi[10], prehodi[11], prehodi[12], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[20]});
        mesta[22].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[5], prehodi[12]});
        mesta[23].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[5], prehodi[7], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{});
        mesta[24].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[5], prehodi[14], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{prehodi[2], prehodi[12]});
        mesta[25].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[7], prehodi[9], prehodi[14], prehodi[15]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[5], prehodi[10], prehodi[11], prehodi[12], prehodi[16], prehodi[18], prehodi[20]});
        mesta[26].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[7], prehodi[9], prehodi[14], prehodi[19]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[5], prehodi[11], prehodi[15], prehodi[16], prehodi[18]});
        mesta[27].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[7]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[3], prehodi[4], prehodi[9], prehodi[10], prehodi[15], prehodi[17], prehodi[18], prehodi[19]});
        mesta[28].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[4], prehodi[7], prehodi[9], prehodi[15], prehodi[16], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{prehodi[2], prehodi[11], prehodi[12]});
        mesta[29].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[19]}, new Druga.Prehod[]{prehodi[2], prehodi[5], prehodi[6], prehodi[10], prehodi[11], prehodi[13], prehodi[18], prehodi[20]});
        mesta[30].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[14], prehodi[15], prehodi[17], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{prehodi[2], prehodi[5]});
        mesta[31].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[4], prehodi[6], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{prehodi[2], prehodi[12]});
        mesta[32].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[5], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{});
        mesta[33].nastaviPrehode(new Druga.Prehod[]{prehodi[14]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[5], prehodi[9], prehodi[11], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[20]});
        mesta[34].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[3], prehodi[5], prehodi[7], prehodi[9], prehodi[11], prehodi[12], prehodi[14], prehodi[15], prehodi[16], prehodi[18]}, new Druga.Prehod[]{});
        mesta[35].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[17], prehodi[19]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[12], prehodi[20]});
        mesta[36].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[4], prehodi[14], prehodi[15], prehodi[16], prehodi[17], prehodi[18]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[5], prehodi[12]});
        mesta[37].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[3], prehodi[5], prehodi[7], prehodi[13], prehodi[14], prehodi[16], prehodi[18]}, new Druga.Prehod[]{});
        mesta[38].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[5], prehodi[7], prehodi[9], prehodi[11], prehodi[12], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[19]});
        mesta[39].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[7], prehodi[14], prehodi[15], prehodi[16], prehodi[17], prehodi[19]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[10]});
        mesta[40].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[4], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{prehodi[5], prehodi[6], prehodi[10]});
        mesta[41].nastaviPrehode(new Druga.Prehod[]{}, new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[2], prehodi[3], prehodi[4], prehodi[5], prehodi[7], prehodi[9], prehodi[10], prehodi[12], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[19]});
        mesta[42].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[1], prehodi[4], prehodi[6], prehodi[7], prehodi[9], prehodi[14], prehodi[15], prehodi[18], prehodi[20]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[12]});
        mesta[43].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[2], prehodi[6], prehodi[7], prehodi[12], prehodi[13], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{prehodi[11]});
        mesta[44].nastaviPrehode(new Druga.Prehod[]{prehodi[1], prehodi[7], prehodi[9], prehodi[14], prehodi[15]}, new Druga.Prehod[]{prehodi[2], prehodi[3], prehodi[10], prehodi[11], prehodi[12], prehodi[18], prehodi[20]});
        mesta[45].nastaviPrehode(new Druga.Prehod[]{prehodi[0], prehodi[9], prehodi[14], prehodi[15], prehodi[16], prehodi[18], prehodi[19], prehodi[20]}, new Druga.Prehod[]{prehodi[2], prehodi[6], prehodi[10]});
        mesta[46].nastaviPrehode(new Druga.Prehod[]{prehodi[7], prehodi[8], prehodi[9], prehodi[14]}, new Druga.Prehod[]{prehodi[1], prehodi[2], prehodi[11], prehodi[12], prehodi[15], prehodi[16], prehodi[17], prehodi[18], prehodi[20]});

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
