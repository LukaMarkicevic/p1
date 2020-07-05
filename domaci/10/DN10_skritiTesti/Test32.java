
public class Test32 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj("dh", 4);
        prva.dodaj("ien", 20);
        prva.dodaj("elwhy", 16);
        prva.dodaj("gumq", 2);
        prva.dodaj("uic", 5);
        prva.dodaj("zo", 11);
        prva.dodaj("bfgr", 15);
        prva.dodaj("zo", 14);
        prva.dodaj("xag", 3);
        prva.dodaj("xn", 15);
        prva.dodaj("yd", 18);
        prva.dodaj("drt", 14);
        prva.dodaj("mh", 1);
        prva.dodaj("nbd", 12);
        prva.dodaj("xag", 14);
        prva.dodaj("lxuck", 10);
        prva.dodaj("dh", 19);
        prva.dodaj("etuc", 19);
        prva.dodaj("uic", 7);
        prva.dodaj("elwhy", 2);
        prva.dodaj("elwhy", 12);
        prva.dodaj("xag", 3);
        prva.dodaj("etuc", 11);
        prva.dodaj("grqmg", 1);
        prva.dodaj("fpp", 3);
        prva.dodaj("yd", 20);
        prva.dodaj("myrpj", 1);
        prva.dodaj("xn", 11);
        prva.dodaj("gumq", 14);
        prva.dodaj("nmct", 9);
        prva.dodaj("elwhy", 5);
        prva.dodaj("fpp", 7);
        prva.dodaj("nbd", 3);
        prva.dodaj("gumq", 11);
        prva.dodaj("ien", 10);
        prva.dodaj("yd", 12);
        prva.dodaj("ien", 11);
        prva.dodaj("gumq", 15);
        prva.dodaj("dh", 7);
        prva.dodaj("ofgkp", 7);
        prva.dodaj("iq", 15);
        prva.dodaj("uic", 11);
        prva.dodaj("iq", 1);
        prva.dodaj("gumq", 15);
        prva.dodaj("lxuck", 16);
        prva.dodaj("fpp", 15);
        prva.dodaj("fpp", 7);
        prva.dodaj("elwhy", 14);

        Vreca druga = new Vreca(prva);
        druga.dodaj("lh", 4);
        druga.dodaj("qonhf", 1);
        druga.dodaj("dme", 12);
        druga.dodaj("u", 17);
        druga.dodaj("xon", 8);
        druga.dodaj("phje", 18);
        druga.dodaj("ybecg", 13);
        druga.dodaj("vts", 17);
        druga.dodaj("apph", 11);
        druga.dodaj("elwhy", 10);
        druga.dodaj("xn", 3);
        druga.dodaj("lxuck", 2);

        druga.odstrani("iq", 19);
        druga.odstrani("mh", 11);
        druga.odstrani("xag", 2);
        druga.odstrani("grqmg", 8);
        druga.odstrani("xn", 14);
        druga.odstrani("gumq", 4);

        System.out.println(prva.presek(druga));
    }
}
