// _NE_ODSTRANI_

import java.awt.*;

public class Test39 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.45, 0.10, 0.25, 0.40, 8, Color.MAGENTA),
            new Tretja.OknoStatusna(0.30, 0.30, 0.60, 0.55, 5, Color.RED),
            new Tretja.OknoStatusna(0.05, 0.45, 0.70, 0.35, 2, Color.MAGENTA),
            new Tretja.OknoStatusna(0.10, 0.10, 0.30, 0.20, 4, Color.PINK),
            new Tretja.OknoStatusna(0.05, 0.10, 0.50, 0.65, 1, Color.RED),
            new Tretja.Okno(0.25, 0.15, 0.20, 0.45, 0, Color.ORANGE),
            new Tretja.Okno(0.45, 0.15, 0.35, 0.25, 3, Color.MAGENTA),
            new Tretja.OknoStatusna(0.30, 0.20, 0.60, 0.60, 7, Color.CYAN),
            new Tretja.Okno(0.65, 0.15, 0.30, 0.45, 6, Color.GREEN),
            new Tretja.Okno(0.05, 0.40, 0.45, 0.25, 9, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat39.png", "800x400"}, "Okna");
    }
}
