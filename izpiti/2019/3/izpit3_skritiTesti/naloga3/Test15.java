// _NE_ODSTRANI_

import java.awt.*;

public class Test15 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {};
        Tretja.Strel[] streli = {
            new Tretja.Strel(10, 3),
            new Tretja.Strel(7, 1),
            new Tretja.Strel(0, 4),
            new Tretja.Strel(6, 2),
            new Tretja.Strel(1, 5),
            new Tretja.Strel(3, 3),
            new Tretja.Strel(6, 10),
            new Tretja.Strel(8, 6),
            new Tretja.Strel(10, 8),
            new Tretja.Strel(2, 4),
            new Tretja.Strel(4, 4),
            new Tretja.Strel(4, 1),
            new Tretja.Strel(2, 8),
            new Tretja.Strel(2, 0),
            new Tretja.Strel(8, 9),
            new Tretja.Strel(7, 9),
            new Tretja.Strel(2, 6),
            new Tretja.Strel(6, 4),
            new Tretja.Strel(9, 7),
            new Tretja.Strel(2, 2),
            new Tretja.Strel(8, 8),
            new Tretja.Strel(9, 5),
            new Tretja.Strel(3, 2),
            new Tretja.Strel(5, 1),
            new Tretja.Strel(7, 6),
            new Tretja.Strel(10, 1),
            new Tretja.Strel(9, 9),
            new Tretja.Strel(9, 4),
            new Tretja.Strel(3, 9),
            new Tretja.Strel(6, 3),
            new Tretja.Strel(10, 6),
            new Tretja.Strel(8, 3),
            new Tretja.Strel(4, 2),
            new Tretja.Strel(2, 5),
            new Tretja.Strel(1, 3),
            new Tretja.Strel(10, 5),
            new Tretja.Strel(10, 9),
            new Tretja.Strel(6, 1),
            new Tretja.Strel(10, 0),
            new Tretja.Strel(4, 7),
            new Tretja.Strel(8, 1),
            new Tretja.Strel(9, 10),
            new Tretja.Strel(10, 10),
            new Tretja.Strel(4, 6),
            new Tretja.Strel(5, 0),
            new Tretja.Strel(0, 7),
            new Tretja.Strel(0, 8),
            new Tretja.Strel(3, 7),
            new Tretja.Strel(0, 3),
            new Tretja.Strel(2, 7),
            new Tretja.Strel(3, 4),
            new Tretja.Strel(8, 7),
        };

        Tretja tretja = new Tretja(11, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat15.png", "792x792"}, "Potapljanje ladjic");
    }
}
