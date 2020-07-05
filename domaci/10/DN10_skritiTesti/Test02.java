
public class Test02 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj("bgo");
        vreca.dodaj("ieq");
        vreca.dodaj("jkzz");

        System.out.println(vreca.steviloRazlicnihElementov());
    }
}
