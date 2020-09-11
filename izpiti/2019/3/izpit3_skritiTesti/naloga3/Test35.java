// _NE_ODSTRANI_

import java.awt.*;

public class Test35 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(5, 1, 13),
            new Tretja.LadjaVodoravno(8, 2, 11),
            new Tretja.LadjaVodoravno(11, 7, 1),
            new Tretja.LadjaVodoravno(3, 0, 9),
            new Tretja.LadjaVodoravno(12, 9, 5),
            new Tretja.LadjaVodoravno(1, 1, 13),
            new Tretja.LadjaVodoravno(13, 1, 1),
            new Tretja.LadjaVodoravno(3, 10, 3),
            new Tretja.LadjaVodoravno(10, 9, 5),
            new Tretja.LadjaVodoravno(11, 1, 2),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(14, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat35.png", "448x784"}, "Potapljanje ladjic");
    }
}
