
// 
// (na konec prej"snje vrstice zapi"site va"so vpisno "stevilko)

import java.awt.*;
import java.util.Arrays;

/*
 * TESTNI PRIMERI:
 *
 * J1, S1--S5: klici metode stranicaPolja
 *
 * J2, S6--S10: klici metode zgornjiLeviKot
 *
 * J3--J5, S11--S25: kvadratno platno
 *
 * J3, J6, S11--S15, S26--S30: samo streli (brez ladij)
 *
 * J4, J7, S16--S20, S31--S35: samo vodoravne ladje (brez strelov in navpi"cnih ladij)
 */

public class Tretja extends Platno {

    public static void main(String[] args) {
        Ladja[] ladje = {
            new LadjaVodoravno(1, 0, 3),
            new LadjaNavpicno(3, 0, 2),
            new LadjaVodoravno(3, 2, 1),
            new LadjaNavpicno(0, 4, 5)
        };
        Strel[] streli = {
            new Strel(1, 0),
            new Strel(2, 1),
            new Strel(4, 0),
            new Strel(4, 2),
            new Strel(1, 4),
            new Strel(2, 4),
        };

        Tretja tretja = new Tretja(5, ladje, streli);
        tretja.sproziRisanje(args, "Potapljanje ladjic");
    }

    private int stranica;
    private Ladja[] ladje;
    private Strel[] streli;

    public Tretja(int stranica, Ladja[] ladje, Strel[] streli) {
        this.stranica = stranica;
        this.ladje = ladje;
        this.streli = streli;
    }

    //=========================================================================
    public static abstract class Ladja {
        public static final Color BARVA = new Color(200, 224, 248);

        private int vrstica;
        private int stolpec;
        private int dolzina;

        protected Ladja(int vrstica, int stolpec, int dolzina) {
            this.vrstica = vrstica;
            this.stolpec = stolpec;
            this.dolzina = dolzina;
        }

        public int vrniVrstico() { return this.vrstica; }
        public int vrniStolpec() { return this.stolpec; }
        public int vrniDolzino() { return this.dolzina; }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class LadjaVodoravno extends Ladja {

        public LadjaVodoravno(int vrstica, int stolpec, int dolzina) {
            super(vrstica, stolpec, dolzina);
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class LadjaNavpicno extends Ladja {

        public LadjaNavpicno(int vrstica, int stolpec, int dolzina) {
            super(vrstica, stolpec, dolzina);
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class Strel {

        public static final Color BARVA = Color.RED;

        private int vrstica;
        private int stolpec;

        public Strel(int vrstica, int stolpec) {
            this.vrstica = vrstica;
            this.stolpec = stolpec;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    protected void narisi(Graphics2D g, double wp, double hp) {
        // dopolnite ...
    }

    public double stranicaPolja(double wp, double hp) {
        // popravite / dopolnite ...
        return 0.0;
    }

    public double[] zgornjiLeviKot(double wp, double hp) {
        // popravite / dopolnite ...
        return null;
    }

    // po potrebi dopolnite ...
}
