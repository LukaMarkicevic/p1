// _NE_ODSTRANI_

import java.awt.*;

public class Test32 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.20, 0.20, 0.70, 0.65, 11, Color.PINK),
            new Tretja.OknoStatusna(0.15, 0.10, 0.45, 0.60, 10, Color.GREEN),
            new Tretja.OknoStatusna(0.05, 0.45, 0.25, 0.30, 9, Color.PINK),
            new Tretja.OknoStatusna(0.05, 0.50, 0.35, 0.20, 8, Color.ORANGE),
            new Tretja.OknoStatusna(0.15, 0.25, 0.40, 0.70, 7, Color.MAGENTA),
            new Tretja.OknoStatusna(0.15, 0.25, 0.65, 0.30, 6, Color.YELLOW),
            new Tretja.Okno(0.20, 0.10, 0.70, 0.70, 5, Color.GREEN),
            new Tretja.OknoStatusna(0.20, 0.40, 0.30, 0.20, 4, Color.CYAN),
            new Tretja.Okno(0.15, 0.10, 0.50, 0.70, 3, Color.ORANGE),
            new Tretja.OknoStatusna(0.25, 0.10, 0.65, 0.65, 2, Color.BLUE),
            new Tretja.Okno(0.45, 0.55, 0.45, 0.40, 1, Color.GREEN),
            new Tretja.Okno(0.40, 0.65, 0.45, 0.20, 0, Color.PINK),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat32.png", "520x640"}, "Okna");
    }
}
