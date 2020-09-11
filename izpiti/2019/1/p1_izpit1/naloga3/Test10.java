// _NE_ODSTRANI_

public class Test10 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, PT, PF, PT, PT, MT, PF, PF, PF, PT, ZA, ZA, PF},
            {ZA, ZA, MT, PF, MF, PT, PT, ZA, MF, ZA, PT, ZA, PF},
            {ZA, MF, MT, PT, ZA, PT, MF, MF, PT, PF, PF, PF, MF},
            {PF, MT, MT, ZA, PF, MF, ZA, MT, PT, ZA, ZA, PT, MT},
            {ZA, ZA, MF, ZA, ZA, PT, MT, PF, ZA, ZA, ZA, ZA, PT},
            {PT, ZA, MF, ZA, PF, ZA, PT, PT, ZA, MT, MT, ZA, ZA},
            {ZA, PF, ZA, PF, PF, PF, MT, PT, ZA, MF, PF, PF, ZA},
            {ZA, PT, PT, PF, PT, PT, ZA, MT, PF, MT, ZA, ZA, PT},
            {PT, PT, MF, MT, PF, ZA, MT, PT, PT, PT, MT, PT, PF},
            {PT, MF, PF, PT, PT, PT, PF, PF, MT, PF, PF, PT, MT},
            {MT, ZA, ZA, PT, PF, PT, PF, MT, MT, PF, MT, MT, PF},
            {PT, ZA, PF, PF, ZA, PF, MT, MT, ZA, ZA, PT, ZA, ZA},
            {PT, MF, PF, PT, PF, PF, PT, MF, PT, ZA, PT, PT, PT},
            {MT, PT, ZA, MT, PF, PT, PF, MF, PF, PT, MF, PT, PT},
            {ZA, ZA, MF, ZA, ZA, ZA, PF, MF, ZA, PT, ZA, ZA, ZA},
            {ZA, PT, MT, MF, MT, PF, PF, PF, MF, MT, MF, MT, PF},
            {ZA, ZA, PF, MT, ZA, MT, ZA, PT, MF, PF, ZA, ZA, PF},
            {PF, MT, ZA, ZA, ZA, ZA, PF, ZA, ZA, MF, PT, MT, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat10.png", "507x450"}, "Minolovec");
    }
}
