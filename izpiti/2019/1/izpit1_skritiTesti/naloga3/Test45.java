// _NE_ODSTRANI_

public class Test45 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MT, PT, PT, PT, ZA, MF, PT, PT, MF, ZA, PT, PF, PF},
            {PF, ZA, ZA, PT, PT, ZA, MF, PT, ZA, MF, PT, MF, PT},
            {MF, MT, PF, MF, PF, ZA, PT, PT, PT, ZA, MF, PT, PF},
            {PF, ZA, PT, MF, MT, MF, PT, ZA, PF, ZA, PF, PF, PF},
            {MF, ZA, ZA, PT, MF, PT, MT, MT, ZA, PT, PT, PF, PF},
            {MT, PT, PF, PT, MT, PF, PF, ZA, PT, PT, PF, ZA, PF},
            {PT, ZA, ZA, PF, PF, PT, MF, ZA, PT, MF, PF, MT, ZA},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat45.png", "507x791"}, "Minolovec");
    }
}
