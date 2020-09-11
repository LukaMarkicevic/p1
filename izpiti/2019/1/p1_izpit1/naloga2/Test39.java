
import java.util.Arrays;

public class Test39 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{5, 10}),
            new Druga.Stih(1, new int[]{9, 2}),
            new Druga.Stih(1, new int[]{7, 4}),
            new Druga.Stih(1, new int[]{8, 0}),
            new Druga.Stih(1, new int[]{3, 6}),
            new Druga.Stih(0, new int[]{1, 11}),
        };
        Druga.Partija partija = new Druga.Partija(2, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
