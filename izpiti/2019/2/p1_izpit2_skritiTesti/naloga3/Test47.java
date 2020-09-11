// _NE_ODSTRANI_

import java.awt.*;

public class Test47 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.25, 0.20, 0.65, 0.20, 0, Color.MAGENTA),
            new Tretja.OknoStatusna(0.30, 0.45, 0.30, 0.30, 2, Color.MAGENTA),
            new Tretja.Okno(0.10, 0.10, 0.70, 0.60, 4, Color.RED),
            new Tretja.Okno(0.25, 0.15, 0.60, 0.30, 1, Color.GREEN),
            new Tretja.Okno(0.15, 0.55, 0.50, 0.30, 3, Color.CYAN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat47.png", "600x400"}, "Okna");
    }
}
