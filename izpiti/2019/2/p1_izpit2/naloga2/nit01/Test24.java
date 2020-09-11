
import java.util.Arrays;

public class Test24 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Eva Ferjan");

        Druga.Clanek[] clanki = new Druga.Clanek[12];
        clanki[0] = new Druga.Clanek(
                "Preucevanje leposlovja z instrumenti arheologije",
                new Druga.Oseba[]{osebe[0]}, 
                93
        );
        clanki[1] = new Druga.Clanek(
                "Vidiki geologije pri studiju veterine",
                new Druga.Oseba[]{osebe[0]}, 
                36
        );
        clanki[2] = new Druga.Clanek(
                "Vidiki zgodovinopisja pri studiju geologije",
                new Druga.Oseba[]{osebe[0]}, 
                99
        );
        clanki[3] = new Druga.Clanek(
                "Vpliv arheologije na razvoj urbanizma",
                new Druga.Oseba[]{osebe[0]}, 
                31
        );
        clanki[4] = new Druga.Clanek(
                "Razvoj cvetlicarstva skozi oci biologije",
                new Druga.Oseba[]{osebe[0]}, 
                77
        );
        clanki[5] = new Druga.Clanek(
                "Razvoj sociologije skozi oci demografije",
                new Druga.Oseba[]{osebe[0]}, 
                0
        );
        clanki[6] = new Druga.Clanek(
                "Preucevanje arheologije z instrumenti optometrije",
                new Druga.Oseba[]{osebe[0]}, 
                64
        );
        clanki[7] = new Druga.Clanek(
                "Razvoj veterine skozi oci tehnologije",
                new Druga.Oseba[]{osebe[0]}, 
                96
        );
        clanki[8] = new Druga.Clanek(
                "Brez kemije ni matematike",
                new Druga.Oseba[]{osebe[0]}, 
                57
        );
        clanki[9] = new Druga.Clanek(
                "Preucevanje fizike z instrumenti ideologije",
                new Druga.Oseba[]{osebe[0]}, 
                100
        );
        clanki[10] = new Druga.Clanek(
                "Preucevanje psihologije z instrumenti biologije",
                new Druga.Oseba[]{osebe[0]}, 
                19
        );
        clanki[11] = new Druga.Clanek(
                "Brez naravoslovja ni sociologije",
                new Druga.Oseba[]{osebe[0]}, 
                8
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4], clanki[5], clanki[6], clanki[7], clanki[8], clanki[9], clanki[10], clanki[11]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
