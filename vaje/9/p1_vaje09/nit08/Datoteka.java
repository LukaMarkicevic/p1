public abstract class Datoteka {

    String ime;

    Datoteka(String ime) {
        this.ime = ime;
    }

    public abstract int velikost();

    public abstract String toString();

    public String vrniIme(){
        return this.ime;
    }
}