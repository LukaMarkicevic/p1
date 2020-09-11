// _NE_ODSTRANI_

import java.awt.*;

public class Test21 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(7, 6, 2),
            new Tretja.LadjaVodoravno(3, 5, 3),
            new Tretja.LadjaNavpicno(1, 3, 7),
            new Tretja.LadjaVodoravno(0, 5, 3),
            new Tretja.LadjaNavpicno(6, 1, 2),
            new Tretja.LadjaNavpicno(3, 0, 1),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(4, 0),
            new Tretja.Strel(2, 3),
            new Tretja.Strel(4, 7),
            new Tretja.Strel(1, 4),
            new Tretja.Strel(4, 2),
            new Tretja.Strel(5, 1),
            new Tretja.Strel(5, 0),
            new Tretja.Strel(1, 5),
            new Tretja.Strel(7, 5),
            new Tretja.Strel(2, 6),
            new Tretja.Strel(6, 1),
            new Tretja.Strel(7, 7),
            new Tretja.Strel(3, 7),
            new Tretja.Strel(0, 2),
            new Tretja.Strel(4, 6),
            new Tretja.Strel(6, 6),
            new Tretja.Strel(0, 0),
            new Tretja.Strel(0, 6),
            new Tretja.Strel(2, 2),
            new Tretja.Strel(6, 4),
            new Tretja.Strel(1, 0),
            new Tretja.Strel(7, 3),
            new Tretja.Strel(1, 2),
            new Tretja.Strel(5, 7),
            new Tretja.Strel(3, 4),
            new Tretja.Strel(4, 3),
            new Tretja.Strel(3, 5),
        };

        Tretja tretja = new Tretja(8, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat21.png", "464x464"}, "Potapljanje ladjic");
    }
}
