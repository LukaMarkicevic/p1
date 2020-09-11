// _NE_ODSTRANI_

import java.awt.*;

public class Test36 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.05, 0.30, 0.70, 0.20, 0, Color.BLUE),
            new Tretja.Okno(0.40, 0.25, 0.45, 0.60, 5, Color.YELLOW),
            new Tretja.Okno(0.05, 0.25, 0.70, 0.25, 10, Color.ORANGE),
            new Tretja.Okno(0.20, 0.65, 0.65, 0.25, 6, Color.BLUE),
            new Tretja.OknoStatusna(0.10, 0.25, 0.30, 0.30, 3, Color.RED),
            new Tretja.OknoStatusna(0.20, 0.25, 0.20, 0.70, 9, Color.CYAN),
            new Tretja.Okno(0.35, 0.25, 0.60, 0.60, 7, Color.RED),
            new Tretja.OknoStatusna(0.25, 0.25, 0.70, 0.50, 2, Color.GREEN),
            new Tretja.Okno(0.75, 0.55, 0.20, 0.25, 13, Color.YELLOW),
            new Tretja.Okno(0.25, 0.10, 0.70, 0.30, 12, Color.PINK),
            new Tretja.Okno(0.15, 0.45, 0.35, 0.40, 14, Color.BLUE),
            new Tretja.Okno(0.05, 0.15, 0.20, 0.45, 11, Color.BLUE),
            new Tretja.Okno(0.35, 0.40, 0.50, 0.55, 4, Color.ORANGE),
            new Tretja.OknoStatusna(0.10, 0.40, 0.45, 0.35, 1, Color.BLUE),
            new Tretja.OknoStatusna(0.20, 0.10, 0.70, 0.60, 8, Color.ORANGE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat36.png", "440x600"}, "Okna");
    }
}
