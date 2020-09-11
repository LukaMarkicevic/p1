// _NE_ODSTRANI_

import java.awt.*;

public class Test12 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.20, 0.35, 0.45, 0.50, 8, Color.PINK),
            new Tretja.Okno(0.15, 0.20, 0.55, 0.70, 7, Color.YELLOW),
            new Tretja.Okno(0.55, 0.10, 0.20, 0.55, 6, Color.BLUE),
            new Tretja.Okno(0.25, 0.15, 0.25, 0.25, 5, Color.MAGENTA),
            new Tretja.Okno(0.05, 0.40, 0.70, 0.55, 4, Color.RED),
            new Tretja.Okno(0.55, 0.20, 0.40, 0.70, 3, Color.YELLOW),
            new Tretja.Okno(0.60, 0.55, 0.20, 0.40, 2, Color.RED),
            new Tretja.Okno(0.30, 0.65, 0.50, 0.30, 1, Color.PINK),
            new Tretja.Okno(0.50, 0.40, 0.40, 0.55, 0, Color.RED),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat12.png", "560x560"}, "Okna");
    }
}
