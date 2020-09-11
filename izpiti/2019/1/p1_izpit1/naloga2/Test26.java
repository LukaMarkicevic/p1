
import java.util.Arrays;

public class Test26 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{3, 4}),
            new Druga.Stih(1, new int[]{2, 5}),
            new Druga.Stih(0, new int[]{1, 0}),
        };
        Druga.Partija partija = new Druga.Partija(2, stihi);
        for (int karta = 0;  karta < 6;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
