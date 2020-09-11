
import java.util.Arrays;

public class Test29 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{19, 21, 3}),
            new Druga.Stih(1, new int[]{28, 5, 13}),
            new Druga.Stih(1, new int[]{0, 14, 16}),
            new Druga.Stih(0, new int[]{22, 7, 9}),
            new Druga.Stih(0, new int[]{17, 26, 6}),
            new Druga.Stih(1, new int[]{4, 18, 1}),
            new Druga.Stih(2, new int[]{25, 10, 15}),
            new Druga.Stih(2, new int[]{23, 20, 27}),
            new Druga.Stih(1, new int[]{8, 2, 11}),
            new Druga.Stih(0, new int[]{29, 24, 12}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        for (int karta = 0;  karta < 30;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
