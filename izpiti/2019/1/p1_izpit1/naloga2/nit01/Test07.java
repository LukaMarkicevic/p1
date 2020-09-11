
import java.util.Arrays;

public class Test07 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{28, 18, 11, 12, 0}),
            new Druga.Stih(0, new int[]{29, 16, 10, 22, 19}),
            new Druga.Stih(0, new int[]{25, 5, 6, 15, 17}),
            new Druga.Stih(0, new int[]{27, 2, 3, 24, 7}),
            new Druga.Stih(0, new int[]{20, 9, 26, 4, 21}),
            new Druga.Stih(2, new int[]{13, 14, 8, 23, 1}),
        };
        Druga.Partija partija = new Druga.Partija(5, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].vrednost());
        }
    }
}
