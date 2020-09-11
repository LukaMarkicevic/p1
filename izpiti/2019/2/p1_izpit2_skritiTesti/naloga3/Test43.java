// _NE_ODSTRANI_

import java.awt.*;

public class Test43 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.15, 0.30, 0.35, 0.45, 0, Color.CYAN),
            new Tretja.Okno(0.05, 0.30, 0.45, 0.65, 4, Color.CYAN),
            new Tretja.Okno(0.30, 0.10, 0.50, 0.60, 1, Color.RED),
            new Tretja.Okno(0.30, 0.30, 0.55, 0.55, 3, Color.GREEN),
            new Tretja.OknoStatusna(0.20, 0.15, 0.40, 0.60, 2, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat43.png", "440x680"}, "Okna");
    }
}
