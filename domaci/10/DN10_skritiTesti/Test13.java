
public class Test13 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(1809);
        vreca.dodaj(901);

        vreca.odstrani(1809);

        System.out.println(vreca.steviloRazlicnihElementov());
    }
}
