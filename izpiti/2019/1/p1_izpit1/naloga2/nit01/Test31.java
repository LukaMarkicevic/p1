
import java.util.Arrays;

public class Test31 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{6, 19, 1, 3}),
            new Druga.Stih(1, new int[]{23, 21, 24, 2}),
            new Druga.Stih(3, new int[]{17, 4, 0, 9}),
            new Druga.Stih(3, new int[]{10, 22, 14, 8}),
            new Druga.Stih(0, new int[]{27, 13, 12, 18}),
            new Druga.Stih(0, new int[]{11, 5, 20, 15}),
            new Druga.Stih(2, new int[]{7, 26, 25, 16}),
        };
        Druga.Partija partija = new Druga.Partija(4, stihi);
        for (int karta = 0;  karta < 28;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
