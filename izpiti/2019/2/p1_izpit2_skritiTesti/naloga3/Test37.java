// _NE_ODSTRANI_

import java.awt.*;

public class Test37 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.OknoStatusna(0.20, 0.45, 0.50, 0.35, 7, Color.BLUE),
            new Tretja.OknoStatusna(0.20, 0.20, 0.70, 0.70, 0, Color.CYAN),
            new Tretja.OknoStatusna(0.10, 0.30, 0.65, 0.40, 5, Color.GREEN),
            new Tretja.Okno(0.55, 0.30, 0.40, 0.65, 9, Color.GREEN),
            new Tretja.OknoStatusna(0.50, 0.05, 0.45, 0.55, 8, Color.MAGENTA),
            new Tretja.Okno(0.35, 0.10, 0.25, 0.65, 2, Color.BLUE),
            new Tretja.OknoStatusna(0.15, 0.60, 0.25, 0.35, 4, Color.MAGENTA),
            new Tretja.OknoStatusna(0.05, 0.50, 0.65, 0.35, 3, Color.ORANGE),
            new Tretja.OknoStatusna(0.05, 0.40, 0.40, 0.20, 6, Color.BLUE),
            new Tretja.Okno(0.05, 0.20, 0.70, 0.45, 1, Color.CYAN),
            new Tretja.Okno(0.15, 0.35, 0.25, 0.60, 10, Color.YELLOW),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat37.png", "440x760"}, "Okna");
    }
}
