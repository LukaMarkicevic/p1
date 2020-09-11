// _NE_ODSTRANI_

import java.awt.*;

public class Test29 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.25, 0.30, 0.35, 0.35, 13, Color.ORANGE),
            new Tretja.Okno(0.30, 0.05, 0.45, 0.55, 12, Color.RED),
            new Tretja.Okno(0.60, 0.45, 0.25, 0.30, 11, Color.BLUE),
            new Tretja.Okno(0.15, 0.10, 0.30, 0.60, 10, Color.BLUE),
            new Tretja.Okno(0.10, 0.20, 0.35, 0.45, 9, Color.BLUE),
            new Tretja.Okno(0.30, 0.50, 0.60, 0.40, 8, Color.CYAN),
            new Tretja.Okno(0.20, 0.10, 0.45, 0.65, 7, Color.MAGENTA),
            new Tretja.Okno(0.05, 0.65, 0.65, 0.25, 6, Color.PINK),
            new Tretja.Okno(0.20, 0.30, 0.30, 0.20, 5, Color.ORANGE),
            new Tretja.Okno(0.35, 0.40, 0.40, 0.35, 4, Color.ORANGE),
            new Tretja.Okno(0.10, 0.20, 0.40, 0.60, 3, Color.YELLOW),
            new Tretja.Okno(0.05, 0.10, 0.55, 0.25, 2, Color.RED),
            new Tretja.Okno(0.30, 0.25, 0.65, 0.30, 1, Color.CYAN),
            new Tretja.Okno(0.15, 0.15, 0.40, 0.70, 0, Color.ORANGE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat29.png", "480x760"}, "Okna");
    }
}
