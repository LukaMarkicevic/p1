// _NE_ODSTRANI_

public class Test13 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, PT, PF, PT, PT, PT, PT, PF, PF, PF, PF, PF},
            {PT, PT, PT, PT, PT, PF, PF, PF, PT, PT, PF, PT},
            {PT, PF, PF, PF, PT, PT, PT, PT, PT, PT, PT, PF},
            {PF, PT, PT, PT, PT, PT, PT, PT, PT, PT, PT, PF},
            {PF, PF, PF, PF, PT, PT, PF, PT, PT, PT, PF, PF},
            {PT, PT, PF, PT, PF, PT, PF, PF, PF, PF, PF, PF},
            {PF, PF, PT, PT, PT, PF, PT, PF, PF, PT, PT, PT},
            {PT, PT, PT, PF, PF, PT, PT, PF, PF, PT, PT, PF},
            {PF, PF, PF, PT, PT, PF, PF, PF, PF, PT, PF, PF},
            {PF, PT, PT, PT, PT, PF, PT, PT, PT, PF, PF, PT},
            {PT, PF, PF, PF, PT, PF, PF, PF, PT, PF, PF, PF},
            {PF, PF, PT, PF, PF, PF, PF, PF, PF, PT, PT, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat13.png", "624x624"}, "Minolovec");
    }
}
