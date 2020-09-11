// _NE_ODSTRANI_

import java.awt.*;

public class Test17 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.50, 0.25, 0.35, 0.40, 14, Color.MAGENTA),
            new Tretja.Okno(0.20, 0.15, 0.50, 0.25, 13, Color.GREEN),
            new Tretja.Okno(0.05, 0.10, 0.55, 0.65, 12, Color.MAGENTA),
            new Tretja.Okno(0.30, 0.20, 0.45, 0.35, 11, Color.GREEN),
            new Tretja.Okno(0.35, 0.25, 0.50, 0.55, 10, Color.PINK),
            new Tretja.Okno(0.25, 0.35, 0.20, 0.20, 9, Color.BLUE),
            new Tretja.Okno(0.15, 0.10, 0.65, 0.30, 8, Color.GREEN),
            new Tretja.Okno(0.15, 0.55, 0.25, 0.20, 7, Color.BLUE),
            new Tretja.Okno(0.30, 0.10, 0.65, 0.25, 6, Color.GREEN),
            new Tretja.Okno(0.25, 0.40, 0.25, 0.30, 5, Color.PINK),
            new Tretja.Okno(0.25, 0.20, 0.40, 0.60, 4, Color.RED),
            new Tretja.Okno(0.30, 0.05, 0.20, 0.40, 3, Color.GREEN),
            new Tretja.Okno(0.35, 0.25, 0.55, 0.25, 2, Color.YELLOW),
            new Tretja.Okno(0.25, 0.55, 0.45, 0.20, 1, Color.YELLOW),
            new Tretja.Okno(0.20, 0.05, 0.60, 0.60, 0, Color.GREEN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat17.png", "400x400"}, "Okna");
    }
}
