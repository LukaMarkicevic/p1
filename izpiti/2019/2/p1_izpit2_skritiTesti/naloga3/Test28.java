// _NE_ODSTRANI_

import java.awt.*;

public class Test28 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.05, 0.20, 0.35, 0.60, 7, Color.CYAN),
            new Tretja.Okno(0.05, 0.25, 0.45, 0.65, 6, Color.ORANGE),
            new Tretja.Okno(0.10, 0.15, 0.20, 0.50, 5, Color.YELLOW),
            new Tretja.Okno(0.25, 0.25, 0.70, 0.45, 4, Color.GREEN),
            new Tretja.Okno(0.20, 0.15, 0.20, 0.55, 3, Color.MAGENTA),
            new Tretja.Okno(0.35, 0.20, 0.45, 0.50, 2, Color.ORANGE),
            new Tretja.Okno(0.10, 0.45, 0.55, 0.40, 1, Color.GREEN),
            new Tretja.Okno(0.25, 0.25, 0.55, 0.50, 0, Color.RED),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat28.png", "680x680"}, "Okna");
    }
}
