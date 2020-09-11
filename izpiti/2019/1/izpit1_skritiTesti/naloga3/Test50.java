// _NE_ODSTRANI_

public class Test50 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, MT, MF, PF, PT, PT, PF, PF, ZA, PT},
            {PT, PT, ZA, ZA, ZA, PF, ZA, PT, PT, MF},
            {ZA, PT, PF, MT, ZA, PF, PT, ZA, PT, PF},
            {ZA, ZA, PF, ZA, PF, PT, MF, MT, ZA, ZA},
            {PT, ZA, PT, ZA, MF, MF, MT, PT, PF, PT},
            {PT, PT, ZA, ZA, MT, PF, PF, ZA, ZA, MT},
            {ZA, MF, ZA, PF, MT, MF, MT, MF, PF, PT},
            {MT, ZA, PT, PT, PF, ZA, PF, ZA, ZA, PF},
            {ZA, MT, ZA, MT, MT, PF, PT, MF, ZA, PT},
            {ZA, PF, ZA, PT, MT, MT, ZA, ZA, ZA, MT},
            {MT, PF, PT, PF, MT, PT, ZA, PF, PT, MF},
            {PF, MF, PT, PT, MT, ZA, MF, ZA, MF, MT},
            {MT, PF, MT, ZA, ZA, ZA, ZA, PF, PF, MF},
            {PT, MF, PT, PF, PT, MT, MT, MF, MT, ZA},
            {PF, PF, MT, PF, PT, ZA, PF, ZA, PF, PT},
            {PF, PT, PT, ZA, PT, ZA, MT, PT, PF, PF},
            {PT, ZA, PF, PF, PF, PT, ZA, PT, ZA, PT},
            {MT, MF, ZA, PT, ZA, ZA, PT, PF, PF, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat50.png", "570x666"}, "Minolovec");
    }
}
