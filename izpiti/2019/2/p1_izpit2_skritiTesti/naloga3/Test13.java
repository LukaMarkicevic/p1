// _NE_ODSTRANI_

import java.awt.*;

public class Test13 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.30, 0.20, 0.55, 0.50, 13, Color.RED),
            new Tretja.Okno(0.35, 0.30, 0.20, 0.30, 12, Color.CYAN),
            new Tretja.Okno(0.40, 0.30, 0.20, 0.65, 11, Color.GREEN),
            new Tretja.Okno(0.25, 0.50, 0.25, 0.30, 10, Color.MAGENTA),
            new Tretja.Okno(0.30, 0.10, 0.45, 0.35, 9, Color.RED),
            new Tretja.Okno(0.05, 0.50, 0.65, 0.30, 8, Color.GREEN),
            new Tretja.Okno(0.15, 0.35, 0.50, 0.55, 7, Color.BLUE),
            new Tretja.Okno(0.15, 0.20, 0.55, 0.60, 6, Color.MAGENTA),
            new Tretja.Okno(0.10, 0.30, 0.55, 0.65, 5, Color.GREEN),
            new Tretja.Okno(0.15, 0.50, 0.65, 0.45, 4, Color.YELLOW),
            new Tretja.Okno(0.05, 0.10, 0.50, 0.70, 3, Color.MAGENTA),
            new Tretja.Okno(0.35, 0.30, 0.50, 0.60, 2, Color.RED),
            new Tretja.Okno(0.25, 0.20, 0.35, 0.55, 1, Color.MAGENTA),
            new Tretja.Okno(0.40, 0.20, 0.25, 0.70, 0, Color.PINK),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat13.png", "640x640"}, "Okna");
    }
}
