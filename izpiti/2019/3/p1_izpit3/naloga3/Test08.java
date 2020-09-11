// _NE_ODSTRANI_

import java.awt.*;

public class Test08 {

    public static void main(String[] args) {
        Tretja.Ladja[] ladje = {
            new Tretja.LadjaVodoravno(1, 0, 3),
            new Tretja.LadjaNavpicno(3, 0, 2),
            new Tretja.LadjaVodoravno(3, 2, 1),
            new Tretja.LadjaNavpicno(0, 4, 5)
        };
        Tretja.Strel[] streli = {
            new Tretja.Strel(1, 0),
            new Tretja.Strel(2, 1),
            new Tretja.Strel(4, 0),
            new Tretja.Strel(4, 2),
            new Tretja.Strel(1, 4),
            new Tretja.Strel(2, 4),
        };

        Tretja tretja = new Tretja(5, ladje, streli);
        tretja.sproziRisanje(new String[]{"rezultat08.png", "900x500"}, "Potapljanje ladjic");
    }
}
