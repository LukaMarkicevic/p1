public class BesedilnaDatoteka extends Datoteka {
    String ime;
    int stZnakov;

    public BesedilnaDatoteka(String ime, int stZnakov) {
        super(ime);
        this.ime = ime;
        this.stZnakov = stZnakov;
    }

    @Override
    public int velikost() {
        return stZnakov;
    }

    @Override
    public String toString() {
        return String.format("%s [b %d]", this.ime, this.stZnakov);
    }

}