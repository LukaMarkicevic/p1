
import java.util.Arrays;

public class Test34 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{9, 12, 28, 20, 122, 93, 109, 90, 69, 83}),
            new Druga.Stih(4, new int[]{132, 119, 71, 111, 146, 54, 131, 61, 94, 5}),
            new Druga.Stih(8, new int[]{55, 63, 56, 46, 37, 110, 60, 82, 148, 97}),
            new Druga.Stih(6, new int[]{120, 72, 2, 126, 139, 76, 45, 38, 16, 43}),
            new Druga.Stih(0, new int[]{78, 103, 140, 48, 99, 33, 25, 6, 128, 15}),
            new Druga.Stih(2, new int[]{84, 105, 88, 144, 68, 137, 115, 73, 27, 80}),
            new Druga.Stih(5, new int[]{75, 0, 62, 116, 13, 101, 100, 138, 47, 102}),
            new Druga.Stih(2, new int[]{124, 18, 44, 10, 118, 136, 57, 36, 64, 123}),
            new Druga.Stih(7, new int[]{81, 41, 86, 113, 58, 34, 49, 30, 7, 31}),
            new Druga.Stih(0, new int[]{96, 26, 106, 121, 79, 17, 24, 107, 14, 70}),
            new Druga.Stih(3, new int[]{147, 104, 65, 141, 89, 4, 8, 52, 32, 129}),
            new Druga.Stih(3, new int[]{23, 117, 3, 133, 87, 127, 77, 42, 143, 40}),
            new Druga.Stih(1, new int[]{39, 51, 35, 142, 130, 149, 74, 19, 145, 67}),
            new Druga.Stih(6, new int[]{92, 11, 29, 66, 134, 98, 91, 125, 85, 112}),
            new Druga.Stih(0, new int[]{108, 50, 1, 21, 135, 59, 114, 53, 22, 95}),
        };
        Druga.Partija partija = new Druga.Partija(10, stihi);
        for (int karta = 0;  karta < 150;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
