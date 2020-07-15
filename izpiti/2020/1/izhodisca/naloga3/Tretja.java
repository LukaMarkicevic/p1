
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

import sun.management.resources.agent;

public class Tretja {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Zaposleni {
        private String ip;
        private int placa;
        private Vodja nadrejeni;

        public Zaposleni(String ip, int placa, Vodja nadrejeni) {
            this.ip = ip;
            this.placa = placa;
            this.nadrejeni = nadrejeni;
        }

        @Override
        public String toString() {
            return this.ip;
        }

        public int getPlaca() {
            return placa;
        }

        public Vodja getNadrejeni() {
            return nadrejeni;
        }

        public int placaNadrejenega() {
            try {
                return this.nadrejeni.getPlaca();
            } catch (Exception e) {
                return -1;
            }
        }

        public static int steviloAnomalij(Zaposleni[] zaposleni) {
            int count = 0;
            for (Zaposleni vodje : zaposleni) {
                for (Zaposleni delavci : zaposleni) {
                    if(vodje instanceof Vodja&&delavci instanceof Delavec){
                    if (delavci.getPlaca() > vodje.getPlaca()) {
                        count++;
                    }
                }
            }
            
        }
        return count;
    }}

    public static class Delavec extends Zaposleni {
        public Delavec(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
    }

    public static class Vodja extends Zaposleni {
        public Vodja(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }

        public Vodja vrhovni() {
            try {
                Vodja p = this;
                while (p.getNadrejeni() != null) {
                    p = p.getNadrejeni();
                }
                return p;
            } catch (Exception e) {
                return this;
            }

        }
    }
}
