
import java.util.Arrays;

public class Test16 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{2, 15, 29}),
            new Druga.Stih(2, new int[]{4, 21, 19}),
            new Druga.Stih(0, new int[]{8, 10, 24}),
            new Druga.Stih(2, new int[]{13, 18, 3}),
            new Druga.Stih(0, new int[]{27, 14, 28}),
            new Druga.Stih(2, new int[]{6, 0, 1}),
            new Druga.Stih(2, new int[]{20, 22, 25}),
            new Druga.Stih(1, new int[]{11, 9, 7}),
            new Druga.Stih(1, new int[]{12, 5, 16}),
            new Druga.Stih(0, new int[]{17, 23, 26}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
