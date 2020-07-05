
public class Test07 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(13, 2);
        vreca.dodaj(13);
        vreca.dodaj(1398);
        vreca.dodaj(1287, 18);
        vreca.dodaj(379);
        vreca.dodaj(826, 9);
        vreca.dodaj(826, 17);
        vreca.dodaj(379, 2);
        vreca.dodaj(13, 2);
        vreca.dodaj(13, 1);

        System.out.println(vreca.steviloRazlicnihElementov());
        System.out.println(vreca.steviloKopij(379));
        System.out.println(vreca.steviloKopij(826));
        System.out.println(vreca.steviloKopij(1398));
        System.out.println(vreca.steviloKopij(13));
        System.out.println(vreca.steviloKopij(1287));
    }
}
