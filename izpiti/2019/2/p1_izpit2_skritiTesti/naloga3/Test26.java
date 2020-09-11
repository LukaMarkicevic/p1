// _NE_ODSTRANI_

import java.awt.*;

public class Test26 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.10, 0.25, 0.55, 0.30, 12, Color.PINK),
            new Tretja.Okno(0.25, 0.15, 0.70, 0.55, 11, Color.YELLOW),
            new Tretja.Okno(0.40, 0.05, 0.55, 0.60, 10, Color.ORANGE),
            new Tretja.Okno(0.20, 0.05, 0.25, 0.60, 9, Color.RED),
            new Tretja.Okno(0.45, 0.20, 0.50, 0.60, 8, Color.YELLOW),
            new Tretja.Okno(0.10, 0.05, 0.70, 0.65, 7, Color.RED),
            new Tretja.Okno(0.35, 0.20, 0.45, 0.20, 6, Color.ORANGE),
            new Tretja.Okno(0.15, 0.75, 0.30, 0.20, 5, Color.GREEN),
            new Tretja.Okno(0.75, 0.55, 0.20, 0.20, 4, Color.CYAN),
            new Tretja.Okno(0.25, 0.50, 0.70, 0.35, 3, Color.MAGENTA),
            new Tretja.Okno(0.60, 0.35, 0.25, 0.45, 2, Color.YELLOW),
            new Tretja.Okno(0.35, 0.30, 0.60, 0.25, 1, Color.MAGENTA),
            new Tretja.Okno(0.05, 0.70, 0.35, 0.20, 0, Color.BLUE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat26.png", "400x760"}, "Okna");
    }
}
