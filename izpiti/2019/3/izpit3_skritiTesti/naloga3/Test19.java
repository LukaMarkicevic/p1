// _NE_ODSTRANI_

import java.awt.*;

public class Test19 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(0, 2, 7),
            new Tretja.LadjaVodoravno(9, 0, 2),
            new Tretja.LadjaVodoravno(7, 1, 9),
            new Tretja.LadjaVodoravno(5, 4, 5),
            new Tretja.LadjaVodoravno(2, 0, 5),
            new Tretja.LadjaVodoravno(3, 6, 2),
            new Tretja.LadjaVodoravno(9, 3, 2),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(10, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat19.png", "400x400"}, "Potapljanje ladjic");
    }
}
