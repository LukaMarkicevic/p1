// _NE_ODSTRANI_

public class Test08 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MF, PF, PT, PT, MF, PF, MF, PF, MF},
            {PT, MT, PF, MF, PT, MF, PT, PT, PF},
            {PF, MT, MF, MT, PF, PT, PT, PT, PF},
            {PF, MF, PT, PF, PT, MT, PT, PF, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat08.png", "540x600"}, "Minolovec");
    }
}
