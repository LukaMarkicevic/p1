
import java.util.Arrays;

public class Test42 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{24, 38, 48}),
            new Druga.Stih(2, new int[]{40, 120, 116}),
            new Druga.Stih(0, new int[]{111, 25, 14}),
            new Druga.Stih(0, new int[]{74, 41, 88}),
            new Druga.Stih(2, new int[]{98, 72, 83}),
            new Druga.Stih(2, new int[]{78, 39, 23}),
            new Druga.Stih(2, new int[]{85, 49, 107}),
            new Druga.Stih(1, new int[]{21, 73, 8}),
            new Druga.Stih(2, new int[]{79, 31, 64}),
            new Druga.Stih(2, new int[]{53, 81, 54}),
            new Druga.Stih(0, new int[]{7, 117, 18}),
            new Druga.Stih(1, new int[]{55, 42, 104}),
            new Druga.Stih(0, new int[]{35, 32, 65}),
            new Druga.Stih(2, new int[]{45, 56, 90}),
            new Druga.Stih(1, new int[]{115, 105, 101}),
            new Druga.Stih(1, new int[]{20, 80, 100}),
            new Druga.Stih(0, new int[]{15, 102, 5}),
            new Druga.Stih(1, new int[]{112, 63, 122}),
            new Druga.Stih(0, new int[]{34, 67, 62}),
            new Druga.Stih(1, new int[]{0, 37, 29}),
            new Druga.Stih(2, new int[]{51, 71, 68}),
            new Druga.Stih(0, new int[]{6, 47, 108}),
            new Druga.Stih(2, new int[]{61, 99, 52}),
            new Druga.Stih(0, new int[]{113, 110, 36}),
            new Druga.Stih(0, new int[]{121, 118, 125}),
            new Druga.Stih(2, new int[]{9, 92, 84}),
            new Druga.Stih(0, new int[]{57, 26, 109}),
            new Druga.Stih(2, new int[]{66, 17, 77}),
            new Druga.Stih(1, new int[]{119, 12, 50}),
            new Druga.Stih(1, new int[]{2, 33, 46}),
            new Druga.Stih(0, new int[]{16, 91, 106}),
            new Druga.Stih(2, new int[]{86, 95, 44}),
            new Druga.Stih(0, new int[]{60, 13, 82}),
            new Druga.Stih(2, new int[]{10, 97, 89}),
            new Druga.Stih(0, new int[]{22, 123, 103}),
            new Druga.Stih(1, new int[]{93, 19, 87}),
            new Druga.Stih(1, new int[]{70, 94, 114}),
            new Druga.Stih(0, new int[]{96, 75, 28}),
            new Druga.Stih(0, new int[]{43, 30, 1}),
            new Druga.Stih(0, new int[]{76, 69, 124}),
            new Druga.Stih(2, new int[]{3, 59, 11}),
            new Druga.Stih(0, new int[]{4, 27, 58}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
