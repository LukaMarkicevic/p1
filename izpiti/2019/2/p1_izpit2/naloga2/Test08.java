
import java.util.Arrays;

public class Test08 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[8];
        osebe[0] = new Druga.Oseba("Marjana Erjavec");
        osebe[1] = new Druga.Oseba("Leopold Golob");
        osebe[2] = new Druga.Oseba("Darja Holc");
        osebe[3] = new Druga.Oseba("Tatjana Lobnik");
        osebe[4] = new Druga.Oseba("Lara Mihevc");
        osebe[5] = new Druga.Oseba("Lara Peternel");
        osebe[6] = new Druga.Oseba("Roman Tavzes");
        osebe[7] = new Druga.Oseba("Otilija Vehar");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Brez kemije ni optometrije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4], osebe[5], osebe[6], osebe[7]}, 
                57
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
