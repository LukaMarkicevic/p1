
// 
// (na konec prej"snje vrstice zapi"site va"so vpisno "stevilko)

import java.util.Arrays;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    // =========================================================================
    public static class Mesto {
        private Prehod[] v;
        private Prehod[] iz;
        int stZetonov;

        public Mesto(int stZetonov) {
            this.stZetonov = stZetonov;
        }

        public Prehod[] vrniV() {
            return this.v;
        }

        public Prehod[] vrniIz() {
            return this.iz;
        }

        public void nastaviPrehode(Prehod[] v, Prehod[] iz) {
            this.v = v;
            this.iz = iz;
        }

        public int vrniStZetonov() {
            return this.stZetonov;
        }

        public void nastaviStZetonov(int stZetonov) {
            this.stZetonov = stZetonov;
        }

        public boolean jeNaslednikOd(Mesto mesto) {
            for (int i = 0; i < this.v.length; i++) {
                for (int j = 0; j < mesto.iz.length; j++) {
                    if (this.v[i] == mesto.iz[j]) {
                        return true;
                    }
                }
            }
            return false;
        }

        // po potrebi dodajte svoje metode ...
    }

    public static class Prehod {
        private Mesto[] v;
        private Mesto[] iz;

        public Prehod(Mesto[] v, Mesto[] iz) {
            this.v = v;
            this.iz = iz;
        }

        public Mesto[] vrniV() {
            return this.v;
        }

        public Mesto[] vrniIz() {
            return this.iz;
        }

        public boolean seLahkoSprozi() {
            for (int i = 0; i < this.v.length; i++) {
                if (this.v[i].vrniStZetonov() == 0) {
                    return false;
                }
            }
            return true;
        }

        public void sprozi() {
            for (int i = 0; i < this.v.length; i++) {
                this.v[i].stZetonov--;
            }
            for (int i = 0; i < this.iz.length; i++) {
                this.iz[i].stZetonov++;
            }
        }

        // po potrebi dodajte svoje metode ...
    }

    public static class Mreza {
        private Mesto[] mesta;
        private Prehod[] prehodi;

        public Mreza(Mesto[] mesta, Prehod[] prehodi) {
            this.mesta = mesta;
            this.prehodi = prehodi;
        }

        public Mesto[] vrniMesta() {
            return this.mesta;
        }

        public Prehod[] vrniPrehode() {
            return this.prehodi;
        }

        public void doKonca() {
            int count = prehodi.length;

            while(count!=0){
                count=prehodi.length;
                for (int i = 0; i < prehodi.length; i++) {
                    Prehod p = prehodi[i];
                    if (p.seLahkoSprozi()) {
                        p.sprozi();
                    }
                }
                for (int i = 0; i < prehodi.length; i++) {
                    Prehod p = prehodi[i];
                    if (!p.seLahkoSprozi()) {
                        count--;
                    }
                }
            }
        }
    }

    // po potrebi dodajte svoje metode ...
    }


