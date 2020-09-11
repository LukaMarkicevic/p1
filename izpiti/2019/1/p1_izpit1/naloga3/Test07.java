// _NE_ODSTRANI_

public class Test07 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, PF, MT, PF, MF, ZA, MT, PF},
            {ZA, PF, PF, MF, PF, PF, PT, MF},
            {PF, PF, PF, PF, PT, PF, PT, ZA},
            {MF, ZA, ZA, MF, ZA, PF, MT, PT},
            {ZA, MF, PF, PF, PT, ZA, PF, PT},
            {PT, MF, ZA, PT, MT, PT, PT, PF},
            {MT, PF, PT, PT, MT, PF, PT, ZA},
            {PF, PF, PF, PF, ZA, ZA, PT, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat07.png", "720x400"}, "Minolovec");
    }
}
