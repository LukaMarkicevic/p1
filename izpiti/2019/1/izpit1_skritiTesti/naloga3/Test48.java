// _NE_ODSTRANI_

public class Test48 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, PF, MF, MT, ZA, MT, ZA, PT},
            {PT, PF, PF, MF, MT, MT, MF, PT},
            {ZA, PT, MF, ZA, PF, ZA, MT, MF},
            {MF, PF, MF, PF, PF, MF, PT, ZA},
            {PT, MF, MF, PF, MT, PT, PT, MF},
            {ZA, MF, MF, PT, ZA, PF, PT, PF},
            {MT, PT, MT, PT, PF, PT, MF, ZA},
            {ZA, ZA, ZA, PF, PT, PT, PF, MF},
            {PF, PT, MF, PF, PF, PT, ZA, PT},
            {ZA, PT, PF, MF, ZA, PT, PF, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat48.png", "560x530"}, "Minolovec");
    }
}
