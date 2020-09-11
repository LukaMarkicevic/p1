// _NE_ODSTRANI_

public class Test27 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, MF, PF, PT, PF, PT, MT, PF, PF, MT, PF, PF, MT, MF, MT, MT, PF, PF, PT, MT},
            {PT, PF, MF, MT, PF, PT, PT, PF, PF, PT, PT, MF, PT, PT, PF, PF, PF, PT, PT, PF},
            {PT, MT, PF, MF, PT, MF, PF, PF, PF, PF, MF, MF, PT, MF, PT, PF, MF, MT, MT, MF},
            {MT, PT, MF, MT, PT, PF, MF, PT, PT, PF, MF, MT, PF, PT, PT, PF, MT, PF, PF, MF},
            {MF, MF, PF, PF, PF, PT, PF, MF, PT, PT, PF, PF, PF, PT, MT, PF, PT, PF, PT, PF},
            {PF, PF, MT, MF, PF, PT, PF, PT, PF, PF, PF, MF, PF, PF, MT, MT, PT, MF, PT, PF},
            {MF, PT, PF, PT, MT, MT, PT, MF, PT, PF, MF, PF, PF, PF, PF, PF, PT, MT, MF, MT},
            {PF, PT, MT, MT, PF, MT, PF, MT, MF, PT, PF, MT, MF, PT, PT, PT, PF, PF, PF, MF},
            {PF, MT, PT, PT, MT, PT, MT, PT, MT, PF, PF, PF, PT, PT, PF, PT, MF, MT, PF, PF},
            {PT, PF, PT, PF, PF, PT, PT, PT, PT, MF, MT, MT, PF, PT, MT, MF, PT, PT, PT, MT},
            {MF, PT, MF, PT, MF, PF, PF, PF, PF, PT, PT, PT, PT, PF, MT, PF, PF, PF, PT, MF},
            {MF, PF, PF, MF, PT, PT, PF, PF, PT, PT, PF, MF, PF, PT, MF, PT, PF, PF, PT, PT},
            {PT, PF, PT, PT, PF, PF, MF, MT, PT, PT, PT, MT, MT, MF, MT, MT, PT, PF, MT, PT},
            {PF, PT, PT, MF, PF, PT, PF, MT, PF, PF, MT, PT, PF, PT, MT, PT, PF, MT, PF, PF},
            {MF, PT, PT, MF, MF, PT, PT, MF, PT, PF, MT, MT, PF, PF, MF, PF, PT, PF, PT, PT},
            {PF, PF, MF, PF, PT, MT, MT, PF, PF, PT, PT, MF, PT, PF, PT, PF, PF, MT, PF, PT},
            {PT, MT, PT, MF, PF, PT, MF, PT, PF, PF, MT, MF, PF, PF, MF, MF, MF, PF, PF, PT},
            {PT, PT, PT, PT, PT, MF, MF, MT, PT, MT, MF, PF, PT, MT, PF, PF, PT, PT, PT, PT},
            {MF, PF, MF, PT, MT, PT, PT, MT, PF, PF, MF, MT, PF, MF, MT, MF, MT, PT, PT, PF},
            {PF, PF, MT, PT, PF, PF, PF, PF, MT, MF, PF, MT, PT, MT, MT, PT, MT, PF, MF, MT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat27.png", "540x500"}, "Minolovec");
    }
}
