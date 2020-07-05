
public class Test34 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj("mzuz", 40202);
        prva.dodaj("mzuz", 7243);
        prva.dodaj("mzuz", 70740);
        prva.dodaj("rgtju", 59556);
        prva.dodaj("httg", 23499);
        prva.dodaj("uyna", 86901);
        prva.dodaj("phhtv", 53843);
        prva.dodaj("httg", 28123);
        prva.dodaj("qs", 91288);
        prva.dodaj("mzuz", 66247);
        prva.dodaj("httg", 89555);
        prva.dodaj("phhtv", 4611);

        Vreca druga = new Vreca(prva);
        druga.dodaj("qehz", 60721);
        druga.dodaj("atzn", 102);
        druga.dodaj("uyna", 76063);
        druga.dodaj("mzuz", 87832);
        druga.dodaj("httg", 78953);

        druga.odstrani("phhtv", 83460);
        druga.odstrani("rgtju", 40001);
        druga.odstrani("mzuz", 53841);
        druga.odstrani("httg", 62717);

        System.out.println(prva.presek(druga));
    }
}
