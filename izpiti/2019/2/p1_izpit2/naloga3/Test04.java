// _NE_ODSTRANI_

import java.awt.*;

public class Test04 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.20, 0.30, 0.30, 0.45, 11, Color.PINK),
            new Tretja.Okno(0.20, 0.45, 0.60, 0.25, 10, Color.ORANGE),
            new Tretja.Okno(0.20, 0.30, 0.70, 0.35, 9, Color.RED),
            new Tretja.Okno(0.65, 0.15, 0.25, 0.60, 8, Color.BLUE),
            new Tretja.Okno(0.25, 0.10, 0.20, 0.65, 7, Color.MAGENTA),
            new Tretja.Okno(0.10, 0.55, 0.55, 0.40, 6, Color.PINK),
            new Tretja.Okno(0.15, 0.55, 0.50, 0.30, 5, Color.ORANGE),
            new Tretja.Okno(0.30, 0.55, 0.55, 0.40, 4, Color.GREEN),
            new Tretja.Okno(0.15, 0.05, 0.40, 0.55, 3, Color.GREEN),
            new Tretja.Okno(0.45, 0.05, 0.30, 0.50, 2, Color.ORANGE),
            new Tretja.Okno(0.30, 0.45, 0.65, 0.35, 1, Color.PINK),
            new Tretja.Okno(0.15, 0.35, 0.70, 0.40, 0, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat04.png", "680x680"}, "Okna");
    }
}
