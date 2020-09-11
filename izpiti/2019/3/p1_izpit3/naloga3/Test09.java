// _NE_ODSTRANI_

import java.awt.*;

public class Test09 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaNavpicno(3, 2, 2),
            new Tretja.LadjaNavpicno(4, 6, 3),
            new Tretja.LadjaVodoravno(2, 5, 3),
            new Tretja.LadjaNavpicno(4, 4, 2),
            new Tretja.LadjaNavpicno(0, 0, 8),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(4, 2),
            new Tretja.Strel(7, 4),
            new Tretja.Strel(0, 3),
            new Tretja.Strel(6, 5),
            new Tretja.Strel(5, 7),
            new Tretja.Strel(6, 2),
            new Tretja.Strel(2, 5),
            new Tretja.Strel(0, 6),
            new Tretja.Strel(0, 2),
            new Tretja.Strel(6, 1),
            new Tretja.Strel(3, 3),
            new Tretja.Strel(3, 2),
            new Tretja.Strel(1, 0),
            new Tretja.Strel(2, 2),
            new Tretja.Strel(2, 7),
            new Tretja.Strel(0, 7),
            new Tretja.Strel(4, 1),
            new Tretja.Strel(1, 4),
            new Tretja.Strel(2, 3),
            new Tretja.Strel(7, 1),
            new Tretja.Strel(6, 4),
            new Tretja.Strel(3, 1),
        };

        Tretja tretja = new Tretja(8, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat09.png", "464x720"}, "Potapljanje ladjic");
    }
}
