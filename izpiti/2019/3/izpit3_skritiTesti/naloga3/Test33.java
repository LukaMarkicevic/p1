// _NE_ODSTRANI_

import java.awt.*;

public class Test33 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(2, 6, 2),
            new Tretja.LadjaVodoravno(9, 5, 9),
            new Tretja.LadjaVodoravno(5, 1, 11),
            new Tretja.LadjaVodoravno(7, 1, 11),
            new Tretja.LadjaVodoravno(13, 1, 13),
            new Tretja.LadjaVodoravno(11, 8, 4),
            new Tretja.LadjaVodoravno(0, 6, 8),
            new Tretja.LadjaVodoravno(2, 3, 1),
            new Tretja.LadjaVodoravno(11, 0, 7),
            new Tretja.LadjaVodoravno(3, 11, 3),
            new Tretja.LadjaVodoravno(9, 3, 1),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(14, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat33.png", "728x560"}, "Potapljanje ladjic");
    }
}
