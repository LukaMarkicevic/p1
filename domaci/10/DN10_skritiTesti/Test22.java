
public class Test22 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj("pwxcy", 12);
        prva.dodaj("pwxcy", 3);

        Vreca druga = new Vreca(prva);
        druga.odstrani("pwxcy", 9);

        System.out.println(prva.steviloKopij("pwxcy"));

        System.out.println(druga.steviloKopij("pwxcy"));
    }
}
