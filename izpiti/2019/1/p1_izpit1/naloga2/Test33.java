
import java.util.Arrays;

public class Test33 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{10, 62, 8, 72, 71, 54, 55}),
            new Druga.Stih(3, new int[]{101, 11, 61, 17, 69, 95, 42}),
            new Druga.Stih(3, new int[]{97, 90, 45, 26, 23, 57, 70}),
            new Druga.Stih(3, new int[]{36, 67, 53, 102, 24, 93, 74}),
            new Druga.Stih(6, new int[]{47, 20, 85, 75, 77, 33, 39}),
            new Druga.Stih(1, new int[]{81, 86, 78, 34, 87, 63, 15}),
            new Druga.Stih(5, new int[]{7, 104, 103, 65, 98, 94, 4}),
            new Druga.Stih(6, new int[]{100, 66, 41, 14, 82, 79, 64}),
            new Druga.Stih(6, new int[]{48, 59, 25, 31, 99, 22, 13}),
            new Druga.Stih(3, new int[]{88, 0, 84, 12, 89, 38, 83}),
            new Druga.Stih(0, new int[]{43, 18, 29, 91, 40, 49, 46}),
            new Druga.Stih(3, new int[]{3, 73, 51, 1, 56, 28, 9}),
            new Druga.Stih(4, new int[]{19, 2, 76, 30, 50, 52, 21}),
            new Druga.Stih(6, new int[]{16, 6, 58, 44, 5, 80, 68}),
            new Druga.Stih(4, new int[]{37, 35, 92, 96, 60, 32, 27}),
        };
        Druga.Partija partija = new Druga.Partija(7, stihi);
        for (int karta = 0;  karta < 105;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
