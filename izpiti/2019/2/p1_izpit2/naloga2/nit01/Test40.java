
import java.util.Arrays;

public class Test40 {

    public static void main(String[] args) {
        Druga.Oseba oseba1 = new Druga.Oseba("Roman Jenko");
        Druga.Oseba[] osebaa1 = {oseba1};
        Druga.Clanek[] clanki1 = {
            new Druga.Clanek("A", osebaa1, 16),
            new Druga.Clanek("A", osebaa1, 14),
            new Druga.Clanek("A", osebaa1, 14),
            new Druga.Clanek("A", osebaa1, 9),
            new Druga.Clanek("A", osebaa1, 9),
            new Druga.Clanek("A", osebaa1, 6),
            new Druga.Clanek("A", osebaa1, 4),
            new Druga.Clanek("A", osebaa1, 3),
        };
        oseba1.nastaviClanke(clanki1);
        System.out.println(oseba1.hIndeks());

        Druga.Oseba oseba2 = new Druga.Oseba("Lara Jenko");
        Druga.Oseba[] osebaa2 = {oseba2};
        Druga.Clanek[] clanki2 = {
            new Druga.Clanek("A", osebaa2, 16),
            new Druga.Clanek("A", osebaa2, 16),
            new Druga.Clanek("A", osebaa2, 14),
            new Druga.Clanek("A", osebaa2, 11),
            new Druga.Clanek("A", osebaa2, 10),
            new Druga.Clanek("A", osebaa2, 9),
            new Druga.Clanek("A", osebaa2, 4),
            new Druga.Clanek("A", osebaa2, 0),
        };
        oseba2.nastaviClanke(clanki2);
        System.out.println(oseba2.hIndeks());

        Druga.Oseba oseba3 = new Druga.Oseba("Darja Zajc");
        Druga.Oseba[] osebaa3 = {oseba3};
        Druga.Clanek[] clanki3 = {
            new Druga.Clanek("A", osebaa3, 19),
            new Druga.Clanek("A", osebaa3, 17),
            new Druga.Clanek("A", osebaa3, 16),
            new Druga.Clanek("A", osebaa3, 7),
            new Druga.Clanek("A", osebaa3, 6),
            new Druga.Clanek("A", osebaa3, 4),
            new Druga.Clanek("A", osebaa3, 4),
            new Druga.Clanek("A", osebaa3, 3),
        };
        oseba3.nastaviClanke(clanki3);
        System.out.println(oseba3.hIndeks());

    }
}
