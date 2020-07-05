
public class Test16 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj("tbcar", 5);
        vreca.dodaj("zylil");
        vreca.dodaj("ex");
        vreca.dodaj("zylil", 1);
        vreca.dodaj("hhrn");
        vreca.dodaj("hhrn", 1);
        vreca.dodaj("ibo", 4);
        vreca.dodaj("tbcar");
        vreca.dodaj("jcs", 1);
        vreca.dodaj("ggnx", 5);
        vreca.dodaj("ggnx");
        vreca.dodaj("ibo", 4);
        vreca.dodaj("tbcar");
        vreca.dodaj("hbqmu", 3);
        vreca.dodaj("jcs", 4);
        vreca.dodaj("ex");

        vreca.odstrani("jcs");
        vreca.odstrani("tbcar", 3);
        vreca.odstrani("hhrn", 1);

        System.out.println(vreca.steviloRazlicnihElementov());
        System.out.println(vreca.steviloKopij("tbcar"));
        System.out.println(vreca.steviloKopij("ex"));
        System.out.println(vreca.steviloKopij("hhrn"));
        System.out.println(vreca.steviloKopij("ggnx"));
        System.out.println(vreca.steviloKopij("jcs"));
        System.out.println(vreca.steviloKopij("zylil"));
        System.out.println(vreca.steviloKopij("hbqmu"));
        System.out.println(vreca.steviloKopij("ibo"));
    }
}
