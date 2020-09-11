
import java.util.Arrays;

public class Test44 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{0, 11, 15, 18, 4}),
            new Druga.Stih(3, new int[]{19, 10, 12, 1, 26}),
            new Druga.Stih(2, new int[]{8, 29, 16, 22, 6}),
            new Druga.Stih(3, new int[]{17, 21, 14, 24, 25}),
            new Druga.Stih(2, new int[]{20, 13, 3, 28, 2}),
            new Druga.Stih(0, new int[]{9, 7, 23, 5, 27}),
        };
        Druga.Partija partija = new Druga.Partija(5, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
