
import java.util.Arrays;

public class Test02 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{9, 4}),
            new Druga.Stih(0, new int[]{5, 10}),
            new Druga.Stih(1, new int[]{2, 3}),
            new Druga.Stih(0, new int[]{8, 11}),
            new Druga.Stih(1, new int[]{6, 7}),
            new Druga.Stih(0, new int[]{1, 0}),
        };
        Druga.Partija partija = new Druga.Partija(2, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].vrednost());
        }
    }
}
