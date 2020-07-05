
public class Test05 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(273);
        vreca.dodaj(461);
        vreca.dodaj(1049);

        System.out.println(vreca.steviloRazlicnihElementov());
    }
}
