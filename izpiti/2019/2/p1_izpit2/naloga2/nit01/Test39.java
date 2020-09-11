
import java.util.Arrays;

public class Test39 {

    public static void main(String[] args) {
        Druga.Oseba oseba1 = new Druga.Oseba("Nina Oblak");
        Druga.Oseba[] osebaa1 = {oseba1};
        Druga.Clanek[] clanki1 = {
            new Druga.Clanek("A", osebaa1, 4),
            new Druga.Clanek("A", osebaa1, 4),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 0),
        };
        oseba1.nastaviClanke(clanki1);
        System.out.println(oseba1.hIndeks());

        Druga.Oseba oseba2 = new Druga.Oseba("Ivan Bevc");
        Druga.Oseba[] osebaa2 = {oseba2};
        Druga.Clanek[] clanki2 = {
            new Druga.Clanek("A", osebaa2, 4),
            new Druga.Clanek("A", osebaa2, 4),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 2),
        };
        oseba2.nastaviClanke(clanki2);
        System.out.println(oseba2.hIndeks());

    }
}
