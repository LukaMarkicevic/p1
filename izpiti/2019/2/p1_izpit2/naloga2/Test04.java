
import java.util.Arrays;

public class Test04 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[4];
        osebe[0] = new Druga.Oseba("Franci Bevc");
        osebe[1] = new Druga.Oseba("Nikolaj Cevc");
        osebe[2] = new Druga.Oseba("Anton Holc");
        osebe[3] = new Druga.Oseba("Petra Nardin");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Razvoj psihologije skozi oci biologije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3]}, 
                45
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
