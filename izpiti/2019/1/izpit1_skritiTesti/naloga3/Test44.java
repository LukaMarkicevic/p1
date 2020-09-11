// _NE_ODSTRANI_

public class Test44 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {ZA, PF, ZA, PT, PT, ZA, ZA, PF, PT, PT, ZA, PF, MT, ZA, MF, PF, PF, PF, PF},
            {PF, ZA, MF, PT, ZA, MF, PF, MT, MF, PT, ZA, PT, MF, PF, PT, PF, MF, PT, ZA},
            {PT, MT, ZA, MF, PF, MF, ZA, MF, PF, ZA, PF, MT, PT, MT, MF, PF, PF, MT, ZA},
            {MT, ZA, PT, MT, ZA, PT, PT, PT, MF, PF, PF, PT, PT, PT, ZA, PT, PT, MT, PT},
            {PT, PF, ZA, MF, ZA, PT, ZA, MT, MT, PT, PT, ZA, PF, ZA, PF, PF, ZA, PT, MF},
            {PF, MT, PT, PF, MT, ZA, PF, ZA, ZA, PT, ZA, MT, MF, PT, PF, PF, ZA, PT, PT},
            {ZA, ZA, MF, MF, PF, PT, PF, ZA, MT, PF, PT, PF, PF, PT, PF, ZA, MF, ZA, ZA},
            {ZA, ZA, PF, ZA, MF, MT, PF, PT, PF, PF, PF, PT, ZA, ZA, PF, ZA, PF, PF, MT},
            {MF, MF, MT, ZA, PT, PF, ZA, PF, PT, PT, MF, PT, PT, PF, PF, MT, PT, MT, PF},
            {ZA, PT, ZA, ZA, PF, ZA, MT, PT, MF, MT, ZA, ZA, PT, PF, ZA, ZA, PT, PT, PF},
            {PF, PF, ZA, MT, PT, ZA, MF, PF, MT, MT, PT, PF, PF, PF, PT, PT, MF, PF, PT},
            {PF, MF, PF, PT, PT, PT, ZA, ZA, ZA, PT, ZA, PT, PF, PT, PF, PF, ZA, PT, ZA},
            {MT, MT, PF, PT, PF, ZA, ZA, PT, PT, ZA, ZA, MT, MT, PF, ZA, PT, PF, ZA, PF},
            {PF, PT, ZA, PF, MF, MF, PF, ZA, PF, ZA, PT, PT, MT, PT, MF, PF, PT, PF, MF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat44.png", "532x756"}, "Minolovec");
    }
}
