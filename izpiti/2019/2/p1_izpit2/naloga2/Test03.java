
import java.util.Arrays;

public class Test03 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[3];
        osebe[0] = new Druga.Oseba("Ana Erjavec");
        osebe[1] = new Druga.Oseba("Emil Peternel");
        osebe[2] = new Druga.Oseba("Sandi Rejc");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Razvoj psihologije skozi oci heraldike",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2]}, 
                93
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
