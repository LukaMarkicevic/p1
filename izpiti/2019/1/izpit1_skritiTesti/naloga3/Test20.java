// _NE_ODSTRANI_

public class Test20 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, MT, PT, PT, MT, PT, PT, PF, PF, PF, MT, PT, MT, PF, PT, PF, PT, PT},
            {PF, PF, PF, PF, MT, MF, PT, PF, PF, MT, PT, PT, PF, MF, PF, PF, PT, MT},
            {PF, PF, PF, MF, PT, PF, PT, MF, PT, PF, PT, MT, MF, MF, PT, PF, PF, PF},
            {PF, PT, MF, PT, PT, MF, MT, MF, PF, PT, PF, MF, PT, MT, PF, PT, PF, PT},
            {PF, MT, PF, PT, PF, PF, PF, PT, PF, PF, PF, PT, MF, MT, MT, PT, PF, MF},
            {MT, PT, PT, PF, PF, PF, PT, PF, MT, PF, PF, MF, MF, MF, MF, PF, MF, PF},
            {MT, PF, MF, PF, PF, PT, MF, PF, PT, PT, PF, PF, PF, PT, MF, PT, MF, PT},
            {PT, MT, MT, PF, MF, PT, MF, PF, PT, MF, PF, PF, MT, PF, PT, PF, PT, PT},
            {PT, PF, MT, MF, PT, PT, PT, MF, PT, PF, PF, MT, PT, PT, MF, PT, PF, PT},
            {PT, PT, PT, PT, MF, MF, MT, PT, PT, PT, PF, PF, PT, MT, PT, PF, MF, PF},
            {PT, MT, PF, PF, MF, PT, PT, MF, MT, PT, MF, PF, PT, PF, PT, PT, MF, PT},
            {PT, PT, PF, MF, PT, PF, MF, PT, PF, MT, PT, PF, PT, MF, PF, PF, MT, PT},
            {MF, MT, PF, PF, PT, PF, PF, PT, PF, PT, PT, PT, PF, PT, MF, MT, PT, PF},
            {PT, PT, PT, PF, PF, PT, PT, PF, PF, PF, PF, PT, PT, MT, PT, PF, PF, MT},
            {PF, PF, MT, PF, PT, PT, PT, PT, MF, PT, PT, MT, PF, PF, MT, PF, PT, PF},
            {MF, PF, PT, PT, PF, PT, PT, MF, PT, PT, PT, MF, PF, PT, PT, PF, PF, MF},
            {MT, PF, PF, PT, PT, PT, MT, PF, MF, PF, MT, PF, PT, PT, MF, PF, PT, PT},
            {MF, PT, MF, PF, PF, MF, PT, MT, MT, PT, MT, PT, PF, PF, MT, PT, MT, MT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat20.png", "414x414"}, "Minolovec");
    }
}
