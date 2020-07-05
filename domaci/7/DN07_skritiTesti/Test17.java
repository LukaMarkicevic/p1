
public class Test17 {

    public static void main(String[] args) {
        Nota nota = new Nota(30, 6);
        Lestvica lestvica = new Lestvica(nota, 79);
        izpisiLestvico(lestvica);
    }

    private static void izpisiLestvico(Lestvica lst) {
        Nota nota = lst.vrniZacetnoNoto();
        System.out.printf("%d %d %d%n", nota.vrniOktavo(), nota.vrniIndeks(), lst.vrniRazmak());
    }
}
