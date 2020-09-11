
import java.util.Arrays;

public class Test14 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{5, 4}),
            new Druga.Stih(0, new int[]{2, 11}),
            new Druga.Stih(1, new int[]{0, 7}),
            new Druga.Stih(0, new int[]{8, 9}),
            new Druga.Stih(1, new int[]{3, 6}),
            new Druga.Stih(0, new int[]{10, 1}),
        };
        Druga.Partija partija = new Druga.Partija(2, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
