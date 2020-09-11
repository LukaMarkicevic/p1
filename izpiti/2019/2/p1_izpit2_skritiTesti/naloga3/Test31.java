// _NE_ODSTRANI_

import java.awt.*;

public class Test31 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.45, 0.45, 0.30, 0.50, 11, Color.GREEN),
            new Tretja.OknoStatusna(0.25, 0.15, 0.70, 0.20, 10, Color.ORANGE),
            new Tretja.Okno(0.10, 0.05, 0.45, 0.60, 9, Color.GREEN),
            new Tretja.OknoStatusna(0.50, 0.25, 0.30, 0.70, 8, Color.ORANGE),
            new Tretja.Okno(0.15, 0.40, 0.60, 0.40, 7, Color.BLUE),
            new Tretja.OknoStatusna(0.25, 0.15, 0.45, 0.30, 6, Color.RED),
            new Tretja.Okno(0.05, 0.50, 0.25, 0.25, 5, Color.RED),
            new Tretja.OknoStatusna(0.25, 0.35, 0.70, 0.25, 4, Color.GREEN),
            new Tretja.OknoStatusna(0.50, 0.10, 0.40, 0.30, 3, Color.YELLOW),
            new Tretja.OknoStatusna(0.40, 0.25, 0.50, 0.70, 2, Color.GREEN),
            new Tretja.Okno(0.40, 0.25, 0.20, 0.45, 1, Color.GREEN),
            new Tretja.OknoStatusna(0.65, 0.30, 0.30, 0.25, 0, Color.CYAN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat31.png", "760x560"}, "Okna");
    }
}
