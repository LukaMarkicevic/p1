// _NE_ODSTRANI_

import java.awt.*;

public class Test42 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.30, 0.20, 0.60, 0.65, 11, Color.BLUE),
            new Tretja.Okno(0.35, 0.10, 0.35, 0.70, 3, Color.ORANGE),
            new Tretja.OknoStatusna(0.10, 0.45, 0.70, 0.30, 10, Color.YELLOW),
            new Tretja.OknoStatusna(0.15, 0.15, 0.45, 0.25, 8, Color.GREEN),
            new Tretja.Okno(0.40, 0.40, 0.35, 0.50, 2, Color.RED),
            new Tretja.OknoStatusna(0.60, 0.20, 0.25, 0.40, 1, Color.CYAN),
            new Tretja.OknoStatusna(0.30, 0.05, 0.60, 0.20, 4, Color.MAGENTA),
            new Tretja.Okno(0.25, 0.20, 0.70, 0.60, 7, Color.RED),
            new Tretja.Okno(0.20, 0.30, 0.40, 0.50, 9, Color.MAGENTA),
            new Tretja.OknoStatusna(0.10, 0.30, 0.50, 0.60, 0, Color.CYAN),
            new Tretja.OknoStatusna(0.45, 0.05, 0.30, 0.65, 5, Color.GREEN),
            new Tretja.Okno(0.25, 0.25, 0.60, 0.60, 6, Color.PINK),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat42.png", "520x680"}, "Okna");
    }
}
