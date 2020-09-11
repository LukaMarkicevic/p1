// _NE_ODSTRANI_

public class Test40 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {PF, PT, PF, PT, PF, PF, PF, MT},
            {PF, MT, PT, PF, PT, MT, PF, PT},
            {PF, PT, PT, PF, PT, PF, PF, PF},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat40.png", "584x483"}, "Minolovec");
    }
}
