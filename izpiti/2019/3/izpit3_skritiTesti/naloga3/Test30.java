// _NE_ODSTRANI_

import java.awt.*;

public class Test30 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {};
        Tretja.Strel[] streli = {
            new Tretja.Strel(13, 9),
            new Tretja.Strel(6, 6),
            new Tretja.Strel(0, 7),
            new Tretja.Strel(5, 1),
            new Tretja.Strel(4, 11),
            new Tretja.Strel(1, 9),
            new Tretja.Strel(3, 11),
            new Tretja.Strel(2, 0),
            new Tretja.Strel(8, 3),
            new Tretja.Strel(11, 14),
            new Tretja.Strel(9, 12),
            new Tretja.Strel(7, 6),
            new Tretja.Strel(14, 8),
            new Tretja.Strel(7, 7),
            new Tretja.Strel(0, 11),
            new Tretja.Strel(11, 11),
            new Tretja.Strel(10, 11),
            new Tretja.Strel(13, 6),
            new Tretja.Strel(1, 11),
            new Tretja.Strel(14, 7),
            new Tretja.Strel(1, 1),
            new Tretja.Strel(3, 10),
            new Tretja.Strel(12, 8),
            new Tretja.Strel(6, 7),
            new Tretja.Strel(11, 0),
            new Tretja.Strel(11, 8),
            new Tretja.Strel(3, 14),
            new Tretja.Strel(12, 12),
            new Tretja.Strel(0, 3),
            new Tretja.Strel(6, 1),
            new Tretja.Strel(10, 8),
            new Tretja.Strel(13, 7),
            new Tretja.Strel(7, 2),
            new Tretja.Strel(10, 3),
            new Tretja.Strel(6, 11),
            new Tretja.Strel(6, 4),
            new Tretja.Strel(13, 5),
            new Tretja.Strel(2, 10),
            new Tretja.Strel(10, 0),
            new Tretja.Strel(7, 9),
        };

        Tretja tretja = new Tretja(15, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat30.png", "660x720"}, "Potapljanje ladjic");
    }
}
