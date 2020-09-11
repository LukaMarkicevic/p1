// _NE_ODSTRANI_

import java.awt.*;

public class Test11 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.05, 0.40, 0.60, 0.55, 2, Color.ORANGE),
            new Tretja.Okno(0.60, 0.20, 0.35, 0.60, 1, Color.PINK),
            new Tretja.Okno(0.30, 0.15, 0.55, 0.65, 0, Color.MAGENTA),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat11.png", "400x400"}, "Okna");
    }
}
