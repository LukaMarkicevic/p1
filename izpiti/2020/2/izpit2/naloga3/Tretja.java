
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
    public static abstract class Ukaz {

        public static int bilanca(Ukaz[] ukazi) {
            int pos = 0;
            int odv = 0;
            for (Ukaz ukaz : ukazi) {
                if (ukaz instanceof Postavi) {
                    pos++;
                }
                if (ukaz instanceof Odvzemi) {
                    odv++;
                }
            }
            return pos - odv;
        }

        public Ukaz zaporedje(Ukaz drugi) {
            return new Zaporedje(this, drugi);
        }

        public abstract void izvedi(int[] stolpi);
        // po potrebi dopolnite ...
    }

    public static class Zaporedje extends Ukaz {
        Ukaz prvi;
        Ukaz drugi;

        public Zaporedje(Ukaz prvi, Ukaz drugi) {
            this.prvi = prvi;
            this.drugi = drugi;
        }

        @Override
        public String toString() {
            return String.format("[%s, %s]", prvi.toString(), drugi.toString());
        }

        @Override
        public void izvedi(int[] stolpi) {
            prvi.izvedi(stolpi);
            drugi.izvedi(stolpi);
        }
        

        // po potrebi dopolnite ...
    }

    // =========================================================================
    public static class Postavi extends Ukaz {
        private int kam;

        // V vseh testnih primerih velja:
        // kam >= 0

        public Postavi(int kam) {
            this.kam = kam;
        }

        @Override
        public String toString() {
            return String.format("+%d", kam);
        }

        @Override
        public void izvedi(int[] stolpi) {
            if (this.kam < stolpi.length)
                stolpi[kam]++;
            System.out.println(Arrays.toString(stolpi));
        }

        // po potrebi dopolnite ...
    }

    // =========================================================================
    public static class Odvzemi extends Ukaz {
        private int odkod;

        // V vseh testnih primerih velja:
        // odkod >= 0

        public Odvzemi(int odkod) {
            this.odkod = odkod;
        }

        @Override
        public String toString() {
            return String.format("-%d", odkod);
        }

        @Override
        public void izvedi(int[] stolpi) {
            if (this.odkod < stolpi.length && stolpi[odkod] > 0)
                stolpi[odkod]--;
            System.out.println(Arrays.toString(stolpi));
        }

        // po potrebi dopolnite ...
    }

    // =========================================================================
    // po potrebi dopolnite ...
}
