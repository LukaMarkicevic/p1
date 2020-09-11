// _NE_ODSTRANI_

import java.awt.*;

public class Test23 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaNavpicno(0, 3, 4),
            new Tretja.LadjaVodoravno(2, 0, 1),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(4, 3),
            new Tretja.Strel(4, 1),
            new Tretja.Strel(2, 1),
            new Tretja.Strel(0, 2),
        };

        Tretja tretja = new Tretja(5, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat23.png", "550x550"}, "Potapljanje ladjic");
    }
}
