// _NE_ODSTRANI_

import java.awt.*;

public class Test18 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.55, 0.20, 0.40, 0.40, 2, Color.PINK),
            new Tretja.Okno(0.20, 0.20, 0.70, 0.35, 1, Color.CYAN),
            new Tretja.Okno(0.05, 0.05, 0.60, 0.70, 0, Color.ORANGE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat18.png", "600x600"}, "Okna");
    }
}
