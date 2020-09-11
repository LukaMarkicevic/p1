// _NE_ODSTRANI_

import java.awt.*;

public class Test50 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.45, 0.25, 0.35, 0.65, 1, Color.PINK),
            new Tretja.OknoStatusna(0.20, 0.55, 0.35, 0.40, 2, Color.MAGENTA),
            new Tretja.Okno(0.15, 0.20, 0.20, 0.70, 0, Color.GREEN),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat50.png", "600x400"}, "Okna");
    }
}
