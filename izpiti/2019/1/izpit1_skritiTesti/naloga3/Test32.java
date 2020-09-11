// _NE_ODSTRANI_

public class Test32 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {ZA, PF, ZA, MT, MF, ZA, PT, MT, PF, ZA, PT, PT, PF},
            {MT, PF, PT, PF, MT, ZA, ZA, PF, PT, MT, MT, PT, MF},
            {MF, PF, ZA, ZA, ZA, PT, PT, MF, PF, PF, PT, ZA, PT},
            {MT, MT, MF, PT, ZA, PT, ZA, ZA, MF, MT, PF, MF, ZA},
            {PT, MT, PT, PT, MF, PT, PF, MT, PT, PF, MF, PT, PF},
            {PT, PF, MT, PT, PT, MT, MT, ZA, PF, PF, PF, PT, ZA},
            {ZA, MF, PT, PT, PF, ZA, MF, ZA, PF, PF, ZA, PF, PF},
            {PT, MF, PT, PT, PT, MT, PT, PT, ZA, MF, PF, ZA, ZA},
            {PF, MF, PT, PF, PF, MF, PT, PT, PT, ZA, PT, ZA, PF},
            {PF, MT, PT, PF, MF, MT, ZA, PF, PF, PT, MF, MT, ZA},
            {PT, PF, PF, ZA, ZA, ZA, PF, ZA, MF, PT, PT, ZA, ZA},
            {ZA, PF, MT, PF, MF, MT, PT, ZA, PF, MT, PT, MT, MF},
            {ZA, PT, ZA, PT, MF, ZA, MF, MT, ZA, ZA, PF, PT, ZA},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat32.png", "624x611"}, "Minolovec");
    }
}
