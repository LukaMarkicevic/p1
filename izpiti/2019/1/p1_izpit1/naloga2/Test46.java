
import java.util.Arrays;

public class Test46 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{24, 7, 138, 105, 131, 63, 58, 60, 71, 22}),
            new Druga.Stih(2, new int[]{96, 132, 143, 83, 86, 56, 135, 43, 67, 147}),
            new Druga.Stih(1, new int[]{78, 45, 6, 139, 133, 148, 90, 128, 18, 42}),
            new Druga.Stih(6, new int[]{84, 134, 38, 76, 16, 136, 109, 129, 3, 95}),
            new Druga.Stih(1, new int[]{34, 130, 12, 47, 114, 87, 117, 118, 120, 77}),
            new Druga.Stih(2, new int[]{20, 69, 23, 49, 37, 50, 64, 74, 11, 36}),
            new Druga.Stih(9, new int[]{62, 26, 140, 116, 127, 122, 123, 21, 104, 103}),
            new Druga.Stih(1, new int[]{39, 40, 15, 124, 107, 93, 52, 141, 113, 144}),
            new Druga.Stih(0, new int[]{91, 110, 28, 33, 2, 80, 89, 29, 70, 112}),
            new Druga.Stih(9, new int[]{61, 106, 17, 46, 53, 65, 75, 19, 1, 92}),
            new Druga.Stih(0, new int[]{101, 8, 149, 79, 111, 73, 48, 119, 108, 0}),
            new Druga.Stih(2, new int[]{85, 142, 66, 57, 100, 126, 115, 32, 121, 4}),
            new Druga.Stih(3, new int[]{44, 102, 137, 68, 81, 35, 97, 146, 14, 82}),
            new Druga.Stih(0, new int[]{13, 99, 41, 54, 59, 31, 10, 94, 25, 51}),
            new Druga.Stih(1, new int[]{5, 27, 55, 88, 30, 9, 145, 72, 98, 125}),
        };
        Druga.Partija partija = new Druga.Partija(10, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
