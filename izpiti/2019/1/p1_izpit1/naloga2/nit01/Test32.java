
import java.util.Arrays;

public class Test32 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{24, 7, 15, 5, 20}),
            new Druga.Stih(0, new int[]{28, 0, 29, 2, 6}),
            new Druga.Stih(2, new int[]{27, 17, 9, 18, 14}),
            new Druga.Stih(2, new int[]{22, 11, 26, 16, 8}),
            new Druga.Stih(4, new int[]{21, 1, 25, 4, 12}),
            new Druga.Stih(1, new int[]{10, 3, 23, 19, 13}),
        };
        Druga.Partija partija = new Druga.Partija(5, stihi);
        for (int karta = 0;  karta < 30;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
