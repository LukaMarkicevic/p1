// _NE_ODSTRANI_

public class Test47 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {ZA, PT, PF, PT, ZA, PT, PT, MF, MF, MT, MT, PF, PF, PF, PT, PT, MT, PT},
            {PT, MF, PT, PF, PT, PF, PF, ZA, ZA, PF, MF, MT, ZA, PF, MF, PF, MF, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat47.png", "720x418"}, "Minolovec");
    }
}
