// _NE_ODSTRANI_

import java.awt.*;

public class Test38 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.30, 0.30, 0.55, 0.40, 4, Color.MAGENTA),
            new Tretja.OknoStatusna(0.40, 0.20, 0.45, 0.45, 2, Color.BLUE),
            new Tretja.Okno(0.25, 0.10, 0.30, 0.45, 3, Color.ORANGE),
            new Tretja.Okno(0.35, 0.65, 0.60, 0.20, 0, Color.PINK),
            new Tretja.Okno(0.25, 0.25, 0.65, 0.60, 1, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat38.png", "520x560"}, "Okna");
    }
}
