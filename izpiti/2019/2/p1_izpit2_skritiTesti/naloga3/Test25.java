// _NE_ODSTRANI_

import java.awt.*;

public class Test25 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.40, 0.05, 0.20, 0.25, 14, Color.PINK),
            new Tretja.OknoStatusna(0.50, 0.25, 0.45, 0.55, 13, Color.BLUE),
            new Tretja.Okno(0.40, 0.05, 0.20, 0.20, 12, Color.ORANGE),
            new Tretja.OknoStatusna(0.15, 0.50, 0.65, 0.35, 11, Color.ORANGE),
            new Tretja.Okno(0.50, 0.10, 0.20, 0.55, 10, Color.YELLOW),
            new Tretja.OknoStatusna(0.15, 0.05, 0.70, 0.25, 9, Color.YELLOW),
            new Tretja.OknoStatusna(0.45, 0.60, 0.20, 0.30, 8, Color.PINK),
            new Tretja.Okno(0.10, 0.25, 0.70, 0.65, 7, Color.YELLOW),
            new Tretja.OknoStatusna(0.20, 0.30, 0.70, 0.55, 6, Color.MAGENTA),
            new Tretja.OknoStatusna(0.50, 0.50, 0.30, 0.35, 5, Color.YELLOW),
            new Tretja.OknoStatusna(0.30, 0.30, 0.50, 0.65, 4, Color.YELLOW),
            new Tretja.Okno(0.50, 0.50, 0.20, 0.25, 3, Color.PINK),
            new Tretja.Okno(0.20, 0.35, 0.70, 0.55, 2, Color.RED),
            new Tretja.Okno(0.05, 0.10, 0.35, 0.30, 1, Color.MAGENTA),
            new Tretja.OknoStatusna(0.20, 0.30, 0.70, 0.60, 0, Color.ORANGE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat25.png", "720x720"}, "Okna");
    }
}
