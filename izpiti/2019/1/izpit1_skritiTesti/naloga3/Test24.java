// _NE_ODSTRANI_

public class Test24 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MT, MT, PT, PF, MT, ZA, MF, PT, MF, PT, PT, PF, PT, PF, ZA, PT, MF, MT, PF},
            {MF, MT, MF, PT, PF, PT, ZA, PT, PF, PT, PT, PF, PT, PT, PT, ZA, ZA, MT, ZA},
            {PT, MT, MF, ZA, PF, ZA, PF, PF, PF, ZA, PT, MF, PT, MT, ZA, MF, PF, ZA, ZA},
            {MF, MT, MF, MT, PT, PF, ZA, MT, PF, ZA, ZA, MF, ZA, PF, PF, PT, PT, MT, PF},
            {ZA, MF, MT, ZA, PT, ZA, PF, PT, PT, ZA, PT, PT, ZA, PT, ZA, MT, ZA, ZA, PT},
            {MF, PF, PT, PT, ZA, PT, PT, PF, PF, PF, ZA, PF, PT, PF, PF, ZA, ZA, PF, MF},
            {MF, MT, PT, MT, PF, MF, PT, MT, MT, ZA, PF, MT, MT, MT, PT, PT, ZA, PF, ZA},
            {PF, PF, ZA, PF, ZA, MF, PT, PF, MT, MF, PT, MT, ZA, PF, ZA, MF, PF, MF, MT},
            {PT, MT, MT, PF, PF, PT, MF, PT, PT, ZA, ZA, ZA, PF, ZA, PF, PT, PF, ZA, PF},
            {MF, PT, PT, PT, ZA, ZA, ZA, PF, ZA, PT, PT, PF, PF, MT, MF, MF, MT, PT, PF},
            {PF, PT, ZA, ZA, PT, MF, ZA, PF, MF, PF, MT, PF, MF, ZA, MT, PF, PF, ZA, PT},
            {ZA, PF, PT, PF, PT, ZA, ZA, MT, ZA, ZA, MF, PT, PF, MF, ZA, PF, MF, PF, MT},
            {PT, ZA, PT, MT, PT, MF, ZA, PF, PF, MT, MF, MF, MF, PF, PF, ZA, ZA, PT, MT},
            {PT, ZA, ZA, ZA, MF, PF, ZA, ZA, PF, ZA, MT, PT, ZA, ZA, ZA, ZA, PT, PF, PT},
            {PT, MF, ZA, PT, ZA, PT, ZA, MT, MF, PF, MF, ZA, PT, ZA, PT, ZA, PT, PF, ZA},
            {PT, PT, MT, MT, PT, PF, MF, PF, ZA, PF, ZA, PT, MT, PF, PF, ZA, PT, ZA, ZA},
            {ZA, ZA, ZA, PT, ZA, PT, PT, PF, PF, PT, PT, ZA, ZA, MF, PT, PF, ZA, PT, PF},
            {PF, PT, PF, PT, MF, PF, PT, ZA, PT, MT, PF, ZA, PT, MF, ZA, MT, PF, PF, MT},
            {PT, PT, PT, ZA, ZA, MF, PF, PT, PT, ZA, ZA, ZA, PT, PT, ZA, PT, ZA, PT, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat24.png", "551x551"}, "Minolovec");
    }
}
