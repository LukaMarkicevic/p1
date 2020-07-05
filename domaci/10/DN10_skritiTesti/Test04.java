
public class Test04 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj("veglo");
        vreca.dodaj("geigx");
        vreca.dodaj("vuoc");
        vreca.dodaj("zax");
        vreca.dodaj("ltt");

        System.out.println(vreca.steviloRazlicnihElementov());
    }
}
