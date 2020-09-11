// _NE_ODSTRANI_

public class Test11 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, PT, PT, PF, PF, PT, PT, PT, PT, PT, PF, PT, PF, PT, PF, PF, PF, PT},
            {PT, PF, PF, PT, PT, PF, PT, PT, PT, PF, PF, PF, PF, PF, PT, PT, PF, PT},
            {PF, PF, PT, PF, PT, PF, PF, PT, PT, PT, PT, PT, PF, PF, PT, PT, PF, PF},
            {PT, PT, PT, PT, PF, PT, PF, PF, PF, PT, PT, PF, PF, PF, PF, PT, PF, PF},
            {PT, PF, PF, PF, PF, PT, PT, PF, PF, PT, PT, PT, PF, PF, PF, PF, PF, PF},
            {PT, PF, PT, PT, PF, PF, PT, PF, PT, PF, PT, PF, PT, PF, PF, PF, PF, PF},
            {PF, PT, PF, PT, PF, PF, PT, PF, PF, PF, PF, PF, PT, PF, PF, PT, PT, PT},
            {PT, PT, PF, PT, PF, PF, PT, PF, PT, PT, PF, PT, PF, PT, PT, PT, PF, PF},
            {PF, PT, PT, PF, PT, PT, PT, PT, PT, PT, PT, PF, PF, PF, PF, PT, PT, PT},
            {PF, PT, PT, PF, PT, PF, PT, PT, PT, PF, PF, PF, PF, PF, PF, PT, PT, PT},
            {PF, PT, PF, PF, PT, PF, PT, PF, PT, PF, PT, PT, PF, PT, PT, PF, PT, PT},
            {PF, PF, PF, PF, PF, PT, PT, PT, PF, PF, PT, PT, PT, PF, PT, PT, PF, PF},
            {PT, PT, PT, PF, PF, PT, PT, PT, PF, PT, PF, PT, PF, PT, PF, PF, PT, PF},
            {PT, PF, PF, PT, PF, PT, PT, PF, PF, PF, PT, PF, PT, PT, PT, PT, PT, PT},
            {PT, PT, PT, PF, PF, PT, PF, PT, PF, PF, PT, PF, PF, PT, PT, PT, PF, PF},
            {PF, PF, PT, PT, PF, PT, PT, PF, PT, PT, PT, PT, PT, PF, PF, PT, PF, PF},
            {PF, PF, PF, PF, PT, PF, PF, PT, PF, PF, PT, PT, PF, PT, PT, PF, PF, PF},
            {PF, PT, PF, PT, PF, PF, PF, PT, PF, PT, PF, PF, PT, PF, PF, PT, PF, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat11.png", "756x756"}, "Minolovec");
    }
}
