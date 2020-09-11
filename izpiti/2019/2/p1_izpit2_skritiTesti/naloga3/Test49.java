// _NE_ODSTRANI_

import java.awt.*;

public class Test49 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.15, 0.35, 0.20, 0.40, 3, Color.BLUE),
            new Tretja.Okno(0.10, 0.25, 0.35, 0.50, 2, Color.ORANGE),
            new Tretja.Okno(0.15, 0.20, 0.55, 0.55, 0, Color.ORANGE),
            new Tretja.OknoStatusna(0.45, 0.05, 0.30, 0.25, 4, Color.CYAN),
            new Tretja.Okno(0.15, 0.35, 0.70, 0.55, 1, Color.BLUE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat49.png", "680x400"}, "Okna");
    }
}
