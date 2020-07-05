
public class Test14 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj("ju");
        vreca.dodaj("vs");
        vreca.dodaj("cc");
        vreca.dodaj("qxkb");
        vreca.dodaj("tprfg");
        vreca.dodaj("erz");
        vreca.dodaj("nwtmx");
        vreca.dodaj("dlc");
        vreca.dodaj("ljis");

        vreca.odstrani("vs");
        vreca.odstrani("dlc");

        System.out.println(vreca.steviloRazlicnihElementov());
    }
}
