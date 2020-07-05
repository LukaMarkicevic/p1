
public class Test16 {

    public static void main(String[] args) {
        Nota nota = new Nota(41, 10);
        Lestvica lestvica = new Lestvica(nota, 45);
        izpisiLestvico(lestvica);
    }

    private static void izpisiLestvico(Lestvica lst) {
        Nota nota = lst.vrniZacetnoNoto();
        System.out.printf("%d %d %d%n", nota.vrniOktavo(), nota.vrniIndeks(), lst.vrniRazmak());
    }
}
