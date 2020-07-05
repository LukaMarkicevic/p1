
public class Test46 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj("bh", 11);
        vreca.dodaj("bh", 15);
        vreca.dodaj("ibfqb", 20);
        vreca.dodaj("bh", 2);
        vreca.dodaj("yvx", 10);
        vreca.dodaj("ibr", 4);
        vreca.dodaj("twtfo", 20);
        vreca.dodaj("rcnf", 16);
        vreca.dodaj("bh", 1);
        vreca.dodaj("axk", 5);
        vreca.dodaj("rcnf", 8);
        vreca.dodaj("yvx", 15);
        vreca.dodaj("rcnf", 18);
        vreca.dodaj("axk", 8);
        vreca.dodaj("axk", 18);
        vreca.dodaj("rcnf", 5);

        for (Object element: vreca) {
            System.out.println(element);
        }
    }
}
