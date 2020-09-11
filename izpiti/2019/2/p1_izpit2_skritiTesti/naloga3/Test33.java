// _NE_ODSTRANI_

import java.awt.*;

public class Test33 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.45, 0.15, 0.50, 0.25, 9, Color.ORANGE),
            new Tretja.OknoStatusna(0.30, 0.20, 0.65, 0.45, 8, Color.YELLOW),
            new Tretja.Okno(0.10, 0.20, 0.20, 0.70, 7, Color.ORANGE),
            new Tretja.OknoStatusna(0.05, 0.30, 0.55, 0.40, 6, Color.CYAN),
            new Tretja.Okno(0.30, 0.15, 0.65, 0.20, 5, Color.BLUE),
            new Tretja.Okno(0.40, 0.10, 0.35, 0.55, 4, Color.RED),
            new Tretja.OknoStatusna(0.60, 0.25, 0.25, 0.55, 3, Color.BLUE),
            new Tretja.OknoStatusna(0.50, 0.40, 0.20, 0.35, 2, Color.RED),
            new Tretja.OknoStatusna(0.05, 0.05, 0.55, 0.55, 1, Color.GREEN),
            new Tretja.Okno(0.15, 0.05, 0.30, 0.60, 0, Color.MAGENTA),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat33.png", "560x800"}, "Okna");
    }
}
