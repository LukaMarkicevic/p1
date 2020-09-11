// _NE_ODSTRANI_

import java.awt.*;

public class Test31 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(9, 4, 4),
            new Tretja.LadjaVodoravno(8, 0, 2),
            new Tretja.LadjaVodoravno(6, 4, 5),
            new Tretja.LadjaVodoravno(1, 1, 4),
            new Tretja.LadjaVodoravno(4, 2, 10),
            new Tretja.LadjaVodoravno(12, 3, 9),
            new Tretja.LadjaVodoravno(9, 10, 1),
            new Tretja.LadjaVodoravno(0, 7, 6),
            new Tretja.LadjaVodoravno(2, 6, 6),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(13, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat31.png", "520x468"}, "Potapljanje ladjic");
    }
}
