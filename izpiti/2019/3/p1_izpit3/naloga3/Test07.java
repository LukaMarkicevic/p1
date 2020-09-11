// _NE_ODSTRANI_

import java.awt.*;

public class Test07 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(6, 0, 11),
            new Tretja.LadjaVodoravno(12, 2, 11),
            new Tretja.LadjaVodoravno(1, 6, 8),
            new Tretja.LadjaVodoravno(8, 5, 7),
            new Tretja.LadjaVodoravno(10, 5, 8),
            new Tretja.LadjaVodoravno(3, 1, 4),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(14, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat07.png", "700x504"}, "Potapljanje ladjic");
    }
}
