
// 
// (na konec prej"snje vrstice zapi"site va"so vpisno "stevilko)

import java.util.Arrays;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    //=========================================================================
    public static class Oseba {
        private String ip;
        private Clanek[] clanki;

        public Oseba(String ip) {
            this.ip = ip;
        }

        public String vrniIP() {
            return this.ip;
        }

        public void nastaviClanke(Clanek[] clanki) {
            this.clanki = clanki;
        }

        public Clanek[] vrniClanke() {
            return this.clanki;
        }

        public Clanek najboljCitiran() {
            Clanek max=null;
            int maxx=-1;
            for(int i=0;i<this.clanki.length;i++){
                if(clanki[i].vrniStCitatov()>maxx){
                    maxx=clanki[i].vrniStCitatov();
                    max=clanki[i];
                }
            }
            return max;
        }

        public boolean jeSoavtorZ(Oseba oseba) {
            boolean prvi;
            boolean drugi;
            for(int i=0;i<this.clanki.length;i++){
                prvi=false;
                drugi=false;
                Clanek clanek=clanki[i];
                Oseba[] avtorji=clanek.vrniAvtorje();

                for(int j=0;j<avtorji.length;j++){
                    if(avtorji[j]==this){
                        prvi=true;
                    }
                    if(avtorji[j]==oseba){
                        drugi=true;
                    }
                }
                if(prvi&&drugi){
                    return true;
                }
            }
            return false;
        }

        //
        // V testnih primerih J8 in S38--S41 so "clanki v tabeli this.clanki
        // urejeni po padajo"cem "stevilu citatov.
        //
        public int hIndeks() {
            int h=1;
            while(h<=1000){
                boolean avtor=false;
                boolean citat=false;
                int koautor=0;
                int citiran=0;
                for(int i=0;i<this.clanki.length;i++){
                    Clanek clanek=clanki[i];
                    Oseba[] avtorji=clanek.vrniAvtorje();
                    if(clanek.vrniStCitatov()>=h){
                        citiran++;
                    }
                    if(citiran==h){
                        citat=true;
                    }
                        for(int j=0;j<avtorji.length;j++){
                            if(avtorji[j]==this){
                                koautor++;
                            }
                            if(koautor==h){
                                avtor=true;
                            }
                        }
                }
                if(!avtor||!citat){
                    return h-1;
                }
                h++;
            }
            return -1;
        }

        // po potrebi dodajte svoje metode ...
    }

    //=========================================================================

    public static class Clanek {
        private String naslov;
        private Oseba[] avtorji;
        private int stCitatov;

        public Clanek(String naslov, Oseba[] avtorji, int stCitatov) {
            this.naslov = naslov;
            this.avtorji = avtorji;
            this.stCitatov = stCitatov;
        }

        public String vrniNaslov() {
            return this.naslov;
        }

        public int stAvtor() {
            return this.avtorji.length;
        }

        public Oseba[] vrniAvtorje() {
            return this.avtorji;
        }

        
        public int vrniStCitatov() {
            return this.stCitatov;
        }

        public String[] ipjiAvtorjev() {
            String[] tab= new String[avtorji.length];

            for(int i=0;i<avtorji.length;i++){
                tab[i]=avtorji[i].vrniIP();
            }

            return tab;
        }

        // po potrebi dodajte svoje metode ...
    }
}
