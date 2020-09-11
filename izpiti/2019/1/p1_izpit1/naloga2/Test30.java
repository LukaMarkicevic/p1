
import java.util.Arrays;

public class Test30 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{8, 79, 55}),
            new Druga.Stih(1, new int[]{14, 18, 38}),
            new Druga.Stih(0, new int[]{49, 16, 41}),
            new Druga.Stih(0, new int[]{4, 42, 78}),
            new Druga.Stih(2, new int[]{73, 83, 90}),
            new Druga.Stih(1, new int[]{36, 91, 37}),
            new Druga.Stih(2, new int[]{3, 123, 102}),
            new Druga.Stih(0, new int[]{112, 84, 72}),
            new Druga.Stih(0, new int[]{20, 32, 124}),
            new Druga.Stih(2, new int[]{87, 2, 67}),
            new Druga.Stih(2, new int[]{95, 122, 114}),
            new Druga.Stih(0, new int[]{7, 5, 76}),
            new Druga.Stih(2, new int[]{101, 22, 52}),
            new Druga.Stih(2, new int[]{29, 12, 28}),
            new Druga.Stih(2, new int[]{62, 110, 108}),
            new Druga.Stih(0, new int[]{30, 99, 66}),
            new Druga.Stih(1, new int[]{0, 56, 25}),
            new Druga.Stih(2, new int[]{27, 77, 103}),
            new Druga.Stih(1, new int[]{45, 34, 88}),
            new Druga.Stih(0, new int[]{19, 74, 97}),
            new Druga.Stih(2, new int[]{70, 81, 120}),
            new Druga.Stih(1, new int[]{9, 109, 118}),
            new Druga.Stih(0, new int[]{43, 33, 50}),
            new Druga.Stih(2, new int[]{111, 98, 86}),
            new Druga.Stih(2, new int[]{115, 47, 65}),
            new Druga.Stih(2, new int[]{39, 24, 31}),
            new Druga.Stih(2, new int[]{23, 61, 6}),
            new Druga.Stih(0, new int[]{21, 40, 125}),
            new Druga.Stih(2, new int[]{46, 10, 82}),
            new Druga.Stih(1, new int[]{121, 15, 89}),
            new Druga.Stih(1, new int[]{48, 80, 54}),
            new Druga.Stih(2, new int[]{117, 44, 63}),
            new Druga.Stih(2, new int[]{85, 57, 107}),
            new Druga.Stih(1, new int[]{113, 26, 58}),
            new Druga.Stih(1, new int[]{53, 35, 1}),
            new Druga.Stih(1, new int[]{64, 100, 93}),
            new Druga.Stih(2, new int[]{119, 59, 75}),
            new Druga.Stih(2, new int[]{116, 68, 106}),
            new Druga.Stih(2, new int[]{51, 96, 105}),
            new Druga.Stih(1, new int[]{94, 17, 71}),
            new Druga.Stih(1, new int[]{60, 13, 11}),
            new Druga.Stih(1, new int[]{69, 92, 104}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        for (int karta = 0;  karta < 126;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
