
public class Test01 {

    public static void main(String[] args) {
        System.out.println("--- prva ---");
        Vreca prva = new Vreca();

        prva.dodaj("cvetko");
        prva.dodaj("eva", 5);
        prva.dodaj("cvetko", 3);
        prva.dodaj("ana", 10);
        prva.dodaj("bojan", 7);
        prva.dodaj("eva", 4);

        prva.odstrani("eva");
        prva.odstrani("ana", 7);
        prva.odstrani("cvetko", 10);
        prva.odstrani("eva", 7);

        System.out.println(prva.steviloRazlicnihElementov());
        System.out.println();
        System.out.println("ana: " + prva.steviloKopij("ana"));
        System.out.println("eva: " + prva.steviloKopij("eva"));
        System.out.println("cvetko: " + prva.steviloKopij("cvetko"));
        System.out.println("bojan: " + prva.steviloKopij("bojan"));
        System.out.println("darja: " + prva.steviloKopij("darja"));
        System.out.println();
        System.out.println(prva.toString());
        System.out.println();

        for (Object element: prva) {
            System.out.println(element);
        }
        System.out.println();

        System.out.println("--- druga ---");
        Vreca druga = new Vreca(prva);
        druga.odstrani("bojan", 3);
        druga.dodaj("franci", 5);
        druga.dodaj("eva", 2);
        druga.odstrani("ana", 4);
        System.out.println(druga.toString());
        System.out.println();

        System.out.println("--- tretja ---");
        Vreca tretja = prva.presek(druga);
        System.out.println(tretja.toString());
        System.out.println();

        System.out.println("--- cetrta ---");
        Vreca cetrta = prva.razlika(druga);
        System.out.println(cetrta.toString());
        System.out.println();

        System.out.println("--- prva ---");
        System.out.println(prva);
    }
}
