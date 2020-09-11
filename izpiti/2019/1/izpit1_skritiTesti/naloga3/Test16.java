// _NE_ODSTRANI_

public class Test16 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MF, MT, PT, MT, MF, PF, MT, PT, PT, PF, PF, PF, PF, MF, MT},
            {PT, MF, PF, PF, MF, PF, PF, PT, PF, MF, PF, PF, PT, PT, PT},
            {PF, MT, PF, MF, MT, MT, PT, PF, PT, MT, PF, PF, PT, PF, PF},
            {MT, PT, PF, PF, PT, PT, PF, MT, PF, MT, MF, MF, PT, PF, PT},
            {PT, PF, MF, PT, PT, MT, MT, MT, MT, PF, PF, MT, MT, MT, PF},
            {PF, PF, PF, MF, PF, MF, PT, MF, PT, MF, PT, PF, PT, PF, PT},
            {PF, PT, MT, MF, PF, PT, PF, PF, PT, MT, PT, MT, PF, PF, PF},
            {PF, PT, PT, MT, PF, MT, PT, MF, MT, PF, MF, PT, MT, PF, MF},
            {PF, PF, PF, PF, PF, MF, MT, PT, MF, MF, PT, PT, MT, PT, PT},
            {PF, MF, PT, PF, PT, MF, MT, PF, PF, PF, PT, PF, PF, PF, PF},
            {PF, MF, PF, MF, PT, MF, PF, MT, PF, MF, PT, PF, PT, PT, PF},
            {PT, PT, PF, PF, PT, MT, PT, PF, PT, PF, PT, PT, PT, PT, PT},
            {PF, PT, MF, PF, PT, PF, PF, PF, PF, PT, MF, PT, MF, PT, MF},
            {PF, PF, PT, MT, PF, MT, PF, PT, PT, MF, MF, PT, MF, MF, PT},
            {PT, MT, PF, PT, PT, MF, MF, PT, MF, PF, PF, PT, MT, PF, MF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat16.png", "720x720"}, "Minolovec");
    }
}
