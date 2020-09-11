// _NE_ODSTRANI_

import java.awt.*;

public class Test15 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.10, 0.05, 0.70, 0.45, 3, Color.RED),
            new Tretja.Okno(0.05, 0.50, 0.45, 0.40, 2, Color.BLUE),
            new Tretja.Okno(0.55, 0.35, 0.35, 0.30, 1, Color.PINK),
            new Tretja.Okno(0.35, 0.15, 0.40, 0.50, 0, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat15.png", "440x440"}, "Okna");
    }
}
