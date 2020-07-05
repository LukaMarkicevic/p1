
public class Test31 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj(1248, 5);
        prva.dodaj(456, 5);
        prva.dodaj(456, 5);
        prva.dodaj(722, 5);
        prva.dodaj(456, 4);
        prva.dodaj(456, 3);
        prva.dodaj(722, 4);
        prva.dodaj(456, 5);

        Vreca druga = new Vreca(prva);
        druga.dodaj(965, 3);
        druga.dodaj(1881, 5);
        druga.dodaj(523, 5);
        druga.dodaj(722, 1);
        druga.dodaj(456, 4);
        druga.dodaj(1248, 3);

        druga.odstrani(523, 5);

        System.out.println(prva.presek(druga));
    }
}
