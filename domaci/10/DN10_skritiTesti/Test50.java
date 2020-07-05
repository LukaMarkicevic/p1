
public class Test50 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj("cq", 11);
        vreca.dodaj("ruhig", 18);
        vreca.dodaj("edh", 11);
        vreca.dodaj("iht", 1);
        vreca.dodaj("ruhig", 10);
        vreca.dodaj("tppi", 19);
        vreca.dodaj("edrvw", 5);
        vreca.dodaj("ruhig", 15);
        vreca.dodaj("qhg", 2);
        vreca.dodaj("edrvw", 20);
        vreca.dodaj("edrvw", 20);
        vreca.dodaj("ruhig", 10);
        vreca.dodaj("ruhig", 10);
        vreca.dodaj("edrvw", 13);

        for (Object element: vreca) {
            System.out.println(element);
        }
    }
}
