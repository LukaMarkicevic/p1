// _NE_ODSTRANI_

import java.awt.*;

public class Test24 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaNavpicno(2, 6, 6),
            new Tretja.LadjaVodoravno(4, 1, 3),
            new Tretja.LadjaNavpicno(0, 3, 1),
            new Tretja.LadjaVodoravno(6, 0, 5),
            new Tretja.LadjaNavpicno(0, 1, 2),
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(0, 2),
            new Tretja.Strel(5, 2),
            new Tretja.Strel(2, 0),
            new Tretja.Strel(1, 4),
            new Tretja.Strel(0, 5),
            new Tretja.Strel(2, 6),
            new Tretja.Strel(5, 6),
            new Tretja.Strel(5, 1),
            new Tretja.Strel(6, 3),
            new Tretja.Strel(7, 4),
            new Tretja.Strel(0, 6),
            new Tretja.Strel(2, 5),
            new Tretja.Strel(0, 1),
            new Tretja.Strel(4, 6),
            new Tretja.Strel(4, 7),
            new Tretja.Strel(4, 2),
            new Tretja.Strel(3, 7),
        };

        Tretja tretja = new Tretja(8, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat24.png", "576x576"}, "Potapljanje ladjic");
    }
}
