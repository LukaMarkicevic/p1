// _NE_ODSTRANI_

public class Test29 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, PT, MT, MF, PF, MF, PF, MT, PF, PT, PT, MT, MF},
            {PT, PF, PT, MT, PF, PT, PF, MF, PF, PT, PT, MT, PT},
            {PF, PT, MF, PF, PT, PF, MF, PT, PF, PF, PT, PF, PT},
            {PT, PF, MT, PT, PT, MF, PT, MF, MF, PT, PF, PT, PF},
            {PT, MT, PT, MT, PF, MT, MT, PT, PF, MF, PF, PF, PT},
            {PF, PT, PT, PF, PT, MF, PF, PT, MF, PT, PF, PF, MT},
            {MF, MF, PT, PT, PT, PF, PF, PF, PF, MF, PT, PF, PF},
            {MT, PF, PT, PT, PF, PF, PF, MF, PF, PT, PF, PF, PF},
            {PT, MT, MT, PT, PF, PF, PF, PF, PT, MT, PT, PF, MF},
            {MF, PF, PT, PF, MF, PT, PF, PF, MT, PF, PT, PF, PF},
            {PT, PF, MF, PT, MT, MT, PF, PF, PT, MT, PT, MT, PF},
            {PF, PT, MT, PT, MT, PF, PF, MF, MT, MF, PT, PT, PF},
            {MF, MF, PT, PT, MT, PT, MF, PF, PT, PT, MF, PF, MF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat29.png", "416x546"}, "Minolovec");
    }
}
