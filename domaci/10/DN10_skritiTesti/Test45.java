
public class Test45 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(1727, 5);
        vreca.dodaj(1171, 4);
        vreca.dodaj(1097, 1);
        vreca.dodaj(341, 3);
        vreca.dodaj(1171, 2);
        vreca.dodaj(1727, 2);
        vreca.dodaj(1248, 3);
        vreca.dodaj(1132, 5);
        vreca.dodaj(341, 1);
        vreca.dodaj(606, 4);
        vreca.dodaj(1097, 3);
        vreca.dodaj(1861, 5);
        vreca.dodaj(341, 2);
        vreca.dodaj(1097, 2);
        vreca.dodaj(1861, 2);
        vreca.dodaj(1127, 4);
        vreca.dodaj(341, 2);
        vreca.dodaj(606, 2);
        vreca.dodaj(1248, 4);
        vreca.dodaj(1171, 1);
        vreca.dodaj(1585, 5);
        vreca.dodaj(1248, 1);
        vreca.dodaj(1248, 2);
        vreca.dodaj(1097, 1);
        vreca.dodaj(341, 5);
        vreca.dodaj(1171, 5);

        for (Object element: vreca) {
            System.out.println(element);
        }
    }
}
