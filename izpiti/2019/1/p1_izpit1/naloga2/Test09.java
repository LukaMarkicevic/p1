
import java.util.Arrays;

public class Test09 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{57, 135, 111, 42, 129, 38, 75, 136, 62, 44}),
            new Druga.Stih(7, new int[]{134, 10, 9, 127, 12, 5, 70, 65, 122, 100}),
            new Druga.Stih(7, new int[]{123, 77, 63, 14, 7, 132, 138, 93, 4, 120}),
            new Druga.Stih(3, new int[]{24, 117, 46, 89, 143, 95, 16, 19, 15, 90}),
            new Druga.Stih(7, new int[]{34, 66, 28, 106, 53, 31, 99, 91, 35, 18}),
            new Druga.Stih(0, new int[]{27, 109, 23, 61, 133, 73, 71, 128, 108, 148}),
            new Druga.Stih(9, new int[]{149, 126, 88, 121, 145, 131, 56, 11, 58, 144}),
            new Druga.Stih(9, new int[]{22, 67, 3, 96, 124, 72, 97, 2, 45, 26}),
            new Druga.Stih(3, new int[]{146, 17, 147, 83, 78, 76, 6, 20, 37, 84}),
            new Druga.Stih(5, new int[]{125, 139, 74, 8, 79, 92, 105, 86, 55, 51}),
            new Druga.Stih(6, new int[]{119, 52, 85, 101, 60, 102, 103, 50, 64, 115}),
            new Druga.Stih(6, new int[]{30, 59, 94, 0, 137, 110, 82, 1, 68, 80}),
            new Druga.Stih(0, new int[]{104, 118, 113, 116, 33, 142, 29, 41, 141, 112}),
            new Druga.Stih(5, new int[]{40, 21, 98, 87, 32, 43, 130, 25, 114, 13}),
            new Druga.Stih(1, new int[]{48, 36, 54, 107, 69, 47, 140, 81, 39, 49}),
        };
        Druga.Partija partija = new Druga.Partija(10, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].vrednost());
        }
    }
}
