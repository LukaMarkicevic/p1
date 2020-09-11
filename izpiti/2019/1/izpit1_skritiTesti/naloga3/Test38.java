// _NE_ODSTRANI_

public class Test38 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, PF, PT, PF, PT, PF, PT, PT, MT, PT, MF, MT, PF, PF},
            {PF, MF, MF, MT, PT, PT, PF, PT, MT, MT, PF, PF, PT, PT},
            {MF, PT, PT, PF, PT, MF, PF, PF, PF, PF, PT, PT, PF, PF},
            {PT, PF, MT, PT, MT, PT, PT, PF, MT, MF, PF, PF, MF, MF},
            {MF, PF, PF, MF, PT, MF, PF, MT, MF, PF, PF, PT, PT, PF},
            {MF, PF, MT, PF, PT, PF, PT, PF, MT, PF, PF, MT, PF, PT},
            {PT, PT, MT, PF, PT, MF, PF, PF, PT, PT, PF, MT, PT, PF},
            {PT, PF, MT, PT, PF, PF, PF, MF, PF, PF, PF, PT, MT, MF},
            {MT, PF, PT, PF, MF, MF, MF, PT, MF, PT, PT, MF, PT, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat38.png", "504x792"}, "Minolovec");
    }
}
