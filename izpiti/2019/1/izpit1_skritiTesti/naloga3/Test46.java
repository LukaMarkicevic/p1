// _NE_ODSTRANI_

public class Test46 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {ZA, MF, MF, PF, PF, PF, MT, PF, MF, PF, PT, PT, MF, MF, ZA, PT, PT, PF},
            {ZA, PT, PT, MF, MF, PT, MT, PT, PF, MT, PT, ZA, PF, MF, MT, PF, PF, PT},
            {PF, PF, ZA, PF, MF, ZA, PF, PF, PT, PT, ZA, PT, ZA, ZA, PF, PF, PF, PF},
            {PT, ZA, ZA, ZA, PT, MT, PF, PF, PF, PT, PT, ZA, PT, MF, ZA, ZA, MF, MF},
            {PT, ZA, ZA, MT, MT, ZA, ZA, MF, MT, ZA, MT, ZA, MT, PT, PF, MF, ZA, PT},
            {ZA, MF, PF, PF, PT, MF, PF, MT, ZA, PT, PF, ZA, PF, ZA, PF, ZA, ZA, PF},
            {PT, MF, ZA, MF, PF, PF, MF, MT, PF, MT, PF, PF, ZA, PT, PT, PF, PT, MT},
            {ZA, ZA, PT, MF, PF, PF, PT, PF, MF, PT, PF, MF, PT, ZA, MF, PF, ZA, ZA},
            {PF, ZA, PF, PF, ZA, PF, PF, MT, MT, PF, PF, MF, ZA, PT, ZA, PF, ZA, MT},
            {PF, MF, ZA, PF, MT, MT, PF, PF, PT, PF, MF, ZA, PT, PT, PF, MT, ZA, MF},
            {ZA, PT, ZA, MF, ZA, PT, PF, MF, PT, MT, PT, MT, MT, PF, ZA, ZA, PF, MF},
            {ZA, ZA, PF, PT, PF, PF, PF, PF, PF, ZA, PT, PF, PT, ZA, PT, MT, PT, PT},
            {ZA, ZA, PF, MT, MF, MT, MT, MF, ZA, ZA, PT, MT, ZA, PF, MT, MF, MT, PF},
            {PT, PF, PF, PT, PT, PF, ZA, ZA, PT, PF, MF, MT, PF, PT, ZA, PF, PT, ZA},
            {MT, PF, MF, PF, ZA, MF, ZA, MT, PT, MF, ZA, MF, PF, ZA, MF, PF, ZA, PT},
            {PF, PT, PT, ZA, PT, ZA, PT, PT, PF, PF, ZA, MF, MF, ZA, ZA, PT, MT, ZA},
            {MT, PT, PF, PT, MF, ZA, ZA, MT, PT, PF, PF, ZA, ZA, PT, ZA, MT, ZA, MT},
            {MT, MF, MT, PT, MT, MF, MF, MT, MT, PT, PT, PT, MT, ZA, ZA, PT, PF, PT},
            {PF, MF, MF, ZA, MT, PF, PT, MF, PF, ZA, PT, PT, ZA, ZA, MF, PT, MF, PF},
            {PT, PT, PF, MF, ZA, PF, PF, PT, ZA, ZA, MT, ZA, ZA, MT, PT, ZA, ZA, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat46.png", "666x700"}, "Minolovec");
    }
}
