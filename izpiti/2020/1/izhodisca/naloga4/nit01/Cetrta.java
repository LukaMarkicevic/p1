
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Celica implements Comparable<Celica> {
        private int vrstica;
        private int stolpec;

        public Celica(int vrstica, int stolpec) {
            this.vrstica = vrstica;
            this.stolpec = stolpec;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.vrstica, this.stolpec);
        }

        @Override
        public int compareTo(Celica o) {
            if (this.vrstica != o.vrstica) {
                return this.vrstica - o.vrstica;
            }
            return this.stolpec - o.stolpec;
        }

        // dopolnite po potrebi ...
    }

    public static class Ovojnik {
        private boolean[][] tabela;

        public Ovojnik(boolean[][] tabela) {
            this.tabela = tabela;
        }

        public static int daljina(Celica jedan, Celica dva) {
            int prva = (jedan.vrstica - dva.vrstica) < 0 ? -(jedan.vrstica - dva.vrstica)
                    : (jedan.vrstica - dva.vrstica);
            int druga = (jedan.stolpec - dva.stolpec) < 0 ? -(jedan.stolpec - dva.stolpec)
                    : (jedan.stolpec - dva.stolpec);

            return prva + druga;
        }

        public NavigableSet<Celica> enice() {
            Celica sredina = new Celica(tabela.length / 2, tabela[0].length / 2);
            NavigableSet<Celica> vrni = new TreeSet<Celica>(Manhattan(sredina));

            for (int i = 0; i < tabela.length; i++) {
                for (int j = 0; j < tabela[0].length; j++) {
                    if (this.tabela[i][j]) {
                        vrni.add(new Celica(i, j));
                    }
                }
            }
            return vrni;
        }

        public static Comparator<Celica> Manhattan(Celica sredina) {
            return new Comparator<Celica>() {
                @Override
                public int compare(Celica a, Celica b) {
                    int man1 = daljina(sredina, a);
                    int man2 = daljina(sredina, b);

                    if (man1 != man2) {
                        return man1 - man2;
                    }

                    return a.compareTo(b);
                }
            };

            // dopolnite po potrebi ...
        }
    }
}
