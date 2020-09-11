
import java.util.Arrays;

public class Test04 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{13, 14, 19}),
            new Druga.Stih(2, new int[]{28, 2, 8}),
            new Druga.Stih(2, new int[]{17, 1, 4}),
            new Druga.Stih(2, new int[]{15, 20, 21}),
            new Druga.Stih(1, new int[]{12, 3, 11}),
            new Druga.Stih(1, new int[]{16, 18, 0}),
            new Druga.Stih(2, new int[]{24, 9, 23}),
            new Druga.Stih(2, new int[]{29, 26, 22}),
            new Druga.Stih(2, new int[]{10, 5, 6}),
            new Druga.Stih(2, new int[]{27, 7, 25}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].vrednost());
        }
    }
}
