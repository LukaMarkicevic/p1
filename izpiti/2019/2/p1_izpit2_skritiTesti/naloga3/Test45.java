// _NE_ODSTRANI_

import java.awt.*;

public class Test45 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.20, 0.30, 0.50, 0.20, 2, Color.BLUE),
            new Tretja.OknoStatusna(0.15, 0.20, 0.35, 0.30, 0, Color.BLUE),
            new Tretja.OknoStatusna(0.50, 0.05, 0.45, 0.35, 1, Color.GREEN),
            new Tretja.OknoStatusna(0.20, 0.55, 0.55, 0.20, 3, Color.CYAN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat45.png", "680x720"}, "Okna");
    }
}
