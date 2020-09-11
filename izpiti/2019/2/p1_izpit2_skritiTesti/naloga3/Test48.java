// _NE_ODSTRANI_

import java.awt.*;

public class Test48 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.45, 0.25, 0.50, 0.50, 8, Color.CYAN),
            new Tretja.OknoStatusna(0.30, 0.50, 0.40, 0.25, 7, Color.GREEN),
            new Tretja.Okno(0.40, 0.40, 0.55, 0.35, 0, Color.MAGENTA),
            new Tretja.Okno(0.05, 0.45, 0.65, 0.20, 4, Color.MAGENTA),
            new Tretja.OknoStatusna(0.50, 0.10, 0.45, 0.60, 3, Color.GREEN),
            new Tretja.OknoStatusna(0.45, 0.35, 0.45, 0.30, 5, Color.GREEN),
            new Tretja.Okno(0.40, 0.35, 0.20, 0.60, 6, Color.BLUE),
            new Tretja.Okno(0.35, 0.15, 0.50, 0.70, 1, Color.YELLOW),
            new Tretja.Okno(0.25, 0.05, 0.70, 0.65, 2, Color.CYAN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat48.png", "640x800"}, "Okna");
    }
}
