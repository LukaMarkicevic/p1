
public class Test19 {

    public static void main(String[] args) {
        Nota nota = new Nota(13, 2);
        Lestvica lestvica = new Lestvica(nota, 65);
        izpisiLestvico(lestvica);
    }

    private static void izpisiLestvico(Lestvica lst) {
        Nota nota = lst.vrniZacetnoNoto();
        System.out.printf("%d %d %d%n", nota.vrniOktavo(), nota.vrniIndeks(), lst.vrniRazmak());
    }
}
