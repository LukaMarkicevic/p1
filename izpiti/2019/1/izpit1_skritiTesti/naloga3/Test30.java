// _NE_ODSTRANI_

public class Test30 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, MT, MT, PT, MF, PT, MF, PT, PF, PT, PF, MF},
            {PF, PF, PT, MT, PT, MT, PF, PF, MF, MF, PF, PT},
            {PF, MT, MF, MT, PF, PF, MT, PT, PT, PF, PF, PF},
            {PT, PF, PF, PT, PT, MT, MT, PT, MT, PF, PT, PF},
            {PF, MF, PT, PF, MF, PF, PT, PF, MT, MF, PF, PF},
            {PT, MF, PT, PF, PF, PF, PT, PF, PF, PT, PF, PF},
            {PF, PF, MT, MF, PT, PF, MF, PF, PT, PF, PT, MF},
            {PT, PT, MT, PT, MF, PF, PF, MF, PF, PF, MF, MF},
            {MF, PF, MT, PF, MT, PF, MT, PF, PF, PT, PF, PT},
            {PT, PT, PT, PT, PF, PT, MT, MF, MF, PF, PT, PT},
            {PF, MT, PF, MF, MT, PF, MT, PT, MT, PT, PF, PF},
            {PT, PF, PT, PT, PT, MT, PF, PT, PF, MF, PF, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat30.png", "576x756"}, "Minolovec");
    }
}
