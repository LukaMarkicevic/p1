
import java.util.Arrays;

public class Test13 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{1, 3}),
            new Druga.Stih(1, new int[]{4, 0}),
            new Druga.Stih(1, new int[]{5, 2}),
        };
        Druga.Partija partija = new Druga.Partija(2, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
