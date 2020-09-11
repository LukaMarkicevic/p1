
import java.util.Arrays;

public class Test20 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Francka Ferjan");

        Druga.Clanek[] clanki = new Druga.Clanek[8];
        clanki[0] = new Druga.Clanek(
                "Razvoj naravoslovja skozi oci demografije",
                new Druga.Oseba[]{osebe[0]}, 
                93
        );
        clanki[1] = new Druga.Clanek(
                "Vpliv geologije na razvoj psihologije",
                new Druga.Oseba[]{osebe[0]}, 
                17
        );
        clanki[2] = new Druga.Clanek(
                "Brez psihologije ni naravoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                91
        );
        clanki[3] = new Druga.Clanek(
                "Razvoj optometrije skozi oci leposlovja",
                new Druga.Oseba[]{osebe[0]}, 
                75
        );
        clanki[4] = new Druga.Clanek(
                "Razvoj psihologije skozi oci matematike",
                new Druga.Oseba[]{osebe[0]}, 
                42
        );
        clanki[5] = new Druga.Clanek(
                "Preucevanje veterine z instrumenti biologije",
                new Druga.Oseba[]{osebe[0]}, 
                15
        );
        clanki[6] = new Druga.Clanek(
                "Razvoj ideologije skozi oci urbanizma",
                new Druga.Oseba[]{osebe[0]}, 
                68
        );
        clanki[7] = new Druga.Clanek(
                "Preucevanje geologije z instrumenti biologije",
                new Druga.Oseba[]{osebe[0]}, 
                89
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4], clanki[5], clanki[6], clanki[7]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
