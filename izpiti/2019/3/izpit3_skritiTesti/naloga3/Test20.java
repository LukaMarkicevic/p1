// _NE_ODSTRANI_

import java.awt.*;

public class Test20 {

    public static void main(String[] args) {

        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(5, 0, 7),
            new Tretja.LadjaVodoravno(8, 5, 3),
            new Tretja.LadjaVodoravno(1, 2, 5),
            new Tretja.LadjaVodoravno(10, 0, 7),
            new Tretja.LadjaVodoravno(3, 4, 5),
            new Tretja.LadjaVodoravno(0, 0, 1),
            new Tretja.LadjaVodoravno(7, 0, 2),
        };
        Tretja.Strel[] streli = {};

        Tretja tretja = new Tretja(11, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat20.png", "836x836"}, "Potapljanje ladjic");
    }
}
