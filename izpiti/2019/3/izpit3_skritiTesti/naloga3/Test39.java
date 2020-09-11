// _NE_ODSTRANI_

import java.awt.*;

public class Test39 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(4, 0, 3),
            new Tretja.LadjaNavpicno(3, 5, 1),
            new Tretja.LadjaNavpicno(0, 7, 8),
            new Tretja.LadjaVodoravno(1, 1, 2),
            new Tretja.LadjaVodoravno(7, 1, 5),
            new Tretja.LadjaNavpicno(0, 4, 2),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(2, 2),
            new Tretja.Strel(1, 3),
            new Tretja.Strel(3, 7),
            new Tretja.Strel(5, 5),
            new Tretja.Strel(5, 4),
            new Tretja.Strel(3, 0),
            new Tretja.Strel(6, 2),
            new Tretja.Strel(6, 4),
            new Tretja.Strel(4, 1),
            new Tretja.Strel(4, 7),
            new Tretja.Strel(0, 4),
            new Tretja.Strel(0, 3),
            new Tretja.Strel(5, 0),
            new Tretja.Strel(5, 6),
            new Tretja.Strel(3, 3),
            new Tretja.Strel(2, 1),
            new Tretja.Strel(3, 4),
            new Tretja.Strel(7, 6),
            new Tretja.Strel(3, 2),
            new Tretja.Strel(2, 5),
            new Tretja.Strel(6, 6),
            new Tretja.Strel(6, 5),
            new Tretja.Strel(7, 1),
            new Tretja.Strel(7, 2),
            new Tretja.Strel(4, 6),
            new Tretja.Strel(5, 1),
            new Tretja.Strel(4, 2),
            new Tretja.Strel(1, 5),
            new Tretja.Strel(5, 3),
            new Tretja.Strel(0, 7),
            new Tretja.Strel(6, 3),
            new Tretja.Strel(7, 3),
        };

        Tretja tretja = new Tretja(8, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat39.png", "480x672"}, "Potapljanje ladjic");
    }
}
