public class Imenik extends Datoteka {
    String ime;
    Datoteka[] datoteke;

    public Imenik(String ime, Datoteka[] datoteke) {
        super(ime);
        this.ime = ime;
        this.datoteke = datoteke;
    }

    @Override
    public int velikost() {
        int sum = 256;
        for (Datoteka datoteka : datoteke) {
            sum += datoteka.velikost();
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("%s [i %d]", this.ime, datoteke.length);
    }

    public int steviloVecjihSlik(int prag) {
        int sum = 0;
        for (Datoteka datoteka : datoteke) {
            if (datoteka instanceof SlikovnaDatoteka) {
                SlikovnaDatoteka slika = (SlikovnaDatoteka) datoteka;
                if (slika.sirina >= prag && slika.visina >= prag) {
                    sum++;
                }
            }
        }
        return sum;
    }

    // 9 i 10 test ne rade, tj poslednji deo zadatka
    public String poisci(String ime) {
        return this.poisci(".", ime);
    }

    // pot: pot od imenika, nad katerim se je klicala metoda poisci(ime),
    // do imenika this
    public String poisci(String pot, String ime) {
        
        // isci neposredno v imeniku this
        for (Datoteka datoteka : this.datoteke) {
            
            if (datoteka.vrniIme().equals(ime)) {
                // datoteko sem našel!
                return (pot + "/" + ime);
            }
        }

        // isci rekurzivno v podimenikih
        for (Datoteka datoteka : this.datoteke) {
            if (datoteka instanceof Imenik) {
                Imenik imenik = (Imenik) datoteka;
                String rezultat = imenik.poisci(pot + "/" + imenik.vrniIme(), ime);
                if (rezultat != null) {
                    return rezultat;
                }
            }
        }

        return null;
    }

}