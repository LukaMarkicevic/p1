// _NE_ODSTRANI_

import java.awt.*;

public class Test23 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.05, 0.30, 0.70, 0.25, 4, Color.MAGENTA),
            new Tretja.OknoStatusna(0.50, 0.20, 0.35, 0.45, 3, Color.MAGENTA),
            new Tretja.OknoStatusna(0.75, 0.45, 0.20, 0.50, 2, Color.CYAN),
            new Tretja.OknoStatusna(0.40, 0.30, 0.20, 0.20, 1, Color.RED),
            new Tretja.OknoStatusna(0.35, 0.15, 0.30, 0.55, 0, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat23.png", "800x800"}, "Okna");
    }
}
