// _NE_ODSTRANI_

public class Test36 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, PF, MT, PT, MF, PT, MT, PT, MT, PT, PF, MT, PF, PT, MF, PT, PF, PF, MF, PT},
            {PT, PT, PF, MT, PT, PF, PT, PT, MT, PF, MT, PF, MF, MF, PT, PF, MF, PF, PT, MT},
            {MT, PT, MT, PT, PF, PF, PF, PF, MT, PF, PT, PF, PF, PF, PT, PF, PF, PT, PF, PT},
            {PT, PT, PF, PT, MF, PF, PT, PT, MF, PT, MT, PF, PT, MT, PT, PF, PF, MF, PT, MT},
            {PT, PF, PF, PF, MF, PF, MT, MT, PT, PT, PF, MT, MF, PT, PT, PT, PF, PT, PT, PT},
            {PF, PT, PF, PT, MT, MT, PT, PT, PT, PF, PF, PT, PT, PF, PT, PT, PT, PF, PF, PF},
            {PT, PF, PF, MF, PT, PF, PF, MT, PT, MT, MT, MT, PT, PF, MF, PF, PT, PT, PF, PT},
            {MT, PT, MT, MF, PT, PF, PT, PT, PT, MT, MT, PT, MT, PF, MT, PF, PF, MF, PT, MF},
            {PT, PF, PT, PT, PT, MF, PT, PF, PT, MF, MT, MF, MT, PF, PT, PT, PF, PF, PF, PT},
            {MF, PF, PF, PF, PT, PT, PF, PT, PF, PT, MF, PT, PT, PT, PT, MF, PF, MF, MT, PF},
            {MT, MT, PT, PF, PT, PT, PT, PF, PF, MF, PF, PF, MF, PF, PF, PT, MT, MF, PF, MF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat36.png", "680x528"}, "Minolovec");
    }
}
