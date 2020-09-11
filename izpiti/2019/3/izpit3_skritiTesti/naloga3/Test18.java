// _NE_ODSTRANI_

import java.awt.*;

public class Test18 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(0, 1, 3),
            new Tretja.LadjaVodoravno(2, 3, 2),
            new Tretja.LadjaVodoravno(4, 0, 3),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(5, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat18.png", "580x580"}, "Potapljanje ladjic");
    }
}
