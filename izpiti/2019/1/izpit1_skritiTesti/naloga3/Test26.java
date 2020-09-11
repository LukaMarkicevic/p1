// _NE_ODSTRANI_

public class Test26 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, PF, PF, PF, PT, PF, MT, MF, PT, PT, MF, PT, PF, PT, MF},
            {PF, PF, PT, PF, PF, PF, PF, MT, MT, MF, MT, PT, PF, PF, PT},
            {PF, PF, PF, MT, PF, MT, PF, PF, PF, MT, PT, PT, PF, MF, PT},
            {PF, PF, PF, MT, PT, PF, PT, PF, PT, PF, PT, PF, MT, PF, PF},
            {MT, PF, MF, PF, MT, PF, PT, PF, MF, PF, MF, MF, PT, PT, PF},
            {PF, PF, MF, PT, PF, MF, MT, MF, MF, PF, PF, PF, PT, PT, MT},
            {PF, MF, PT, PT, PF, PF, PT, PF, PF, MF, PF, MF, MF, MF, PT},
            {MT, PT, PT, PT, PT, PT, PT, MT, PF, PT, MT, PF, PF, PT, PF},
            {MF, PF, PF, PT, MT, PF, PF, PT, PT, PF, PF, PF, PT, PT, MF},
            {MT, MF, PT, PF, PT, PF, MT, MT, MT, MF, MT, PF, PF, PF, PT},
            {PT, PT, MF, PT, PT, PF, MT, PT, PT, PF, MF, PT, PF, PT, MT},
            {PF, PF, PF, PT, MF, MF, PT, PT, MF, MT, PF, MF, PT, PT, PT},
            {MT, PT, PF, PT, MT, PF, MT, MT, PF, PT, PT, PT, PT, MF, PF},
            {PF, MT, PF, PF, MT, MF, PT, PF, PT, PF, PT, PT, PF, PF, PT},
            {PT, PT, MT, PF, MT, MT, PF, PT, PT, PF, PT, PT, PF, PF, MF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat26.png", "465x540"}, "Minolovec");
    }
}
