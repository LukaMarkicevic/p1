// _NE_ODSTRANI_

import java.awt.*;

public class Test37 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(0, 0, 12),
            new Tretja.LadjaVodoravno(2, 0, 12),
            new Tretja.LadjaNavpicno(4, 9, 7),
            new Tretja.LadjaNavpicno(4, 2, 7),
            new Tretja.LadjaNavpicno(9, 5, 3),
            new Tretja.LadjaVodoravno(5, 4, 4),
            new Tretja.LadjaNavpicno(10, 7, 2),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(9, 2),
            new Tretja.Strel(5, 4),
            new Tretja.Strel(9, 3),
            new Tretja.Strel(1, 11),
            new Tretja.Strel(0, 1),
            new Tretja.Strel(5, 3),
            new Tretja.Strel(3, 7),
            new Tretja.Strel(3, 10),
            new Tretja.Strel(7, 5),
            new Tretja.Strel(5, 11),
            new Tretja.Strel(5, 7),
            new Tretja.Strel(7, 11),
            new Tretja.Strel(1, 10),
            new Tretja.Strel(8, 5),
            new Tretja.Strel(7, 9),
            new Tretja.Strel(8, 2),
            new Tretja.Strel(4, 8),
            new Tretja.Strel(9, 0),
            new Tretja.Strel(8, 6),
            new Tretja.Strel(4, 7),
            new Tretja.Strel(3, 4),
            new Tretja.Strel(9, 6),
            new Tretja.Strel(0, 0),
            new Tretja.Strel(3, 8),
            new Tretja.Strel(10, 10),
            new Tretja.Strel(3, 6),
            new Tretja.Strel(8, 3),
            new Tretja.Strel(3, 11),
            new Tretja.Strel(7, 7),
            new Tretja.Strel(2, 0),
            new Tretja.Strel(2, 7),
            new Tretja.Strel(0, 7),
            new Tretja.Strel(10, 1),
            new Tretja.Strel(10, 0),
            new Tretja.Strel(0, 3),
            new Tretja.Strel(7, 10),
            new Tretja.Strel(0, 4),
            new Tretja.Strel(10, 8),
            new Tretja.Strel(6, 5),
            new Tretja.Strel(1, 9),
            new Tretja.Strel(8, 7),
            new Tretja.Strel(0, 9),
            new Tretja.Strel(9, 1),
            new Tretja.Strel(1, 5),
            new Tretja.Strel(11, 3),
            new Tretja.Strel(7, 8),
            new Tretja.Strel(9, 5),
            new Tretja.Strel(4, 11),
            new Tretja.Strel(7, 2),
            new Tretja.Strel(5, 10),
        };

        Tretja tretja = new Tretja(12, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat37.png", "456x552"}, "Potapljanje ladjic");
    }
}
