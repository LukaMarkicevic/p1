// _NE_ODSTRANI_

import java.awt.*;

public class Test35 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.05, 0.35, 0.35, 0.50, 12, Color.CYAN),
            new Tretja.OknoStatusna(0.25, 0.50, 0.45, 0.35, 11, Color.RED),
            new Tretja.OknoStatusna(0.05, 0.45, 0.70, 0.25, 10, Color.CYAN),
            new Tretja.Okno(0.55, 0.45, 0.40, 0.20, 9, Color.PINK),
            new Tretja.Okno(0.25, 0.65, 0.45, 0.20, 8, Color.YELLOW),
            new Tretja.Okno(0.50, 0.05, 0.35, 0.30, 7, Color.BLUE),
            new Tretja.Okno(0.15, 0.10, 0.30, 0.25, 6, Color.BLUE),
            new Tretja.Okno(0.40, 0.35, 0.40, 0.55, 5, Color.PINK),
            new Tretja.OknoStatusna(0.20, 0.30, 0.45, 0.55, 4, Color.YELLOW),
            new Tretja.Okno(0.05, 0.05, 0.50, 0.35, 3, Color.GREEN),
            new Tretja.OknoStatusna(0.10, 0.20, 0.55, 0.60, 2, Color.YELLOW),
            new Tretja.Okno(0.25, 0.40, 0.60, 0.35, 1, Color.RED),
            new Tretja.Okno(0.35, 0.05, 0.45, 0.70, 0, Color.RED),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat35.png", "480x480"}, "Okna");
    }
}
