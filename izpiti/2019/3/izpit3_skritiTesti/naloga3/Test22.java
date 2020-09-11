// _NE_ODSTRANI_

import java.awt.*;

public class Test22 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaNavpicno(4, 8, 2),
            new Tretja.LadjaNavpicno(8, 7, 2),
            new Tretja.LadjaNavpicno(3, 1, 2),
            new Tretja.LadjaNavpicno(2, 6, 2),
            new Tretja.LadjaNavpicno(6, 10, 4),
            new Tretja.LadjaVodoravno(8, 0, 2),
            new Tretja.LadjaNavpicno(0, 3, 10),
            new Tretja.LadjaVodoravno(0, 5, 6),
            new Tretja.LadjaVodoravno(1, 0, 2),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(9, 10),
            new Tretja.Strel(7, 10),
            new Tretja.Strel(6, 8),
            new Tretja.Strel(5, 4),
            new Tretja.Strel(7, 2),
            new Tretja.Strel(1, 1),
            new Tretja.Strel(0, 0),
            new Tretja.Strel(2, 4),
            new Tretja.Strel(5, 5),
            new Tretja.Strel(6, 4),
            new Tretja.Strel(8, 6),
            new Tretja.Strel(6, 0),
            new Tretja.Strel(7, 1),
            new Tretja.Strel(3, 8),
            new Tretja.Strel(9, 7),
            new Tretja.Strel(7, 0),
            new Tretja.Strel(4, 6),
            new Tretja.Strel(5, 2),
            new Tretja.Strel(4, 9),
            new Tretja.Strel(5, 7),
            new Tretja.Strel(5, 3),
            new Tretja.Strel(1, 10),
            new Tretja.Strel(10, 4),
            new Tretja.Strel(1, 5),
        };

        Tretja tretja = new Tretja(11, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat22.png", "440x440"}, "Potapljanje ladjic");
    }
}
