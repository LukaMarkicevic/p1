
import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{3, 1}),
            new Druga.Stih(0, new int[]{5, 4}),
            new Druga.Stih(0, new int[]{2, 0}),
        };
        Druga.Partija partija = new Druga.Partija(2, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].vrednost());
        }
    }
}
