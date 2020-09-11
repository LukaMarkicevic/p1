// _NE_ODSTRANI_

public class Test33 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {ZA, PT, MT, PT, MT},
            {PF, PF, ZA, ZA, PF},
            {MT, PT, PT, MF, PF},
            {MT, ZA, PT, PF, MT},
            {MF, PF, MF, PT, MT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat33.png", "620x615"}, "Minolovec");
    }
}
