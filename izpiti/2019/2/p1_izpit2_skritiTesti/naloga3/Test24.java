// _NE_ODSTRANI_

import java.awt.*;

public class Test24 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.45, 0.50, 0.45, 0.30, 12, Color.YELLOW),
            new Tretja.Okno(0.20, 0.10, 0.35, 0.45, 11, Color.YELLOW),
            new Tretja.OknoStatusna(0.20, 0.20, 0.60, 0.70, 10, Color.RED),
            new Tretja.Okno(0.40, 0.55, 0.40, 0.30, 9, Color.YELLOW),
            new Tretja.OknoStatusna(0.40, 0.40, 0.35, 0.25, 8, Color.CYAN),
            new Tretja.Okno(0.35, 0.35, 0.50, 0.55, 7, Color.BLUE),
            new Tretja.OknoStatusna(0.55, 0.05, 0.35, 0.50, 6, Color.GREEN),
            new Tretja.Okno(0.20, 0.10, 0.25, 0.70, 5, Color.BLUE),
            new Tretja.OknoStatusna(0.25, 0.15, 0.60, 0.50, 4, Color.PINK),
            new Tretja.Okno(0.25, 0.45, 0.45, 0.35, 3, Color.CYAN),
            new Tretja.OknoStatusna(0.05, 0.25, 0.60, 0.35, 2, Color.ORANGE),
            new Tretja.Okno(0.10, 0.15, 0.55, 0.45, 1, Color.BLUE),
            new Tretja.OknoStatusna(0.40, 0.10, 0.55, 0.60, 0, Color.RED),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat24.png", "640x640"}, "Okna");
    }
}
