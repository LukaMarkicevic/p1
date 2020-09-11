
import java.util.Arrays;

public class Test41 {

    public static void main(String[] args) {
        Druga.Oseba oseba1 = new Druga.Oseba("Nikolaj Oblak");
        Druga.Oseba[] osebaa1 = {oseba1};
        Druga.Clanek[] clanki1 = {
            new Druga.Clanek("A", osebaa1, 10),
            new Druga.Clanek("A", osebaa1, 9),
            new Druga.Clanek("A", osebaa1, 8),
            new Druga.Clanek("A", osebaa1, 6),
            new Druga.Clanek("A", osebaa1, 6),
            new Druga.Clanek("A", osebaa1, 5),
            new Druga.Clanek("A", osebaa1, 5),
            new Druga.Clanek("A", osebaa1, 4),
            new Druga.Clanek("A", osebaa1, 3),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 2),
            new Druga.Clanek("A", osebaa1, 1),
            new Druga.Clanek("A", osebaa1, 1),
            new Druga.Clanek("A", osebaa1, 0),
        };
        oseba1.nastaviClanke(clanki1);
        System.out.println(oseba1.hIndeks());

        Druga.Oseba oseba2 = new Druga.Oseba("Cvetka Nardin");
        Druga.Oseba[] osebaa2 = {oseba2};
        Druga.Clanek[] clanki2 = {
            new Druga.Clanek("A", osebaa2, 10),
            new Druga.Clanek("A", osebaa2, 9),
            new Druga.Clanek("A", osebaa2, 9),
            new Druga.Clanek("A", osebaa2, 8),
            new Druga.Clanek("A", osebaa2, 7),
            new Druga.Clanek("A", osebaa2, 5),
            new Druga.Clanek("A", osebaa2, 5),
            new Druga.Clanek("A", osebaa2, 5),
            new Druga.Clanek("A", osebaa2, 4),
            new Druga.Clanek("A", osebaa2, 4),
            new Druga.Clanek("A", osebaa2, 3),
            new Druga.Clanek("A", osebaa2, 2),
            new Druga.Clanek("A", osebaa2, 2),
            new Druga.Clanek("A", osebaa2, 1),
            new Druga.Clanek("A", osebaa2, 1),
        };
        oseba2.nastaviClanke(clanki2);
        System.out.println(oseba2.hIndeks());

        Druga.Oseba oseba3 = new Druga.Oseba("Vinko Ferjan");
        Druga.Oseba[] osebaa3 = {oseba3};
        Druga.Clanek[] clanki3 = {
            new Druga.Clanek("A", osebaa3, 10),
            new Druga.Clanek("A", osebaa3, 9),
            new Druga.Clanek("A", osebaa3, 7),
            new Druga.Clanek("A", osebaa3, 6),
            new Druga.Clanek("A", osebaa3, 6),
            new Druga.Clanek("A", osebaa3, 6),
            new Druga.Clanek("A", osebaa3, 5),
            new Druga.Clanek("A", osebaa3, 5),
            new Druga.Clanek("A", osebaa3, 4),
            new Druga.Clanek("A", osebaa3, 3),
            new Druga.Clanek("A", osebaa3, 3),
            new Druga.Clanek("A", osebaa3, 2),
            new Druga.Clanek("A", osebaa3, 1),
            new Druga.Clanek("A", osebaa3, 1),
            new Druga.Clanek("A", osebaa3, 1),
        };
        oseba3.nastaviClanke(clanki3);
        System.out.println(oseba3.hIndeks());

    }
}
