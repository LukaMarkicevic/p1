// _NE_ODSTRANI_

public class Test35 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, ZA, ZA, PF, PF, PF, PT, PF, ZA, PT, PF, PF, ZA, PF, PF, PF, ZA, MF},
            {PF, PT, ZA, PF, MF, PF, PF, PT, PT, PT, PT, ZA, PF, MT, PF, PF, PT, PF},
            {PF, MT, MT, PF, MF, MF, MF, MF, ZA, PF, MF, PT, PF, MT, MF, ZA, ZA, PT},
            {ZA, MT, ZA, ZA, MF, MF, ZA, PF, MF, ZA, PT, PF, MF, ZA, MT, PF, MF, MT},
            {ZA, PF, ZA, ZA, PT, ZA, PF, MF, PT, PT, ZA, PT, PF, ZA, ZA, MT, PT, PF},
            {MT, PF, MT, MT, ZA, PT, ZA, ZA, ZA, MF, ZA, ZA, PF, ZA, MF, PT, PT, MF},
            {PT, ZA, ZA, PF, ZA, PT, ZA, PF, ZA, PF, PT, PF, PF, PT, MT, PT, ZA, MT},
            {ZA, PT, ZA, MF, PF, ZA, MT, MT, MF, MT, ZA, MF, MT, MF, PT, PF, ZA, MF},
            {PT, MF, MF, PT, ZA, PT, ZA, PT, PT, PT, PF, MF, PT, MF, PT, PT, PF, PT},
            {PT, PT, ZA, PT, PF, PT, MF, PF, ZA, ZA, ZA, ZA, PT, PF, MF, PT, MT, ZA},
            {MT, PF, MT, MT, ZA, PT, PF, ZA, MF, PT, ZA, PF, PT, PT, MF, MT, MF, ZA},
            {PT, PT, MF, MT, MT, PF, MF, PT, PF, PT, PT, PT, PT, PT, PT, MF, PT, PF},
            {ZA, ZA, MT, PT, PT, MT, ZA, MF, MT, MF, PF, PT, MF, PT, PT, ZA, PT, MT},
            {MT, MT, ZA, MT, MF, ZA, MF, PF, ZA, MF, ZA, PT, PF, ZA, PT, PT, ZA, MF},
            {ZA, PF, MF, ZA, MT, PF, PF, PT, PT, MT, PF, MF, MF, PT, PF, PF, ZA, ZA},
            {PF, PF, PF, ZA, PF, PF, PT, ZA, PF, PF, PT, PT, ZA, PT, PT, PF, ZA, MT},
            {PT, MT, PF, PF, ZA, PT, PF, PT, PF, ZA, PF, ZA, MF, PF, MT, MF, ZA, PT},
            {ZA, PT, ZA, MF, PF, ZA, ZA, MF, MF, PF, MF, ZA, PF, ZA, PF, ZA, PT, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat35.png", "738x594"}, "Minolovec");
    }
}
