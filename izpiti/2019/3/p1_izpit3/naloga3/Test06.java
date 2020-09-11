// _NE_ODSTRANI_

import java.awt.*;

public class Test06 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {};
        Tretja.Strel[] streli = {
            new Tretja.Strel(4, 0),
            new Tretja.Strel(3, 0),
            new Tretja.Strel(2, 5),
            new Tretja.Strel(1, 3),
            new Tretja.Strel(4, 6),
            new Tretja.Strel(4, 3),
            new Tretja.Strel(3, 3),
            new Tretja.Strel(2, 0),
            new Tretja.Strel(2, 6),
            new Tretja.Strel(0, 2),
            new Tretja.Strel(3, 6),
            new Tretja.Strel(5, 6),
            new Tretja.Strel(6, 1),
            new Tretja.Strel(6, 3),
            new Tretja.Strel(0, 6),
            new Tretja.Strel(4, 1),
            new Tretja.Strel(0, 0),
            new Tretja.Strel(6, 6),
            new Tretja.Strel(0, 4),
            new Tretja.Strel(6, 0),
            new Tretja.Strel(3, 5),
            new Tretja.Strel(3, 1),
        };

        Tretja tretja = new Tretja(7, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat06.png", "504x700"}, "Potapljanje ladjic");
    }
}
