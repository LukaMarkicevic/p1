
public class Test49 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(1663, 5);
        vreca.dodaj(1273, 1);
        vreca.dodaj(1663, 3);
        vreca.dodaj(1663, 4);
        vreca.dodaj(11, 4);
        vreca.dodaj(1524, 3);
        vreca.dodaj(1663, 5);
        vreca.dodaj(11, 1);
        vreca.dodaj(743, 4);
        vreca.dodaj(1524, 5);
        vreca.dodaj(1524, 1);
        vreca.dodaj(11, 4);
        vreca.dodaj(1524, 3);
        vreca.dodaj(1273, 1);
        vreca.dodaj(743, 5);
        vreca.dodaj(701, 5);

        for (Object element: vreca) {
            System.out.println(element);
        }
    }
}
