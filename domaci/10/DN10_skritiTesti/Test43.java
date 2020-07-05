
public class Test43 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(1902, 5);
        vreca.dodaj(780, 1);
        vreca.dodaj(1706, 5);
        vreca.dodaj(1410, 3);
        vreca.dodaj(1902, 4);
        vreca.dodaj(916, 3);
        vreca.dodaj(1706, 1);
        vreca.dodaj(488, 3);
        vreca.dodaj(780, 1);
        vreca.dodaj(1961, 2);
        vreca.dodaj(1410, 1);
        vreca.dodaj(1902, 1);
        vreca.dodaj(1410, 5);
        vreca.dodaj(1410, 5);
        vreca.dodaj(1961, 4);
        vreca.dodaj(1706, 2);
        vreca.dodaj(780, 5);
        vreca.dodaj(1902, 2);
        vreca.dodaj(1, 2);
        vreca.dodaj(1014, 1);

        for (Object element: vreca) {
            System.out.println(element);
        }
    }
}
