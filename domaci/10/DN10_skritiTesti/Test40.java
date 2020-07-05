
public class Test40 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj("dquz", 59873319);
        prva.dodaj("dquz", 90049182);

        Vreca druga = new Vreca(prva);
        druga.dodaj("tmmzt", 17131157);
        druga.dodaj("bjlmp", 42641164);
        druga.dodaj("iqc", 48923048);
        druga.dodaj("smkib", 57174863);
        druga.dodaj("jup", 95756077);
        druga.dodaj("dquz", 43730800);

        druga.odstrani("dquz", 26542224);

        System.out.println(prva.razlika(druga));
        System.out.println(druga.razlika(prva));
    }
}
