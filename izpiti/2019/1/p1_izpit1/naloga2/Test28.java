
import java.util.Arrays;

public class Test28 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{0, 1, 2}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        for (int karta = 0;  karta < 3;  karta++) {
            System.out.println(partija.kdoJeVrgel(karta));
        }
    }
}
