// _NE_ODSTRANI_

import java.awt.*;

public class Test04 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(9, 2, 12),
            new Tretja.LadjaVodoravno(4, 2, 13),
            new Tretja.LadjaVodoravno(13, 3, 13),
            new Tretja.LadjaVodoravno(7, 0, 18),
            new Tretja.LadjaVodoravno(11, 8, 2),
            new Tretja.LadjaVodoravno(15, 4, 14),
            new Tretja.LadjaVodoravno(2, 2, 15),
            new Tretja.LadjaVodoravno(0, 4, 7),
            new Tretja.LadjaVodoravno(17, 3, 12),
            new Tretja.LadjaVodoravno(11, 11, 7),
            new Tretja.LadjaVodoravno(0, 13, 1),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(18, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat04.png", "576x576"}, "Potapljanje ladjic");
    }
}
