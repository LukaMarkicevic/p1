
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    // =========================================================================
    public static abstract class Drevo {
        private int x;
        private int y;

        protected Drevo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int d2(Drevo drevo) {
            return (int) (Math.pow(x - drevo.x, 2) + Math.pow(y - drevo.y, 2));
        }

        public abstract String vrsta();

        @Override
        public String toString() {
            return String.format("%s(%d, %d)", this.vrsta(), this.x, this.y);
        }
    }

    // =========================================================================
    public static abstract class Listavec extends Drevo {
        protected Listavec(int x, int y) {
            super(x, y);
        }
    }

    // =========================================================================
    public static abstract class Iglavec extends Drevo {
        protected Iglavec(int x, int y) {
            super(x, y);
        }
    }

    // =========================================================================
    public static class Hrast extends Listavec {
        public Hrast(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Hrast";
        }
    }

    // =========================================================================
    public static class Bukev extends Listavec {
        public Bukev(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bukev";
        }
    }

    // =========================================================================
    public static class Breza extends Listavec {
        public Breza(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Breza";
        }
    }

    // =========================================================================
    public static class Smreka extends Iglavec {
        public Smreka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Smreka";
        }
    }

    // =========================================================================
    public static class Jelka extends Iglavec {
        public Jelka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Jelka";
        }
    }

    // =========================================================================
    public static class Bor extends Iglavec {
        public Bor(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bor";
        }
    }

    // =========================================================================
    public static class Gozd {
        private Drevo[] drevesa;

        public Gozd(Drevo[] drevesa) {
            this.drevesa = drevesa;
        }

        public boolean jeListnat() {
            for (int i = 0; i < drevesa.length; i++)
                if (!(drevesa[i] instanceof Listavec))
                    return false;
            return true;
        }

        public Drevo najblizjeIstovrstno(Drevo drevo) {

            int indeks = -1;
            int min = Integer.MAX_VALUE;
            int count = 0;
            for (int i = 0; i < drevesa.length; i++) {
                if (drevesa[i].vrsta().equals(drevo.vrsta())) {
                    if (drevesa[i].d2(drevo) < min && drevesa[i] != drevo) {
                        min = drevesa[i].d2(drevo);
                        indeks = i;
                    }
                    count++;
                }
            }

            return indeks == -1 || count == 1 ? null : drevesa[indeks];
        }
    }
}
