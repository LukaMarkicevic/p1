// _NE_ODSTRANI_

import java.awt.*;

public class Test09 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.15, 0.55, 0.40, 0.20, 5, Color.GREEN),
            new Tretja.Okno(0.70, 0.60, 0.20, 0.20, 2, Color.YELLOW),
            new Tretja.OknoStatusna(0.20, 0.50, 0.50, 0.30, 0, Color.PINK),
            new Tretja.Okno(0.05, 0.65, 0.70, 0.30, 4, Color.MAGENTA),
            new Tretja.Okno(0.05, 0.20, 0.55, 0.70, 7, Color.MAGENTA),
            new Tretja.OknoStatusna(0.25, 0.10, 0.65, 0.50, 6, Color.RED),
            new Tretja.OknoStatusna(0.60, 0.55, 0.25, 0.35, 1, Color.CYAN),
            new Tretja.OknoStatusna(0.40, 0.20, 0.45, 0.60, 3, Color.CYAN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat09.png", "680x400"}, "Okna");
    }
}
