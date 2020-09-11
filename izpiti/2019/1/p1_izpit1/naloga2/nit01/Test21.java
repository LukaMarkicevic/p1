
import java.util.Arrays;

public class Test21 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{107, 52, 57, 55, 104, 18, 10, 95, 137, 83}),
            new Druga.Stih(8, new int[]{26, 6, 148, 77, 47, 35, 19, 133, 142, 121}),
            new Druga.Stih(0, new int[]{127, 115, 80, 79, 51, 129, 87, 141, 59, 78}),
            new Druga.Stih(7, new int[]{108, 97, 132, 90, 28, 136, 96, 70, 113, 68}),
            new Druga.Stih(2, new int[]{85, 118, 7, 2, 81, 101, 42, 25, 56, 41}),
            new Druga.Stih(3, new int[]{126, 20, 91, 89, 0, 38, 76, 99, 36, 45}),
            new Druga.Stih(3, new int[]{13, 145, 110, 53, 69, 64, 21, 92, 114, 86}),
            new Druga.Stih(4, new int[]{23, 61, 138, 29, 73, 75, 120, 146, 3, 74}),
            new Druga.Stih(1, new int[]{8, 147, 58, 131, 117, 16, 119, 140, 135, 44}),
            new Druga.Stih(2, new int[]{33, 4, 11, 93, 128, 100, 40, 144, 32, 14}),
            new Druga.Stih(9, new int[]{139, 39, 54, 46, 65, 130, 109, 60, 66, 84}),
            new Druga.Stih(9, new int[]{67, 12, 22, 62, 82, 1, 27, 71, 105, 102}),
            new Druga.Stih(7, new int[]{9, 116, 103, 122, 94, 17, 34, 111, 49, 63}),
            new Druga.Stih(0, new int[]{149, 30, 106, 50, 98, 31, 37, 123, 88, 43}),
            new Druga.Stih(0, new int[]{124, 72, 48, 143, 24, 125, 15, 112, 134, 5}),
        };
        Druga.Partija partija = new Druga.Partija(10, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
