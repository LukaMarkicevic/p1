// _NE_ODSTRANI_

import java.awt.*;

public class Test17 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(5, 6, 8),
            new Tretja.LadjaVodoravno(7, 2, 15),
            new Tretja.LadjaVodoravno(13, 2, 11),
            new Tretja.LadjaVodoravno(16, 15, 1),
            new Tretja.LadjaVodoravno(15, 1, 13),
            new Tretja.LadjaVodoravno(17, 8, 1),
            new Tretja.LadjaVodoravno(1, 5, 8),
            new Tretja.LadjaVodoravno(9, 0, 18),
            new Tretja.LadjaVodoravno(3, 7, 9),
            new Tretja.LadjaVodoravno(11, 3, 12),
            new Tretja.LadjaVodoravno(17, 3, 4),
            new Tretja.LadjaVodoravno(5, 2, 1),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(18, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat17.png", "432x432"}, "Potapljanje ladjic");
    }
}
