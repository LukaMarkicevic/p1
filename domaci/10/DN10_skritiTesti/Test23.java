
public class Test23 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj(1172, 92);
        prva.dodaj(1172, 67);
        prva.dodaj(1172, 66);
        prva.dodaj(551, 21);

        Vreca druga = new Vreca(prva);
        druga.odstrani(551, 95);
        druga.odstrani(1172, 29);

        System.out.println(prva.steviloKopij(1172));
        System.out.println(prva.steviloKopij(551));

        System.out.println(druga.steviloKopij(1172));
        System.out.println(druga.steviloKopij(551));
    }
}
