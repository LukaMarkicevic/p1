// _NE_ODSTRANI_

import java.awt.*;

public class Test16 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(0, 6, 1),
            new Tretja.LadjaVodoravno(3, 3, 4),
            new Tretja.LadjaVodoravno(5, 0, 1),
            new Tretja.LadjaVodoravno(6, 2, 4),
            new Tretja.LadjaVodoravno(1, 2, 3),
            new Tretja.LadjaVodoravno(3, 0, 1),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(8, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat16.png", "816x816"}, "Potapljanje ladjic");
    }
}
