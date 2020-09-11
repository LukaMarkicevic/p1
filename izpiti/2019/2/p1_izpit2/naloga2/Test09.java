
import java.util.Arrays;

public class Test09 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[9];
        osebe[0] = new Druga.Oseba("Oton Cevc");
        osebe[1] = new Druga.Oseba("Leopold Debeljak");
        osebe[2] = new Druga.Oseba("Francka Golob");
        osebe[3] = new Druga.Oseba("Vinko Golob");
        osebe[4] = new Druga.Oseba("Karel Lobnik");
        osebe[5] = new Druga.Oseba("Darja Mihevc");
        osebe[6] = new Druga.Oseba("Francka Nardin");
        osebe[7] = new Druga.Oseba("Zoran Oblak");
        osebe[8] = new Druga.Oseba("Marjana Rejc");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Preucevanje leposlovja z instrumenti biologije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4], osebe[5], osebe[6], osebe[7], osebe[8]}, 
                90
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
