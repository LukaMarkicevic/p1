// _NE_ODSTRANI_

import java.awt.*;

public class Test16 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.15, 0.05, 0.25, 0.70, 9, Color.GREEN),
            new Tretja.Okno(0.60, 0.50, 0.20, 0.35, 8, Color.PINK),
            new Tretja.Okno(0.60, 0.30, 0.25, 0.20, 7, Color.RED),
            new Tretja.Okno(0.20, 0.25, 0.35, 0.40, 6, Color.YELLOW),
            new Tretja.Okno(0.05, 0.50, 0.65, 0.25, 5, Color.GREEN),
            new Tretja.Okno(0.35, 0.45, 0.45, 0.35, 4, Color.ORANGE),
            new Tretja.Okno(0.15, 0.20, 0.65, 0.50, 3, Color.CYAN),
            new Tretja.Okno(0.35, 0.20, 0.45, 0.50, 2, Color.BLUE),
            new Tretja.Okno(0.30, 0.15, 0.60, 0.30, 1, Color.PINK),
            new Tretja.Okno(0.15, 0.20, 0.50, 0.30, 0, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat16.png", "440x440"}, "Okna");
    }
}
