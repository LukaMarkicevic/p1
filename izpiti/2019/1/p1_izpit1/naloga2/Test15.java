
import java.util.Arrays;

public class Test15 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{0, 1, 2}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].dobitnik());
        }
    }
}
