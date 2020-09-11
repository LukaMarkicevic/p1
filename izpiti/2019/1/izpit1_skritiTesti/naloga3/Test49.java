// _NE_ODSTRANI_

public class Test49 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {ZA, PT, ZA, ZA, ZA},
            {PT, PT, ZA, PT, ZA},
            {MF, PT, ZA, ZA, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat49.png", "730x786"}, "Minolovec");
    }
}
