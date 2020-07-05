
public class Test01 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(483);
        vreca.dodaj(1064);

        System.out.println(vreca.steviloRazlicnihElementov());
    }
}
