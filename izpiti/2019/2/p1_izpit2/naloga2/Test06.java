
import java.util.Arrays;

public class Test06 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[6];
        osebe[0] = new Druga.Oseba("Petra Bevc");
        osebe[1] = new Druga.Oseba("Darja Holc");
        osebe[2] = new Druga.Oseba("Nikolaj Satler");
        osebe[3] = new Druga.Oseba("Lara Vehar");
        osebe[4] = new Druga.Oseba("Zinka Vehar");
        osebe[5] = new Druga.Oseba("Eva Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Preucevanje veterine z instrumenti psihologije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4], osebe[5]}, 
                98
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
