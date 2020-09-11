// _NE_ODSTRANI_

import java.awt.*;

public class Test12 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {};
        Tretja.Strel[] streli = {
            new Tretja.Strel(0, 0),
            new Tretja.Strel(3, 1),
            new Tretja.Strel(6, 3),
            new Tretja.Strel(5, 6),
            new Tretja.Strel(6, 1),
            new Tretja.Strel(2, 6),
            new Tretja.Strel(3, 2),
            new Tretja.Strel(4, 1),
            new Tretja.Strel(1, 2),
            new Tretja.Strel(4, 2),
            new Tretja.Strel(1, 1),
            new Tretja.Strel(2, 5),
            new Tretja.Strel(5, 3),
            new Tretja.Strel(0, 6),
            new Tretja.Strel(0, 1),
            new Tretja.Strel(0, 3),
        };

        Tretja tretja = new Tretja(7, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat12.png", "770x770"}, "Potapljanje ladjic");
    }
}
