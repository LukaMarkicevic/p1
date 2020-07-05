
public class Test37 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj(1480, 12);
        prva.dodaj(1480, 19);
        prva.dodaj(725, 2);
        prva.dodaj(1480, 12);

        Vreca druga = new Vreca(prva);
        druga.dodaj(1711, 17);
        druga.dodaj(847, 2);
        druga.dodaj(1862, 19);
        druga.dodaj(1150, 18);
        druga.dodaj(1527, 2);
        druga.dodaj(1217, 20);
        druga.dodaj(915, 4);
        druga.dodaj(398, 3);
        druga.dodaj(1480, 12);

        druga.odstrani(1480, 16);
        druga.odstrani(725, 2);

        System.out.println(prva.razlika(druga));
        System.out.println(druga.razlika(prva));
    }
}
