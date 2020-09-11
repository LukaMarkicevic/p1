// _NE_ODSTRANI_

import java.awt.*;

public class Test44 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(0, 2, 4),
            new Tretja.LadjaVodoravno(3, 6, 1),
            new Tretja.LadjaNavpicno(4, 4, 5),
            new Tretja.LadjaVodoravno(7, 0, 2),
            new Tretja.LadjaVodoravno(7, 6, 4),
            new Tretja.LadjaVodoravno(1, 8, 2),
            new Tretja.LadjaNavpicno(1, 0, 4),
            new Tretja.LadjaVodoravno(9, 1, 2),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(3, 4),
            new Tretja.Strel(4, 4),
            new Tretja.Strel(6, 9),
            new Tretja.Strel(5, 7),
            new Tretja.Strel(7, 8),
            new Tretja.Strel(1, 7),
            new Tretja.Strel(4, 5),
            new Tretja.Strel(0, 9),
            new Tretja.Strel(5, 5),
            new Tretja.Strel(3, 3),
            new Tretja.Strel(2, 8),
            new Tretja.Strel(8, 1),
            new Tretja.Strel(1, 1),
            new Tretja.Strel(2, 2),
            new Tretja.Strel(7, 6),
            new Tretja.Strel(5, 6),
            new Tretja.Strel(5, 4),
            new Tretja.Strel(4, 6),
            new Tretja.Strel(4, 0),
            new Tretja.Strel(6, 2),
            new Tretja.Strel(8, 9),
            new Tretja.Strel(9, 5),
            new Tretja.Strel(9, 0),
        };

        Tretja tretja = new Tretja(10, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat44.png", "620x660"}, "Potapljanje ladjic");
    }
}
