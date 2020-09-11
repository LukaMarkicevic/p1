// _NE_ODSTRANI_

public class Test42 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {ZA, PT, ZA, PT, PF, MF, ZA, ZA, ZA, MF, PF},
            {ZA, ZA, MF, MF, MT, ZA, PT, PF, MF, MF, PF},
            {ZA, PF, PT, PT, ZA, PF, PF, ZA, MF, MF, ZA},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat42.png", "737x648"}, "Minolovec");
    }
}
