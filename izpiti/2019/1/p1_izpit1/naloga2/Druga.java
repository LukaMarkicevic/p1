
// 
// (na konec prej"snje vrstice zapi"site va"so vpisno "stevilko)

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    // =========================================================================
    public static class Stih {
        private int zacetnik;
        private int[] karte;

        public Stih(int zacetnik, int[] karte) {
            this.zacetnik = zacetnik;
            this.karte = karte;
        }

        public int vrednost() {
            int sum = 0;
            for (int i = 0; i < karte.length; i++) {
                sum += karte[i];
            }
            return sum;
        }

        public int dobitnik() {
            List<Integer> list = new ArrayList<Integer>(karte.length);
            for (int i : this.karte) {
                list.add(i);
            }
            int maxd = Collections.max(list);
            int max = list.indexOf(maxd);

            return (max + zacetnik) % karte.length;
        }

        // po potrebi dodajte svoje metode ...
    }

    public static class Partija {
        public int stIgralcev;
        private Stih[] stihi;

        public Partija(int stIgralcev, Stih[] stihi) {
            this.stIgralcev = stIgralcev;
            this.stihi = stihi;
        }

        public int kdoJeVrgel(int karta) {
            for (int i = 0; i < this.stihi.length; i++) {
                int[] karte = stihi[i].karte;
                int poceo = stihi[i].zacetnik;
                List<Integer> list = new ArrayList<Integer>(karte.length);
                for (int z : karte) {
                    list.add(z);
                }
                if (list.contains(karta)) {
                    return (list.indexOf(karta) + poceo) % karte.length;
                }
            }
            return -1;
        }

        public int[] tocke() {
            int tab[] = new int[this.stIgralcev];
            for (int i : tab) {
                tab[i] = 0;
            }
            for (int i = 0; i < stihi.length; i++) {
                Stih stih = stihi[i];
                int sum = 0;
                for (int j = 0; j < stih.karte.length; j++) {
                    sum += stih.karte[j];
                }
                int indeks = stih.dobitnik();
                tab[indeks] += sum;
            }

            return tab;
        }

        // po potrebi dodajte svoje metode ...
    }
}
