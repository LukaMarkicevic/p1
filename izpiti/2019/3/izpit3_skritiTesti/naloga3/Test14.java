// _NE_ODSTRANI_

import java.awt.*;

public class Test14 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {};
        Tretja.Strel[] streli = {
            new Tretja.Strel(1, 0),
            new Tretja.Strel(1, 3),
            new Tretja.Strel(1, 4),
            new Tretja.Strel(5, 4),
            new Tretja.Strel(5, 2),
        };

        Tretja tretja = new Tretja(6, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat14.png", "684x684"}, "Potapljanje ladjic");
    }
}
