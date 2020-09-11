
import java.util.Arrays;

public class Test40 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{0, 2, 1}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        System.out.println(Arrays.toString(partija.tocke()));
    }
}
