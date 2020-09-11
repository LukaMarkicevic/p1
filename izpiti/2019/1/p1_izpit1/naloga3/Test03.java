// _NE_ODSTRANI_

public class Test03 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, PF, PT, PT},
            {PF, PT, PF, PF},
            {PT, PF, PF, PF},
            {PF, PT, PT, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat03.png", "600x600"}, "Minolovec");
    }
}
