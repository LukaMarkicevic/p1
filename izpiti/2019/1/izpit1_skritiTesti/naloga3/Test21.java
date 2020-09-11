// _NE_ODSTRANI_

public class Test21 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, MT, PF, MT, PF, MF, ZA, ZA, ZA, PF, PF, PF},
            {PF, PF, MT, ZA, PF, ZA, ZA, ZA, PT, ZA, ZA, PF},
            {PF, MT, MT, ZA, PT, MT, ZA, MT, PF, PF, PT, PT},
            {MF, PF, MF, MF, PF, PT, MT, ZA, ZA, PT, ZA, PF},
            {PT, ZA, PF, PF, MF, PT, PF, ZA, PT, PT, PF, PT},
            {ZA, PT, ZA, ZA, PF, PT, ZA, PT, ZA, ZA, PF, PF},
            {ZA, PT, MF, MT, PF, PT, MF, PT, ZA, ZA, ZA, PT},
            {PF, PT, ZA, PF, ZA, ZA, PF, PT, ZA, MF, ZA, PF},
            {PF, ZA, ZA, MT, PT, PF, PT, MF, MF, MT, MT, MT},
            {MT, PF, MT, PT, MF, MT, PF, MT, MT, PT, ZA, PT},
            {PT, MT, ZA, PF, PF, MF, PT, PF, PF, PT, PT, MT},
            {ZA, PF, MT, PT, PT, PT, PF, PF, ZA, PT, ZA, MF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat21.png", "660x660"}, "Minolovec");
    }
}
