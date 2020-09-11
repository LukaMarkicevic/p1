// _NE_ODSTRANI_

import java.awt.*;

public class Test49 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(11, 11, 1),
            new Tretja.LadjaVodoravno(2, 3, 9),
            new Tretja.LadjaNavpicno(12, 7, 3),
            new Tretja.LadjaVodoravno(5, 7, 8),
            new Tretja.LadjaVodoravno(12, 0, 4),
            new Tretja.LadjaVodoravno(7, 2, 5),
            new Tretja.LadjaVodoravno(9, 6, 4),
            new Tretja.LadjaVodoravno(7, 8, 2),
            new Tretja.LadjaNavpicno(1, 0, 10),
            new Tretja.LadjaVodoravno(0, 3, 12),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(4, 6),
            new Tretja.Strel(7, 11),
            new Tretja.Strel(1, 7),
            new Tretja.Strel(1, 1),
            new Tretja.Strel(6, 2),
            new Tretja.Strel(2, 1),
            new Tretja.Strel(2, 0),
            new Tretja.Strel(14, 12),
            new Tretja.Strel(12, 8),
            new Tretja.Strel(6, 3),
            new Tretja.Strel(9, 14),
            new Tretja.Strel(14, 13),
            new Tretja.Strel(0, 14),
            new Tretja.Strel(8, 2),
            new Tretja.Strel(12, 5),
            new Tretja.Strel(13, 8),
            new Tretja.Strel(5, 14),
            new Tretja.Strel(8, 10),
            new Tretja.Strel(13, 4),
            new Tretja.Strel(7, 3),
            new Tretja.Strel(12, 11),
            new Tretja.Strel(5, 2),
            new Tretja.Strel(12, 14),
            new Tretja.Strel(2, 10),
            new Tretja.Strel(12, 0),
            new Tretja.Strel(14, 3),
            new Tretja.Strel(7, 6),
            new Tretja.Strel(9, 12),
            new Tretja.Strel(3, 12),
            new Tretja.Strel(3, 2),
            new Tretja.Strel(11, 8),
            new Tretja.Strel(10, 8),
            new Tretja.Strel(13, 9),
            new Tretja.Strel(4, 13),
            new Tretja.Strel(12, 6),
            new Tretja.Strel(5, 9),
            new Tretja.Strel(10, 14),
            new Tretja.Strel(11, 11),
            new Tretja.Strel(4, 0),
            new Tretja.Strel(6, 7),
            new Tretja.Strel(6, 8),
            new Tretja.Strel(3, 8),
            new Tretja.Strel(11, 9),
            new Tretja.Strel(3, 4),
            new Tretja.Strel(5, 10),
            new Tretja.Strel(13, 1),
            new Tretja.Strel(10, 5),
            new Tretja.Strel(8, 4),
            new Tretja.Strel(14, 14),
            new Tretja.Strel(7, 2),
            new Tretja.Strel(7, 7),
            new Tretja.Strel(13, 10),
            new Tretja.Strel(12, 12),
            new Tretja.Strel(9, 3),
            new Tretja.Strel(5, 7),
            new Tretja.Strel(3, 13),
            new Tretja.Strel(4, 7),
            new Tretja.Strel(0, 7),
            new Tretja.Strel(11, 5),
            new Tretja.Strel(12, 7),
            new Tretja.Strel(8, 13),
        };

        Tretja tretja = new Tretja(15, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat49.png", "420x450"}, "Potapljanje ladjic");
    }
}
