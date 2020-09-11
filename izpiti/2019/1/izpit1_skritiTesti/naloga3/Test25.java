// _NE_ODSTRANI_

public class Test25 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {ZA, MF, MF, PT, PT, ZA, ZA, PT, PT, PF, PF},
            {ZA, PT, MF, MT, ZA, ZA, MF, ZA, MT, ZA, PF},
            {PF, MF, MF, ZA, ZA, MF, ZA, PF, ZA, ZA, PT},
            {PT, PF, ZA, MT, PT, ZA, MF, PF, MT, MF, MT},
            {PF, ZA, MF, MT, ZA, PF, PF, PF, PT, PT, ZA},
            {PT, PT, PT, ZA, MT, PF, MF, ZA, MT, PT, ZA},
            {PT, MF, ZA, ZA, PF, ZA, PT, PT, PF, PT, PF},
            {PF, ZA, PF, PT, MF, ZA, ZA, MT, MT, PF, ZA},
            {MT, PT, PF, ZA, ZA, ZA, PF, PF, MF, PT, MF},
            {PT, MT, PF, MF, ZA, MT, PT, PF, PF, ZA, ZA},
            {MT, ZA, ZA, PT, ZA, PT, ZA, MT, PT, ZA, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat25.png", "759x759"}, "Minolovec");
    }
}
