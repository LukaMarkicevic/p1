// _NE_ODSTRANI_

import java.awt.*;

public class Test32 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(2, 2, 3),
            new Tretja.LadjaVodoravno(6, 3, 8),
            new Tretja.LadjaVodoravno(11, 2, 8),
            new Tretja.LadjaVodoravno(2, 8, 4),
            new Tretja.LadjaVodoravno(0, 10, 1),
            new Tretja.LadjaVodoravno(4, 1, 9),
            new Tretja.LadjaVodoravno(9, 8, 2),
            new Tretja.LadjaVodoravno(0, 0, 7),
            new Tretja.LadjaVodoravno(8, 3, 3),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(12, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat32.png", "480x504"}, "Potapljanje ladjic");
    }
}
