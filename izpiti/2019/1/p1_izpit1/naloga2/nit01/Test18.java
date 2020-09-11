
import java.util.Arrays;

public class Test18 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{22, 11, 19, 12}),
            new Druga.Stih(0, new int[]{8, 18, 21, 26}),
            new Druga.Stih(3, new int[]{14, 6, 7, 0}),
            new Druga.Stih(3, new int[]{13, 20, 15, 27}),
            new Druga.Stih(2, new int[]{5, 1, 25, 2}),
            new Druga.Stih(0, new int[]{23, 17, 24, 4}),
            new Druga.Stih(2, new int[]{16, 10, 9, 3}),
        };
        Druga.Partija partija = new Druga.Partija(4, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
