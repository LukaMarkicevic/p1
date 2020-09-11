// _NE_ODSTRANI_

import java.awt.*;

public class Test08 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.2, 0.1, 0.5, 0.7, 1, Color.GREEN),
            new Tretja.OknoStatusna(0.1, 0.2, 0.9, 0.4, 2, Color.RED),
            new Tretja.OknoStatusna(0.5, 0.4, 0.4, 0.5, 0, Color.BLUE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat08.png", "750x500"}, "Okna");
    }
}
