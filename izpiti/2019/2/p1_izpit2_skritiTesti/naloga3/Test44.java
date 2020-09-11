// _NE_ODSTRANI_

import java.awt.*;

public class Test44 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.15, 0.25, 0.60, 0.50, 4, Color.PINK),
            new Tretja.OknoStatusna(0.15, 0.20, 0.65, 0.60, 1, Color.GREEN),
            new Tretja.OknoStatusna(0.20, 0.25, 0.25, 0.20, 13, Color.PINK),
            new Tretja.Okno(0.05, 0.45, 0.60, 0.45, 8, Color.ORANGE),
            new Tretja.Okno(0.10, 0.25, 0.65, 0.65, 5, Color.YELLOW),
            new Tretja.OknoStatusna(0.45, 0.10, 0.40, 0.60, 12, Color.PINK),
            new Tretja.OknoStatusna(0.05, 0.65, 0.70, 0.30, 3, Color.MAGENTA),
            new Tretja.OknoStatusna(0.50, 0.10, 0.30, 0.25, 7, Color.ORANGE),
            new Tretja.Okno(0.05, 0.35, 0.60, 0.30, 9, Color.PINK),
            new Tretja.OknoStatusna(0.15, 0.20, 0.50, 0.45, 10, Color.BLUE),
            new Tretja.Okno(0.15, 0.55, 0.65, 0.30, 11, Color.RED),
            new Tretja.Okno(0.35, 0.25, 0.55, 0.55, 0, Color.BLUE),
            new Tretja.Okno(0.60, 0.15, 0.30, 0.60, 6, Color.BLUE),
            new Tretja.Okno(0.55, 0.10, 0.40, 0.40, 14, Color.MAGENTA),
            new Tretja.OknoStatusna(0.25, 0.30, 0.35, 0.65, 2, Color.BLUE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat44.png", "800x680"}, "Okna");
    }
}
