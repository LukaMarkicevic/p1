
import java.util.Arrays;

public class Test08 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{15, 92, 40, 7, 62, 35, 52}),
            new Druga.Stih(1, new int[]{54, 76, 101, 93, 100, 85, 44}),
            new Druga.Stih(3, new int[]{51, 102, 72, 97, 27, 104, 13}),
            new Druga.Stih(1, new int[]{86, 21, 34, 45, 24, 95, 55}),
            new Druga.Stih(6, new int[]{1, 53, 75, 29, 17, 10, 41}),
            new Druga.Stih(1, new int[]{12, 91, 26, 71, 18, 4, 96}),
            new Druga.Stih(0, new int[]{33, 14, 42, 94, 78, 87, 43}),
            new Druga.Stih(3, new int[]{58, 31, 19, 56, 84, 48, 82}),
            new Druga.Stih(0, new int[]{57, 81, 28, 90, 63, 47, 25}),
            new Druga.Stih(3, new int[]{64, 50, 37, 11, 73, 77, 46}),
            new Druga.Stih(1, new int[]{49, 23, 67, 38, 88, 59, 99}),
            new Druga.Stih(0, new int[]{103, 61, 2, 0, 74, 6, 89}),
            new Druga.Stih(0, new int[]{79, 5, 83, 36, 98, 30, 16}),
            new Druga.Stih(4, new int[]{20, 22, 66, 68, 9, 69, 70}),
            new Druga.Stih(3, new int[]{3, 60, 32, 80, 8, 65, 39}),
        };
        Druga.Partija partija = new Druga.Partija(7, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].vrednost());
        }
    }
}
