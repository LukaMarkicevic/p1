// _NE_ODSTRANI_

import java.awt.*;

public class Test03 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {};
        Tretja.Strel[] streli = {
            new Tretja.Strel(4, 6),
            new Tretja.Strel(3, 5),
            new Tretja.Strel(8, 5),
            new Tretja.Strel(4, 8),
            new Tretja.Strel(3, 9),
            new Tretja.Strel(6, 10),
            new Tretja.Strel(5, 10),
            new Tretja.Strel(4, 5),
            new Tretja.Strel(0, 8),
            new Tretja.Strel(0, 2),
            new Tretja.Strel(5, 4),
            new Tretja.Strel(5, 6),
            new Tretja.Strel(1, 10),
            new Tretja.Strel(2, 4),
            new Tretja.Strel(0, 6),
            new Tretja.Strel(3, 8),
            new Tretja.Strel(6, 4),
            new Tretja.Strel(1, 5),
            new Tretja.Strel(0, 0),
            new Tretja.Strel(6, 6),
            new Tretja.Strel(4, 4),
            new Tretja.Strel(4, 2),
            new Tretja.Strel(1, 1),
            new Tretja.Strel(2, 5),
            new Tretja.Strel(9, 2),
            new Tretja.Strel(1, 4),
            new Tretja.Strel(10, 7),
            new Tretja.Strel(2, 10),
            new Tretja.Strel(8, 2),
            new Tretja.Strel(8, 6),
            new Tretja.Strel(4, 10),
            new Tretja.Strel(10, 2),
        };

        Tretja tretja = new Tretja(11, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat03.png", "528x528"}, "Potapljanje ladjic");
    }
}
