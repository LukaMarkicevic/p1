
import java.util.Arrays;

public class Test27 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{10, 2}),
            new Druga.Stih(0, new int[]{6, 0}),
            new Druga.Stih(0, new int[]{5, 9}),
            new Druga.Stih(1, new int[]{8, 4}),
            new Druga.Stih(1, new int[]{3, 1}),
            new Druga.Stih(1, new int[]{11, 7}),
        };
        Druga.Partija partija = new Druga.Partija(2, stihi);
        for (int karta = 0;  karta < 12;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
