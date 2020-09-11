
import java.util.Arrays;

public class Test43 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{1, 21, 0, 25}),
            new Druga.Stih(3, new int[]{12, 17, 2, 22}),
            new Druga.Stih(2, new int[]{6, 4, 10, 3}),
            new Druga.Stih(0, new int[]{18, 7, 15, 20}),
            new Druga.Stih(3, new int[]{24, 9, 13, 26}),
            new Druga.Stih(2, new int[]{5, 19, 11, 8}),
            new Druga.Stih(3, new int[]{16, 14, 27, 23}),
        };
        Druga.Partija partija = new Druga.Partija(4, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
