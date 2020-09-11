
import java.util.Arrays;

public class Test25 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Leopold Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[13];
        clanki[0] = new Druga.Clanek(
                "Vpliv fizike na razvoj ekologije",
                new Druga.Oseba[]{osebe[0]}, 
                66
        );
        clanki[1] = new Druga.Clanek(
                "Vidiki sociologije pri studiju fizike",
                new Druga.Oseba[]{osebe[0]}, 
                83
        );
        clanki[2] = new Druga.Clanek(
                "Vpliv leposlovja na razvoj zgodovinopisja",
                new Druga.Oseba[]{osebe[0]}, 
                74
        );
        clanki[3] = new Druga.Clanek(
                "Vidiki racunalnistva pri studiju kemije",
                new Druga.Oseba[]{osebe[0]}, 
                75
        );
        clanki[4] = new Druga.Clanek(
                "Brez cvetlicarstva ni psihologije",
                new Druga.Oseba[]{osebe[0]}, 
                71
        );
        clanki[5] = new Druga.Clanek(
                "Brez heraldike ni matematike",
                new Druga.Oseba[]{osebe[0]}, 
                22
        );
        clanki[6] = new Druga.Clanek(
                "Brez zgodovinopisja ni ekologije",
                new Druga.Oseba[]{osebe[0]}, 
                43
        );
        clanki[7] = new Druga.Clanek(
                "Razvoj racunalnistva skozi oci ideologije",
                new Druga.Oseba[]{osebe[0]}, 
                15
        );
        clanki[8] = new Druga.Clanek(
                "Razvoj heraldike skozi oci geologije",
                new Druga.Oseba[]{osebe[0]}, 
                34
        );
        clanki[9] = new Druga.Clanek(
                "Preucevanje racunalnistva z instrumenti tehnologije",
                new Druga.Oseba[]{osebe[0]}, 
                42
        );
        clanki[10] = new Druga.Clanek(
                "Preucevanje veterine z instrumenti geologije",
                new Druga.Oseba[]{osebe[0]}, 
                59
        );
        clanki[11] = new Druga.Clanek(
                "Preucevanje fizike z instrumenti urbanizma",
                new Druga.Oseba[]{osebe[0]}, 
                91
        );
        clanki[12] = new Druga.Clanek(
                "Vpliv veterine na razvoj demografije",
                new Druga.Oseba[]{osebe[0]}, 
                60
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4], clanki[5], clanki[6], clanki[7], clanki[8], clanki[9], clanki[10], clanki[11], clanki[12]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
