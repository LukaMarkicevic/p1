// _NE_ODSTRANI_

import java.awt.*;

public class Test40 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.30, 0.45, 0.65, 0.30, 0, Color.BLUE),
            new Tretja.Okno(0.70, 0.15, 0.25, 0.45, 5, Color.RED),
            new Tretja.Okno(0.50, 0.45, 0.25, 0.20, 3, Color.PINK),
            new Tretja.OknoStatusna(0.40, 0.25, 0.40, 0.25, 6, Color.YELLOW),
            new Tretja.Okno(0.30, 0.10, 0.20, 0.45, 9, Color.MAGENTA),
            new Tretja.OknoStatusna(0.25, 0.05, 0.35, 0.40, 2, Color.CYAN),
            new Tretja.Okno(0.15, 0.35, 0.70, 0.50, 1, Color.CYAN),
            new Tretja.Okno(0.30, 0.25, 0.45, 0.70, 8, Color.ORANGE),
            new Tretja.OknoStatusna(0.55, 0.25, 0.35, 0.20, 4, Color.GREEN),
            new Tretja.OknoStatusna(0.10, 0.15, 0.45, 0.65, 7, Color.CYAN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat40.png", "760x640"}, "Okna");
    }
}
