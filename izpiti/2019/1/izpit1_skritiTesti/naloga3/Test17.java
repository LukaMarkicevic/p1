// _NE_ODSTRANI_

public class Test17 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, PT, MF, MF, MT, MT, PT, PT, MT, PF, PT, PT, PT, PF, PT, PT, PT, PF, PF, PT},
            {PT, PF, MF, MF, PT, PT, MT, PF, MF, PF, PT, PF, MF, MF, PT, PT, PT, PF, PF, MF},
            {PF, PF, MF, PF, MF, PF, PF, PT, PT, PF, PT, PT, PT, PF, PT, PF, PT, MF, PF, MF},
            {PT, PF, PF, PF, MT, PF, PT, PF, PT, MT, PT, PF, PT, PF, MF, PT, MT, MF, PF, MF},
            {MF, PT, PT, PF, MT, MF, MT, PF, MT, MT, MF, MF, MT, PF, MF, PF, PT, PF, PF, MT},
            {PF, PT, PT, MT, MF, PF, PF, PT, MF, MF, MT, PF, MF, PT, PF, PF, MT, PF, PF, MF},
            {MT, PT, PT, PF, PT, PT, PT, PF, PT, MF, MF, PT, PT, PT, PT, PF, PF, PT, MF, MF},
            {PF, PF, PT, PT, PF, PT, PF, PT, PT, PT, PF, PT, PT, PF, PF, PT, PT, PF, MF, PF},
            {MF, PF, PF, PT, PT, MF, MT, PF, PF, PF, PF, MT, PF, PF, PF, PF, PF, MT, PF, PF},
            {PF, PF, MF, PF, MT, PT, PT, MT, PF, PT, MT, PF, PF, MT, MT, MT, PT, MT, PF, PF},
            {PT, PT, PF, MT, PT, PT, MF, MT, MF, PT, PT, MT, PF, PF, MF, PF, PF, PF, PT, PT},
            {PT, PF, PF, MT, PT, PF, MF, PT, PT, PF, PT, MF, MF, MT, PF, MT, PF, PT, PT, PT},
            {MT, PF, PF, PT, PT, PF, PF, MF, MF, MF, PT, MF, PT, MF, PT, PF, PT, MT, PF, PF},
            {MF, PT, MT, PT, PT, PF, MF, PF, PT, MT, PF, PT, MF, MT, PF, PT, MT, PT, PF, MF},
            {PT, PT, PF, PF, MT, MF, PF, PT, MT, PT, PT, MT, PF, PT, MF, PT, PF, PT, PT, MT},
            {PF, MT, PT, MT, PT, MT, MT, PT, PT, PF, PT, PT, PF, PF, PT, MT, MF, PT, MF, PT},
            {PF, PF, PT, PT, PF, PT, PF, PT, PF, MT, PF, MF, MF, PF, PF, MF, PT, PT, PF, MT},
            {PF, PF, PF, MT, PF, PT, PT, MT, PT, PT, PF, PT, MF, PF, MF, PT, MT, PF, PF, PT},
            {PT, PT, MF, PF, PF, PF, PF, MT, MF, MT, PT, PT, PF, PF, PF, PF, PT, PT, MF, PF},
            {PT, PT, PF, PT, PT, PT, PF, PT, MF, MF, PF, PT, MF, MT, MT, PT, PF, MF, MT, MF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat17.png", "760x760"}, "Minolovec");
    }
}
