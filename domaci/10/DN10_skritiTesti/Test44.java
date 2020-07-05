
public class Test44 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj("qz", 11);
        vreca.dodaj("frtq", 9);
        vreca.dodaj("qz", 19);
        vreca.dodaj("frtq", 19);

        for (Object element: vreca) {
            System.out.println(element);
        }
    }
}
