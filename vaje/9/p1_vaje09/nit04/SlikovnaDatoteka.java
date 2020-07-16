public class SlikovnaDatoteka extends Datoteka {
    String ime;
    int sirina;
    int visina;

    public SlikovnaDatoteka(String ime, int sirina, int visina) {
        super(ime);
        this.ime = ime;
        this.sirina = sirina;
        this.visina = visina;
    }

    @Override
    public int velikost() {
        return 3 * this.sirina * this.visina + 54;
    }

    @Override
    public String toString() {
        return String.format("%s [s %d x %d]", this.ime, this.sirina, this.visina);
    }

   
}