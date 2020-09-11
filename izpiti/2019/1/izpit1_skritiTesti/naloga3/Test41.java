// _NE_ODSTRANI_

public class Test41 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MF, MF, MF, MT, ZA, PF, MF, PF, PF, MF, PT, PT, MF, ZA, PT, MT, MT},
            {ZA, PT, MT, ZA, MF, PF, MT, ZA, PT, MT, MT, ZA, PF, ZA, PT, ZA, PT},
            {MT, MT, PF, MF, PT, MF, PT, ZA, ZA, PT, PT, ZA, ZA, ZA, PF, PF, PT},
            {MT, PF, ZA, MT, PF, MF, MF, ZA, ZA, PF, PT, PF, MF, ZA, ZA, PF, MF},
            {MF, ZA, ZA, MF, MF, MF, MT, PT, ZA, MF, MT, PT, ZA, PF, ZA, PF, ZA},
            {PF, PF, PF, PT, ZA, ZA, ZA, PT, PT, MT, PF, MT, MT, MT, ZA, MF, ZA},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat41.png", "731x486"}, "Minolovec");
    }
}
