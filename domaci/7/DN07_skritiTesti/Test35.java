
public class Test35 {

    public static void main(String[] args) {
        Lestvica lestvica = new Lestvica(new Nota(2, 6), 13);
        for (int i = 40;  i <= 50;  i++) {
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
