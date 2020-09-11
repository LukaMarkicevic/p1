// _NE_ODSTRANI_

public class Test23 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, PF, PT, PF, PT, PF, PF, ZA, PF, PF, PT, ZA, PF, PT, PT, PF},
            {MT, PT, PF, PF, MF, MT, ZA, ZA, MT, PF, MT, PF, PT, PF, ZA, PT},
            {ZA, PT, PF, MT, MF, ZA, ZA, PT, ZA, MT, MF, MF, PT, PT, PT, ZA},
            {PF, PT, MT, ZA, PF, ZA, PF, MF, MT, PF, PF, PT, ZA, PT, PT, ZA},
            {PT, PF, MF, PT, PT, MT, PT, MF, PF, PF, MF, ZA, ZA, PF, ZA, PF},
            {PT, ZA, ZA, PF, ZA, PF, PF, ZA, MF, MF, MT, PT, PT, MT, ZA, MT},
            {PT, PT, ZA, MF, PF, ZA, MF, PF, MT, ZA, PF, PF, PF, MT, MT, PF},
            {ZA, PT, MT, PF, PT, MF, MT, MT, PF, MT, PF, PT, MF, MT, ZA, PT},
            {ZA, ZA, PF, PF, ZA, PT, PT, PF, MT, ZA, MF, MF, PT, PF, ZA, MT},
            {ZA, PT, ZA, PF, MF, ZA, PT, PT, PT, PT, PF, ZA, PF, PT, PF, PF},
            {PF, PF, ZA, PT, PF, ZA, ZA, MF, ZA, PT, ZA, MF, PF, PT, PF, PF},
            {PT, MF, MT, MT, MT, MT, MT, PT, MF, MF, MF, PF, MT, ZA, PT, MF},
            {ZA, PT, PF, PT, PT, MT, ZA, MF, PT, MT, MF, ZA, PF, MT, ZA, PT},
            {MT, MF, PT, ZA, PF, PT, PF, PF, MT, MT, PT, ZA, PT, PF, PF, PT},
            {ZA, PT, ZA, PF, ZA, ZA, PF, MT, MF, PT, ZA, ZA, PF, ZA, MT, ZA},
            {MT, PT, PT, PT, PT, MT, PT, PF, PT, PF, MT, ZA, PF, PF, MF, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat23.png", "640x640"}, "Minolovec");
    }
}
