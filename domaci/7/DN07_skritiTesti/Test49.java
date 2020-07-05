
import java.util.Random;

public class Test49 {

    public static void main(String[] args) {
        Random random = new Random(1235);
        for (int i = 0;  i < 10;  i++) {
            int oktava = random.nextInt(20);
            int indeks = random.nextInt(12);
            int razmak = random.nextInt(40);
            Lestvica lst1 = new Lestvica(new Nota(oktava, indeks), razmak);

            oktava = random.nextInt(20);
            indeks = random.nextInt(12);
            razmak = random.nextInt(40);
            Lestvica lst2 = new Lestvica(new Nota(oktava, indeks), razmak);
            izpisiLestvico(lst1.presek(lst2));
            izpisiLestvico(lst2.presek(lst1));
        }
    }

    private static void izpisiLestvico(Lestvica lst) {
        if (lst == null) {
            System.out.println("null");
        } else {
            Nota nota = lst.vrniZacetnoNoto();
            System.out.printf("%d %d %d%n", nota.vrniOktavo(), nota.vrniIndeks(), lst.vrniRazmak());
        }
    }
}
