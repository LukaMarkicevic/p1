
import java.util.Arrays;

public class Test06 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{5, 13, 19, 16}),
            new Druga.Stih(2, new int[]{10, 23, 14, 11}),
            new Druga.Stih(3, new int[]{6, 8, 22, 17}),
            new Druga.Stih(1, new int[]{27, 2, 21, 4}),
            new Druga.Stih(1, new int[]{25, 12, 0, 15}),
            new Druga.Stih(1, new int[]{18, 9, 3, 7}),
            new Druga.Stih(1, new int[]{24, 20, 1, 26}),
        };
        Druga.Partija partija = new Druga.Partija(4, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].vrednost());
        }
    }
}
