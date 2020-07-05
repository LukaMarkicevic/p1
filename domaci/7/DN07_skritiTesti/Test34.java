
public class Test34 {

    public static void main(String[] args) {
        Lestvica lestvica = new Lestvica(new Nota(10, 7), 5);
        for (int i = 0;  i <= 20;  i++) {
            izpisiNoto(lestvica.clen(i));
        }
    }

    private static void izpisiNoto(Nota nota) {
        if (nota == null) {
            System.out.println("null");
        } else {
            System.out.printf("%d:%d%n", nota.vrniOktavo(), nota.vrniIndeks());
        }
    }
}
