// _NE_ODSTRANI_

import java.awt.*;

public class Test03 {

    public static void main(String[] args) {

        Tretja.Okno[] okna = {
            new Tretja.Okno(0.1, 0.2, 0.9, 0.4, 2, Color.RED),
            new Tretja.Okno(0.2, 0.1, 0.5, 0.7, 1, Color.GREEN),
            new Tretja.Okno(0.5, 0.4, 0.4, 0.5, 0, Color.BLUE),
        };

        Tretja tretja = new Tretja(okna);
        tretja.sproziRisanje(new String[]{"rezultat03.png", "800x800"}, "Okna");
    }
}
