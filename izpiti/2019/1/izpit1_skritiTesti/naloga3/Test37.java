// _NE_ODSTRANI_

public class Test37 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PT, PF, PF, PT, PT, MF, PT, PT, PT, MT},
            {PF, MT, PT, MF, PF, MT, PT, PT, PT, PT},
            {PT, PF, PT, MT, PF, PT, PF, PT, PT, PT},
            {PT, PF, PF, PF, PF, PF, PT, PT, PT, PT},
            {PF, MF, PT, PF, MT, MT, PF, PF, MF, MF},
            {MF, PT, MT, MF, PF, PT, PT, PT, PT, PT},
            {PF, MT, MT, PT, PF, MF, PF, PT, PT, MF},
            {PT, MT, PF, MT, MF, PT, PT, MF, PF, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat37.png", "410x536"}, "Minolovec");
    }
}
