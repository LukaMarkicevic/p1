// _NE_ODSTRANI_

public class Test18 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MF, PT, MF, PT, PF, PT, MF, PF, PT, PF, PF, PF, MF, MT, MT, PF, PF, MT, MF},
            {MF, PT, PF, PF, PT, PT, MT, PT, MT, PF, MF, PF, PF, MF, MT, PF, MF, PF, MF},
            {PF, PT, MF, PF, PT, MT, PF, PT, MT, PF, PF, MT, PF, PF, MT, MT, PT, PT, PT},
            {MT, MT, MT, PF, PF, MT, MF, PT, PF, MT, MT, PF, PT, PF, PF, MF, MF, MT, PF},
            {PF, MF, PT, PT, PT, PT, PT, PF, PF, PT, PF, MF, MT, PT, MF, MF, MT, PF, MF},
            {PT, MT, PF, PF, MF, PF, PF, PT, PT, PF, PF, PF, MT, PF, MF, PT, PT, MF, PF},
            {PT, PF, MT, PT, PT, MF, PT, PT, MT, PF, PT, MT, PF, MF, PF, MF, PF, PF, PT},
            {PT, MF, PF, PT, PT, PT, PF, PT, PF, MT, MF, MT, PF, PF, MT, PT, MT, PT, MT},
            {PF, PF, PF, PT, PF, MT, MF, PT, PF, PF, PT, PF, PT, PT, PF, MF, PF, PT, MF},
            {PT, MT, PT, PF, MT, MT, PF, PT, PF, PF, PF, PF, PT, MF, PT, PT, MT, MT, PF},
            {PF, PF, PF, PT, MT, MT, PF, PF, MF, PT, PF, PT, PF, MT, PF, PF, PT, MF, MF},
            {PF, PT, PF, PT, MF, PF, MT, PF, PT, PT, PF, MF, MT, MF, MF, PT, PF, PT, MF},
            {PT, PF, PT, MT, PF, MF, PT, PT, PT, PT, PF, MF, PT, PF, PF, PF, PF, PT, MF},
            {MT, PF, PF, PF, PT, PF, PF, PF, PF, MF, MF, PF, PF, MF, PF, MF, PF, PT, MF},
            {PT, PF, MF, PF, PF, PF, MF, PF, MF, MF, PT, PT, PT, PT, MF, PT, PT, PT, PT},
            {PT, PF, PF, MT, MT, PF, PT, PF, PT, PT, PF, PF, PT, MF, PT, PF, PT, MF, PF},
            {MF, PT, PF, PF, MT, PT, PF, PT, MT, PT, MF, PT, MT, PT, MF, PT, PT, MF, MT},
            {PF, PF, MT, PT, PF, PT, PF, PT, PT, PT, PF, PF, MF, PT, PT, PT, MT, PT, PT},
            {PF, PF, MF, MT, MF, PT, PF, PF, PF, PF, PF, MF, PF, PT, PF, PF, MT, PT, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat18.png", "741x741"}, "Minolovec");
    }
}
