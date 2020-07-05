
public class Test33 {

    public static void main(String[] args) {
        Nota nota = new Nota(10, 9);
        for (int i = -140;  i <= -100;  i++) {
            izpisiNoto(nota.naRazdalji(i));
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
