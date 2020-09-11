// _NE_ODSTRANI_

public class Test28 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MT, MF, PT, PF, MF, MF, MT, PF, PT, PT, PF, PF, PT, PF, PF, PT, PT, MF, PF, MF},
            {PT, PF, PF, MT, MT, PT, PT, MF, MF, PT, PF, PF, PF, PT, PT, PT, MT, MT, PF, MF},
            {MF, PT, MT, PF, PT, PT, PF, PF, MT, PT, PF, PF, PF, PT, PT, PF, PF, MT, MF, MT},
            {PF, PF, MT, PF, PT, PT, MT, MF, PF, PT, PT, PF, PT, PF, PF, PF, PF, PF, MT, PF},
            {PF, MT, PT, MT, PT, PT, MT, MT, MF, MT, PT, PT, PF, PF, PF, PF, MT, MF, PF, PT},
            {PT, PT, MF, PT, PF, PT, PT, PT, PF, PT, PT, MT, PT, MF, PF, PF, PT, MF, MT, PT},
            {MF, MF, MT, PT, PT, MF, PF, MF, PT, PT, MF, PT, PT, MF, PT, PF, MF, PF, PT, MT},
            {MF, PT, PF, PT, PT, PT, PT, PT, PF, PF, PF, MT, PF, MF, PF, MF, PT, PF, MF, MF},
            {PF, PF, PT, MF, PF, PF, PT, PF, PT, PF, PF, PF, PT, PT, PT, MT, PT, PT, PF, PT},
            {PT, PT, PF, PT, PT, PF, PF, PF, PT, PT, PF, PT, PF, PT, PT, PT, PT, PT, MF, PT},
            {MF, PF, PF, MT, MT, PF, PF, MF, PF, PT, PF, MF, MF, PT, PT, MF, PT, PF, PF, PT},
            {PF, MT, PF, MF, PF, MF, MF, PT, MF, MF, MT, PF, PT, PT, PF, PT, PF, PT, PT, MF},
            {PT, PT, PF, PT, PT, PT, PF, PT, MF, PT, MF, PT, PT, PF, MF, PF, PF, MT, PF, PF},
            {PT, PT, PT, MT, PT, PT, PT, PF, MF, PF, PF, MT, MF, PT, MF, PF, PF, PF, PT, PF},
            {MT, MT, PF, PF, PF, MF, PF, PT, MF, MT, PF, MF, MT, PF, PT, PT, MT, MF, PT, PT},
            {MT, PT, MT, MF, MF, PF, MT, PF, PF, PT, MT, PT, PT, PF, MF, PF, PF, PT, PF, MT},
            {PT, PT, PF, PF, PF, PF, MT, PF, PT, MF, MT, PF, PF, PF, MF, PF, MF, PT, PT, PT},
            {PT, MT, MT, MT, PT, PF, PT, PF, MF, MT, MF, PT, MF, PF, MT, MT, PF, PT, PT, PT},
            {MF, PF, MT, PT, MT, PT, MT, PT, PT, PF, MF, PF, PF, PT, PF, PF, MT, MT, PF, PT},
            {MF, PF, MT, PT, MF, MF, PT, MT, MF, PF, PF, MT, MT, PF, PF, PF, PF, PT, MF, MT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat28.png", "440x580"}, "Minolovec");
    }
}
