// _NE_ODSTRANI_

import java.awt.*;

public class Test19 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.10, 0.25, 0.60, 0.55, 2, Color.RED),
            new Tretja.Okno(0.05, 0.10, 0.35, 0.70, 1, Color.ORANGE),
            new Tretja.Okno(0.25, 0.40, 0.45, 0.35, 0, Color.ORANGE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat19.png", "800x800"}, "Okna");
    }
}
