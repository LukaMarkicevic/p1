// _NE_ODSTRANI_

public class Test22 {

    private static final Tretja.Polje PT = new Tretja.Polje(true);
    private static final Tretja.Polje PF = new Tretja.Polje(false);
    private static final Tretja.Polje MT = new Tretja.Mina(true);
    private static final Tretja.Polje MF = new Tretja.Mina(false);
    private static final Tretja.Polje ZA = new Tretja.Zastavica();

    public static void main(String[] args) {

        Tretja.Polje[][] polja = {
            {MF, ZA, ZA, PT, PF, ZA, ZA},
            {PT, PF, PF, PF, ZA, ZA, PT},
            {MT, PF, PT, PT, ZA, MF, ZA},
            {PT, ZA, PT, PT, MT, MF, PT},
            {PT, ZA, PT, MT, PF, MT, ZA},
            {MF, MF, PT, ZA, MF, PT, ZA},
            {MT, PF, PT, MT, ZA, PF, PT},
        };

        Tretja tretja = new Tretja(polja);
        tretja.sproziRisanje(new String[]{"rezultat22.png", "469x469"}, "Minolovec");
    }
}
