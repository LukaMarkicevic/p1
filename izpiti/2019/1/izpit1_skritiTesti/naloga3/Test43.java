// _NE_ODSTRANI_

public class Test43 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MT, ZA, PF, MF, MF, PF, PT, MT, MF, MF, PT, PF, ZA, MF, ZA, MF, PT},
            {ZA, ZA, PT, PF, ZA, PT, ZA, MT, ZA, ZA, PT, PT, MT, ZA, PF, ZA, PF},
            {PF, MF, MT, PT, PT, PF, ZA, MT, PT, PF, PT, PF, MF, ZA, ZA, PF, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat43.png", "493x471"}, "Minolovec");
    }
}
