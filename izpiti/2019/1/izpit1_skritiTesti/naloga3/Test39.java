// _NE_ODSTRANI_

public class Test39 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, PF, PT, PT, PT, MT, PT, PT, PF, MF, PF, MT, PF, MF, MF, PT},
            {PF, PF, PF, MF, PT, MF, PF, MT, MT, MF, PF, PT, PF, PF, PT, PT},
            {MF, PF, MF, PF, PF, PT, PT, MT, PF, PF, PF, MF, PT, PF, PT, MT},
            {MT, PF, PF, PF, MF, PF, PT, MT, PT, PT, PT, PT, MT, PF, PT, PT},
            {PT, MT, PT, PT, PT, PF, PT, PF, PT, PF, PT, MT, PT, PF, PF, PT},
            {PT, PF, PF, PF, PF, PF, PF, PF, PT, MT, PT, MF, PF, PT, PT, MT},
            {MF, PF, PF, PT, PF, MT, MF, MT, PF, PF, PF, PF, PF, PT, PF, PT},
            {PF, MT, PF, MT, MF, PF, MF, PT, MT, PT, PT, PT, PF, PT, PF, MF},
            {PT, MF, PT, PF, PF, PT, PF, PT, PF, MT, MT, PT, PT, MT, PF, MT},
            {MF, PT, PF, PF, PF, MT, PF, MF, PF, MF, MT, PF, MF, MF, PF, PF},
            {MF, PF, MF, PT, MT, PF, MT, PT, PT, PT, PF, PT, MF, PF, PT, MF},
            {PF, PF, MT, PT, PT, MT, PT, PT, PF, PT, PF, PF, MT, PT, MT, PT},
            {PT, PT, PT, PF, PF, PT, PF, MT, PT, PT, PT, PT, PF, MF, PT, PT},
            {PF, PT, PT, PT, PF, PT, PT, MT, MF, PF, MF, PT, PF, PF, PF, PF},
            {MT, PT, PF, PT, MF, PF, PT, PT, MT, PF, PF, PF, PT, MT, MT, PT},
            {MF, PT, PT, PT, PF, PT, MF, PF, MT, PT, MT, MF, PT, MT, PT, MF},
            {MF, PF, PF, PF, MT, MF, PF, PT, PF, MT, PT, MF, PT, PF, PF, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat39.png", "464x595"}, "Minolovec");
    }
}
