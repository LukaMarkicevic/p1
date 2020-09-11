// _NE_ODSTRANI_

import java.awt.*;

public class Test34 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.30, 0.10, 0.25, 0.30, 13, Color.BLUE),
            new Tretja.Okno(0.10, 0.25, 0.35, 0.70, 12, Color.MAGENTA),
            new Tretja.Okno(0.30, 0.20, 0.45, 0.70, 11, Color.BLUE),
            new Tretja.Okno(0.25, 0.45, 0.65, 0.35, 10, Color.CYAN),
            new Tretja.Okno(0.30, 0.25, 0.35, 0.55, 9, Color.ORANGE),
            new Tretja.OknoStatusna(0.65, 0.35, 0.30, 0.45, 8, Color.YELLOW),
            new Tretja.Okno(0.20, 0.60, 0.70, 0.25, 7, Color.YELLOW),
            new Tretja.OknoStatusna(0.20, 0.15, 0.55, 0.60, 6, Color.YELLOW),
            new Tretja.Okno(0.15, 0.15, 0.55, 0.70, 5, Color.GREEN),
            new Tretja.OknoStatusna(0.60, 0.40, 0.20, 0.50, 4, Color.BLUE),
            new Tretja.OknoStatusna(0.10, 0.10, 0.60, 0.30, 3, Color.RED),
            new Tretja.OknoStatusna(0.55, 0.25, 0.30, 0.50, 2, Color.BLUE),
            new Tretja.OknoStatusna(0.25, 0.35, 0.70, 0.55, 1, Color.YELLOW),
            new Tretja.OknoStatusna(0.05, 0.40, 0.35, 0.55, 0, Color.RED),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat34.png", "600x520"}, "Okna");
    }
}
