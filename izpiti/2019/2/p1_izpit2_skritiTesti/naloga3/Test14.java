// _NE_ODSTRANI_

import java.awt.*;

public class Test14 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.15, 0.40, 0.20, 0.35, 5, Color.YELLOW),
            new Tretja.Okno(0.40, 0.45, 0.35, 0.30, 4, Color.RED),
            new Tretja.Okno(0.15, 0.20, 0.55, 0.55, 3, Color.GREEN),
            new Tretja.Okno(0.30, 0.25, 0.35, 0.30, 2, Color.ORANGE),
            new Tretja.Okno(0.05, 0.15, 0.65, 0.20, 1, Color.ORANGE),
            new Tretja.Okno(0.10, 0.65, 0.45, 0.25, 0, Color.BLUE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat14.png", "680x680"}, "Okna");
    }
}
