// _NE_ODSTRANI_

import java.awt.*;

public class Test46 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.15, 0.20, 0.45, 0.45, 12, Color.ORANGE),
            new Tretja.Okno(0.25, 0.75, 0.70, 0.20, 6, Color.BLUE),
            new Tretja.Okno(0.40, 0.55, 0.20, 0.35, 8, Color.BLUE),
            new Tretja.OknoStatusna(0.30, 0.25, 0.25, 0.25, 2, Color.GREEN),
            new Tretja.OknoStatusna(0.05, 0.35, 0.65, 0.35, 13, Color.ORANGE),
            new Tretja.OknoStatusna(0.70, 0.40, 0.25, 0.40, 1, Color.ORANGE),
            new Tretja.Okno(0.45, 0.25, 0.50, 0.30, 10, Color.RED),
            new Tretja.OknoStatusna(0.25, 0.05, 0.50, 0.25, 5, Color.YELLOW),
            new Tretja.OknoStatusna(0.60, 0.15, 0.35, 0.40, 14, Color.GREEN),
            new Tretja.OknoStatusna(0.35, 0.20, 0.50, 0.65, 0, Color.YELLOW),
            new Tretja.OknoStatusna(0.20, 0.50, 0.70, 0.30, 7, Color.ORANGE),
            new Tretja.Okno(0.40, 0.15, 0.40, 0.55, 11, Color.CYAN),
            new Tretja.OknoStatusna(0.25, 0.25, 0.65, 0.70, 4, Color.RED),
            new Tretja.Okno(0.25, 0.50, 0.20, 0.45, 9, Color.YELLOW),
            new Tretja.OknoStatusna(0.15, 0.40, 0.70, 0.55, 3, Color.ORANGE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat46.png", "800x640"}, "Okna");
    }
}
