// _NE_ODSTRANI_

import java.awt.*;

public class Test30 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.40, 0.55, 0.45, 0.30, 11, Color.ORANGE),
            new Tretja.Okno(0.55, 0.25, 0.20, 0.70, 10, Color.PINK),
            new Tretja.Okno(0.05, 0.30, 0.60, 0.50, 9, Color.CYAN),
            new Tretja.Okno(0.25, 0.25, 0.20, 0.55, 8, Color.GREEN),
            new Tretja.Okno(0.60, 0.40, 0.25, 0.25, 7, Color.BLUE),
            new Tretja.Okno(0.10, 0.40, 0.70, 0.35, 6, Color.YELLOW),
            new Tretja.Okno(0.15, 0.35, 0.50, 0.50, 5, Color.RED),
            new Tretja.Okno(0.20, 0.05, 0.65, 0.45, 4, Color.MAGENTA),
            new Tretja.Okno(0.05, 0.50, 0.45, 0.45, 3, Color.MAGENTA),
            new Tretja.Okno(0.10, 0.60, 0.55, 0.35, 2, Color.YELLOW),
            new Tretja.Okno(0.10, 0.45, 0.60, 0.45, 1, Color.GREEN),
            new Tretja.Okno(0.20, 0.20, 0.70, 0.70, 0, Color.GREEN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat30.png", "640x760"}, "Okna");
    }
}
