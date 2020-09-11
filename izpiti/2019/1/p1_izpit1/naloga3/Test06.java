// _NE_ODSTRANI_

public class Test06 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MT, PF, MF, PT, MF},
            {MF, PT, PT, MT, PF},
            {PF, MT, MF, MT, PF},
            {PT, PF, PF, MT, PF},
            {PT, PF, MF, PT, MF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat06.png", "400x600"}, "Minolovec");
    }
}
