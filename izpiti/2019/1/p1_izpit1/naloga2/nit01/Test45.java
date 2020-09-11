
import java.util.Arrays;

public class Test45 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{20, 87, 76, 26, 57, 56, 72}),
            new Druga.Stih(1, new int[]{35, 70, 36, 85, 44, 92, 19}),
            new Druga.Stih(6, new int[]{50, 91, 96, 66, 100, 95, 53}),
            new Druga.Stih(3, new int[]{16, 3, 79, 98, 46, 104, 30}),
            new Druga.Stih(1, new int[]{99, 2, 11, 42, 90, 81, 43}),
            new Druga.Stih(1, new int[]{48, 64, 33, 18, 94, 89, 41}),
            new Druga.Stih(5, new int[]{45, 0, 31, 74, 47, 29, 86}),
            new Druga.Stih(4, new int[]{21, 10, 102, 8, 25, 97, 103}),
            new Druga.Stih(3, new int[]{24, 13, 22, 54, 38, 69, 65}),
            new Druga.Stih(1, new int[]{15, 34, 49, 28, 51, 71, 1}),
            new Druga.Stih(6, new int[]{83, 52, 88, 39, 32, 37, 23}),
            new Druga.Stih(1, new int[]{101, 73, 93, 14, 60, 6, 7}),
            new Druga.Stih(1, new int[]{67, 4, 5, 40, 82, 58, 62}),
            new Druga.Stih(5, new int[]{12, 9, 55, 68, 84, 77, 78}),
            new Druga.Stih(2, new int[]{17, 63, 61, 27, 75, 59, 80}),
        };
        Druga.Partija partija = new Druga.Partija(7, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
