// _NE_ODSTRANI_

import java.awt.*;

public class Test38 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(7, 2, 6),
            new Tretja.LadjaNavpicno(1, 5, 3),
            new Tretja.LadjaNavpicno(2, 3, 1),
            new Tretja.LadjaNavpicno(1, 0, 1),
            new Tretja.LadjaVodoravno(5, 1, 8),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(4, 0),
            new Tretja.Strel(6, 8),
            new Tretja.Strel(8, 7),
            new Tretja.Strel(7, 1),
            new Tretja.Strel(7, 4),
            new Tretja.Strel(8, 0),
            new Tretja.Strel(3, 1),
            new Tretja.Strel(4, 5),
            new Tretja.Strel(5, 8),
            new Tretja.Strel(0, 6),
            new Tretja.Strel(3, 3),
            new Tretja.Strel(0, 4),
            new Tretja.Strel(6, 2),
            new Tretja.Strel(7, 3),
            new Tretja.Strel(2, 8),
            new Tretja.Strel(2, 6),
            new Tretja.Strel(8, 6),
            new Tretja.Strel(4, 2),
            new Tretja.Strel(2, 2),
            new Tretja.Strel(8, 3),
            new Tretja.Strel(5, 1),
            new Tretja.Strel(3, 7),
            new Tretja.Strel(5, 6),
            new Tretja.Strel(4, 3),
        };

        Tretja tretja = new Tretja(9, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat38.png", "594x792"}, "Potapljanje ladjic");
    }
}
