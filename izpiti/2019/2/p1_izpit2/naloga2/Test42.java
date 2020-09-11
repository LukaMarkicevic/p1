
import java.util.Arrays;

public class Test42 {

    public static void main(String[] args) {
        Druga.Oseba oseba1 = new Druga.Oseba("Gabrijela Kobal");
        Druga.Oseba[] osebaa1 = {oseba1};
        Druga.Clanek[] clanki1 = {
            new Druga.Clanek("A", osebaa1, 5),
            new Druga.Clanek("A", osebaa1, 13),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 6),
            new Druga.Clanek("A", osebaa1, 13),
            new Druga.Clanek("A", osebaa1, 17),
            new Druga.Clanek("A", osebaa1, 15),
            new Druga.Clanek("A", osebaa1, 20),
            new Druga.Clanek("A", osebaa1, 17),
            new Druga.Clanek("A", osebaa1, 13),
            new Druga.Clanek("A", osebaa1, 7),
            new Druga.Clanek("A", osebaa1, 15),
            new Druga.Clanek("A", osebaa1, 14),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 8),
            new Druga.Clanek("A", osebaa1, 18),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 3),
            new Druga.Clanek("A", osebaa1, 1),
            new Druga.Clanek("A", osebaa1, 14),
            new Druga.Clanek("A", osebaa1, 3),
            new Druga.Clanek("A", osebaa1, 9),
            new Druga.Clanek("A", osebaa1, 3),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 16),
            new Druga.Clanek("A", osebaa1, 3),
            new Druga.Clanek("A", osebaa1, 19),
            new Druga.Clanek("A", osebaa1, 14),
            new Druga.Clanek("A", osebaa1, 18),
        };
        oseba1.nastaviClanke(clanki1);
        System.out.println(oseba1.hIndeks());

        Druga.Oseba oseba2 = new Druga.Oseba("Jana Holc");
        Druga.Oseba[] osebaa2 = {oseba2};
        Druga.Clanek[] clanki2 = {
            new Druga.Clanek("A", osebaa2, 19),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 0),
            new Druga.Clanek("A", osebaa2, 5),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 14),
            new Druga.Clanek("A", osebaa2, 17),
            new Druga.Clanek("A", osebaa2, 18),
            new Druga.Clanek("A", osebaa2, 4),
            new Druga.Clanek("A", osebaa2, 16),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 17),
            new Druga.Clanek("A", osebaa2, 13),
            new Druga.Clanek("A", osebaa2, 0),
            new Druga.Clanek("A", osebaa2, 4),
            new Druga.Clanek("A", osebaa2, 19),
            new Druga.Clanek("A", osebaa2, 20),
            new Druga.Clanek("A", osebaa2, 20),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 14),
            new Druga.Clanek("A", osebaa2, 6),
            new Druga.Clanek("A", osebaa2, 0),
            new Druga.Clanek("A", osebaa2, 15),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 7),
            new Druga.Clanek("A", osebaa2, 18),
            new Druga.Clanek("A", osebaa2, 8),
            new Druga.Clanek("A", osebaa2, 8),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 0),
        };
        oseba2.nastaviClanke(clanki2);
        System.out.println(oseba2.hIndeks());

    }
}
