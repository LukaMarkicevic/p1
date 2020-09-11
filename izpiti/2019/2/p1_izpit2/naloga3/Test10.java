// _NE_ODSTRANI_

import java.awt.*;

public class Test10 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.10, 0.40, 0.65, 0.50, 11, Color.MAGENTA),
            new Tretja.OknoStatusna(0.10, 0.60, 0.45, 0.25, 10, Color.BLUE),
            new Tretja.OknoStatusna(0.20, 0.20, 0.20, 0.45, 2, Color.MAGENTA),
            new Tretja.Okno(0.35, 0.45, 0.60, 0.35, 4, Color.PINK),
            new Tretja.OknoStatusna(0.30, 0.15, 0.40, 0.35, 7, Color.YELLOW),
            new Tretja.OknoStatusna(0.50, 0.10, 0.20, 0.55, 3, Color.GREEN),
            new Tretja.OknoStatusna(0.50, 0.35, 0.35, 0.25, 8, Color.RED),
            new Tretja.OknoStatusna(0.30, 0.05, 0.45, 0.70, 9, Color.YELLOW),
            new Tretja.Okno(0.20, 0.05, 0.65, 0.65, 6, Color.ORANGE),
            new Tretja.Okno(0.05, 0.45, 0.35, 0.35, 1, Color.GREEN),
            new Tretja.Okno(0.60, 0.15, 0.30, 0.40, 5, Color.YELLOW),
            new Tretja.OknoStatusna(0.20, 0.10, 0.70, 0.25, 0, Color.ORANGE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat10.png", "680x800"}, "Okna");
    }
}
