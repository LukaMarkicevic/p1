
import java.util.Arrays;

public class Test17 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Katja Erjavec");

        Druga.Clanek[] clanki = new Druga.Clanek[5];
        clanki[0] = new Druga.Clanek(
                "Vpliv cvetlicarstva na razvoj naravoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                23
        );
        clanki[1] = new Druga.Clanek(
                "Preucevanje kemije z instrumenti sociologije",
                new Druga.Oseba[]{osebe[0]}, 
                53
        );
        clanki[2] = new Druga.Clanek(
                "Vpliv matematike na razvoj zgodovinopisja",
                new Druga.Oseba[]{osebe[0]}, 
                10
        );
        clanki[3] = new Druga.Clanek(
                "Preucevanje matematike z instrumenti zgodovinopisja",
                new Druga.Oseba[]{osebe[0]}, 
                36
        );
        clanki[4] = new Druga.Clanek(
                "Razvoj ekologije skozi oci demografije",
                new Druga.Oseba[]{osebe[0]}, 
                46
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
