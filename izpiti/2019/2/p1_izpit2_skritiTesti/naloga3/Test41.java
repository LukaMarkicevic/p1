// _NE_ODSTRANI_

import java.awt.*;

public class Test41 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.05, 0.20, 0.55, 0.65, 13, Color.BLUE),
            new Tretja.OknoStatusna(0.20, 0.60, 0.40, 0.35, 1, Color.MAGENTA),
            new Tretja.Okno(0.05, 0.10, 0.70, 0.50, 2, Color.CYAN),
            new Tretja.Okno(0.45, 0.20, 0.40, 0.55, 6, Color.MAGENTA),
            new Tretja.Okno(0.25, 0.25, 0.30, 0.70, 9, Color.PINK),
            new Tretja.Okno(0.15, 0.10, 0.60, 0.70, 10, Color.RED),
            new Tretja.OknoStatusna(0.35, 0.35, 0.25, 0.40, 5, Color.GREEN),
            new Tretja.Okno(0.35, 0.20, 0.30, 0.55, 4, Color.RED),
            new Tretja.OknoStatusna(0.10, 0.10, 0.35, 0.30, 8, Color.BLUE),
            new Tretja.OknoStatusna(0.35, 0.20, 0.20, 0.50, 3, Color.BLUE),
            new Tretja.Okno(0.35, 0.15, 0.50, 0.65, 11, Color.GREEN),
            new Tretja.Okno(0.45, 0.40, 0.50, 0.25, 0, Color.MAGENTA),
            new Tretja.OknoStatusna(0.30, 0.35, 0.20, 0.25, 7, Color.MAGENTA),
            new Tretja.OknoStatusna(0.20, 0.35, 0.45, 0.55, 12, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat41.png", "600x400"}, "Okna");
    }
}
