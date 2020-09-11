// _NE_ODSTRANI_

import java.awt.*;

public class Test27 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.45, 0.25, 0.30, 0.40, 10, Color.ORANGE),
            new Tretja.Okno(0.60, 0.50, 0.30, 0.25, 9, Color.CYAN),
            new Tretja.Okno(0.35, 0.15, 0.25, 0.70, 8, Color.PINK),
            new Tretja.Okno(0.45, 0.55, 0.30, 0.40, 7, Color.YELLOW),
            new Tretja.Okno(0.10, 0.70, 0.55, 0.20, 6, Color.ORANGE),
            new Tretja.Okno(0.25, 0.45, 0.45, 0.50, 5, Color.CYAN),
            new Tretja.Okno(0.10, 0.70, 0.70, 0.20, 4, Color.RED),
            new Tretja.Okno(0.15, 0.50, 0.65, 0.45, 3, Color.MAGENTA),
            new Tretja.Okno(0.30, 0.25, 0.35, 0.65, 2, Color.MAGENTA),
            new Tretja.Okno(0.45, 0.15, 0.40, 0.20, 1, Color.GREEN),
            new Tretja.Okno(0.10, 0.25, 0.50, 0.30, 0, Color.RED),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat27.png", "680x560"}, "Okna");
    }
}
