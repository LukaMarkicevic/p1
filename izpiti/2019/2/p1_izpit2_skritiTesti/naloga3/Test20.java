// _NE_ODSTRANI_

import java.awt.*;

public class Test20 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.25, 0.15, 0.70, 0.50, 13, Color.ORANGE),
            new Tretja.Okno(0.20, 0.15, 0.35, 0.25, 12, Color.YELLOW),
            new Tretja.Okno(0.40, 0.20, 0.40, 0.60, 11, Color.YELLOW),
            new Tretja.Okno(0.15, 0.35, 0.45, 0.55, 10, Color.CYAN),
            new Tretja.Okno(0.10, 0.10, 0.70, 0.70, 9, Color.BLUE),
            new Tretja.Okno(0.50, 0.30, 0.45, 0.60, 8, Color.ORANGE),
            new Tretja.Okno(0.15, 0.65, 0.30, 0.25, 7, Color.YELLOW),
            new Tretja.Okno(0.50, 0.45, 0.20, 0.50, 6, Color.GREEN),
            new Tretja.Okno(0.05, 0.15, 0.55, 0.70, 5, Color.YELLOW),
            new Tretja.Okno(0.05, 0.45, 0.60, 0.40, 4, Color.PINK),
            new Tretja.Okno(0.30, 0.35, 0.50, 0.45, 3, Color.YELLOW),
            new Tretja.Okno(0.50, 0.15, 0.35, 0.70, 2, Color.MAGENTA),
            new Tretja.Okno(0.05, 0.15, 0.25, 0.45, 1, Color.YELLOW),
            new Tretja.Okno(0.05, 0.45, 0.30, 0.35, 0, Color.MAGENTA),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat20.png", "640x640"}, "Okna");
    }
}
