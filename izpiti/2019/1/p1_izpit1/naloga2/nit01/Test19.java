
import java.util.Arrays;

public class Test19 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{8, 6, 3, 1, 21}),
            new Druga.Stih(4, new int[]{18, 20, 11, 12, 16}),
            new Druga.Stih(0, new int[]{0, 27, 28, 7, 13}),
            new Druga.Stih(2, new int[]{5, 10, 14, 22, 4}),
            new Druga.Stih(0, new int[]{26, 23, 29, 24, 19}),
            new Druga.Stih(2, new int[]{17, 15, 2, 25, 9}),
        };
        Druga.Partija partija = new Druga.Partija(5, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
