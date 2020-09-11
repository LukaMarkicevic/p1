
import java.util.Arrays;

public class Test05 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[5];
        osebe[0] = new Druga.Oseba("Gorazd Debeljak");
        osebe[1] = new Druga.Oseba("Katja Erjavec");
        osebe[2] = new Druga.Oseba("Francka Rejc");
        osebe[3] = new Druga.Oseba("Ula Tavzes");
        osebe[4] = new Druga.Oseba("Lara Urh");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Razvoj psihologije skozi oci sociologije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4]}, 
                11
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
