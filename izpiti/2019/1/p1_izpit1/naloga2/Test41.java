
import java.util.Arrays;

public class Test41 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{21, 4, 27}),
            new Druga.Stih(2, new int[]{7, 3, 0}),
            new Druga.Stih(2, new int[]{11, 1, 28}),
            new Druga.Stih(1, new int[]{15, 17, 16}),
            new Druga.Stih(2, new int[]{26, 5, 10}),
            new Druga.Stih(2, new int[]{13, 19, 12}),
            new Druga.Stih(0, new int[]{25, 29, 22}),
            new Druga.Stih(1, new int[]{2, 14, 8}),
            new Druga.Stih(2, new int[]{20, 24, 18}),
            new Druga.Stih(0, new int[]{6, 9, 23}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
