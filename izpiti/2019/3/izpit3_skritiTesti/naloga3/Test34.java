// _NE_ODSTRANI_

import java.awt.*;

public class Test34 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(8, 5, 6),
            new Tretja.LadjaVodoravno(5, 0, 1),
            new Tretja.LadjaVodoravno(10, 0, 11),
            new Tretja.LadjaVodoravno(1, 7, 2),
            new Tretja.LadjaVodoravno(6, 2, 8),
            new Tretja.LadjaVodoravno(3, 0, 11),
            new Tretja.LadjaVodoravno(1, 2, 2),
            new Tretja.LadjaVodoravno(8, 1, 2),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(11, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat34.png", "418x748"}, "Potapljanje ladjic");
    }
}
