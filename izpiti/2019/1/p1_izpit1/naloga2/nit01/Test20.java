
import java.util.Arrays;

public class Test20 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{57, 49, 80, 26, 34, 59, 60}),
            new Druga.Stih(2, new int[]{67, 1, 88, 17, 75, 55, 62}),
            new Druga.Stih(4, new int[]{64, 43, 96, 82, 63, 94, 91}),
            new Druga.Stih(6, new int[]{39, 46, 89, 15, 14, 29, 40}),
            new Druga.Stih(1, new int[]{76, 37, 47, 36, 23, 92, 18}),
            new Druga.Stih(6, new int[]{58, 90, 52, 56, 95, 44, 73}),
            new Druga.Stih(3, new int[]{28, 11, 79, 77, 72, 0, 19}),
            new Druga.Stih(5, new int[]{16, 93, 68, 48, 102, 54, 100}),
            new Druga.Stih(2, new int[]{12, 84, 85, 81, 35, 10, 38}),
            new Druga.Stih(4, new int[]{30, 33, 97, 65, 6, 50, 9}),
            new Druga.Stih(6, new int[]{5, 78, 53, 42, 45, 27, 32}),
            new Druga.Stih(0, new int[]{83, 24, 70, 69, 104, 99, 2}),
            new Druga.Stih(4, new int[]{41, 20, 51, 98, 22, 7, 86}),
            new Druga.Stih(0, new int[]{101, 61, 25, 103, 21, 3, 31}),
            new Druga.Stih(3, new int[]{13, 8, 74, 66, 87, 4, 71}),
        };
        Druga.Partija partija = new Druga.Partija(7, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
