// _NE_ODSTRANI_

import java.awt.*;

public class Test22 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.25, 0.25, 0.70, 0.70, 7, Color.CYAN),
            new Tretja.OknoStatusna(0.30, 0.55, 0.60, 0.40, 6, Color.GREEN),
            new Tretja.Okno(0.60, 0.20, 0.20, 0.60, 5, Color.YELLOW),
            new Tretja.OknoStatusna(0.10, 0.30, 0.35, 0.20, 4, Color.MAGENTA),
            new Tretja.OknoStatusna(0.40, 0.20, 0.50, 0.65, 3, Color.PINK),
            new Tretja.Okno(0.20, 0.15, 0.25, 0.65, 2, Color.CYAN),
            new Tretja.OknoStatusna(0.25, 0.15, 0.30, 0.70, 1, Color.YELLOW),
            new Tretja.Okno(0.30, 0.65, 0.65, 0.25, 0, Color.GREEN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat22.png", "520x520"}, "Okna");
    }
}
