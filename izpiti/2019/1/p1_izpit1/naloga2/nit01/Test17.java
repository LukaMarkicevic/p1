
import java.util.Arrays;

public class Test17 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{18, 80, 24}),
            new Druga.Stih(1, new int[]{72, 73, 13}),
            new Druga.Stih(2, new int[]{116, 66, 90}),
            new Druga.Stih(2, new int[]{52, 75, 50}),
            new Druga.Stih(0, new int[]{74, 40, 115}),
            new Druga.Stih(2, new int[]{20, 44, 108}),
            new Druga.Stih(1, new int[]{47, 54, 96}),
            new Druga.Stih(0, new int[]{104, 123, 101}),
            new Druga.Stih(1, new int[]{124, 35, 49}),
            new Druga.Stih(1, new int[]{76, 85, 29}),
            new Druga.Stih(2, new int[]{2, 103, 117}),
            new Druga.Stih(1, new int[]{55, 92, 43}),
            new Druga.Stih(2, new int[]{86, 42, 100}),
            new Druga.Stih(1, new int[]{12, 53, 81}),
            new Druga.Stih(0, new int[]{17, 14, 59}),
            new Druga.Stih(2, new int[]{61, 94, 79}),
            new Druga.Stih(0, new int[]{82, 5, 64}),
            new Druga.Stih(0, new int[]{114, 7, 36}),
            new Druga.Stih(0, new int[]{26, 122, 83}),
            new Druga.Stih(1, new int[]{109, 48, 10}),
            new Druga.Stih(1, new int[]{57, 125, 120}),
            new Druga.Stih(2, new int[]{23, 110, 58}),
            new Druga.Stih(0, new int[]{25, 62, 119}),
            new Druga.Stih(2, new int[]{112, 99, 97}),
            new Druga.Stih(2, new int[]{28, 51, 107}),
            new Druga.Stih(1, new int[]{30, 39, 27}),
            new Druga.Stih(2, new int[]{118, 6, 63}),
            new Druga.Stih(2, new int[]{65, 46, 0}),
            new Druga.Stih(2, new int[]{68, 69, 32}),
            new Druga.Stih(0, new int[]{38, 16, 95}),
            new Druga.Stih(2, new int[]{9, 3, 37}),
            new Druga.Stih(1, new int[]{111, 88, 22}),
            new Druga.Stih(1, new int[]{87, 8, 84}),
            new Druga.Stih(1, new int[]{1, 67, 78}),
            new Druga.Stih(0, new int[]{93, 105, 71}),
            new Druga.Stih(1, new int[]{113, 19, 91}),
            new Druga.Stih(1, new int[]{106, 21, 121}),
            new Druga.Stih(0, new int[]{60, 34, 98}),
            new Druga.Stih(2, new int[]{41, 4, 77}),
            new Druga.Stih(1, new int[]{56, 70, 15}),
            new Druga.Stih(2, new int[]{45, 11, 102}),
            new Druga.Stih(1, new int[]{31, 89, 33}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
