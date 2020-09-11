// _NE_ODSTRANI_

import java.awt.*;

public class Test47 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaNavpicno(1, 4, 6),
            new Tretja.LadjaVodoravno(8, 1, 8),
            new Tretja.LadjaNavpicno(1, 2, 4),
            new Tretja.LadjaVodoravno(6, 0, 2),
            new Tretja.LadjaNavpicno(3, 6, 4),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(8, 0),
            new Tretja.Strel(5, 4),
            new Tretja.Strel(3, 7),
            new Tretja.Strel(1, 0),
            new Tretja.Strel(6, 6),
            new Tretja.Strel(1, 8),
            new Tretja.Strel(6, 1),
            new Tretja.Strel(4, 1),
            new Tretja.Strel(7, 5),
            new Tretja.Strel(6, 4),
            new Tretja.Strel(0, 7),
            new Tretja.Strel(1, 3),
            new Tretja.Strel(0, 1),
            new Tretja.Strel(6, 8),
            new Tretja.Strel(4, 3),
            new Tretja.Strel(6, 5),
            new Tretja.Strel(6, 0),
            new Tretja.Strel(2, 2),
            new Tretja.Strel(0, 6),
            new Tretja.Strel(4, 0),
            new Tretja.Strel(5, 7),
            new Tretja.Strel(0, 5),
            new Tretja.Strel(4, 4),
            new Tretja.Strel(3, 6),
            new Tretja.Strel(1, 1),
            new Tretja.Strel(8, 4),
            new Tretja.Strel(4, 7),
            new Tretja.Strel(3, 8),
            new Tretja.Strel(1, 7),
            new Tretja.Strel(3, 4),
            new Tretja.Strel(8, 8),
            new Tretja.Strel(3, 0),
            new Tretja.Strel(2, 6),
            new Tretja.Strel(7, 8),
        };

        Tretja tretja = new Tretja(9, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat47.png", "666x576"}, "Potapljanje ladjic");
    }
}
