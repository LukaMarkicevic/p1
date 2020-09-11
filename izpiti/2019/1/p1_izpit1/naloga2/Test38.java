
import java.util.Arrays;

public class Test38 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{1, 0}),
            new Druga.Stih(0, new int[]{5, 2}),
            new Druga.Stih(0, new int[]{3, 4}),
        };
        Druga.Partija partija = new Druga.Partija(2, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
