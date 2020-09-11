// _NE_ODSTRANI_

import java.awt.*;

public class Test21 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.15, 0.45, 0.65, 0.40, 8, Color.YELLOW),
            new Tretja.Okno(0.20, 0.40, 0.25, 0.55, 7, Color.PINK),
            new Tretja.Okno(0.30, 0.30, 0.45, 0.50, 6, Color.BLUE),
            new Tretja.Okno(0.15, 0.30, 0.50, 0.50, 5, Color.RED),
            new Tretja.Okno(0.35, 0.45, 0.55, 0.30, 4, Color.BLUE),
            new Tretja.Okno(0.15, 0.40, 0.50, 0.45, 3, Color.CYAN),
            new Tretja.Okno(0.15, 0.05, 0.55, 0.40, 2, Color.ORANGE),
            new Tretja.Okno(0.20, 0.20, 0.25, 0.55, 1, Color.BLUE),
            new Tretja.OknoStatusna(0.10, 0.25, 0.50, 0.70, 0, Color.ORANGE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat21.png", "400x400"}, "Okna");
    }
}
