
import java.util.Arrays;

public class Test21 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Petra Kobal");

        Druga.Clanek[] clanki = new Druga.Clanek[9];
        clanki[0] = new Druga.Clanek(
                "Vpliv naravoslovja na razvoj matematike",
                new Druga.Oseba[]{osebe[0]}, 
                100
        );
        clanki[1] = new Druga.Clanek(
                "Razvoj jezikoslovja skozi oci tehnologije",
                new Druga.Oseba[]{osebe[0]}, 
                40
        );
        clanki[2] = new Druga.Clanek(
                "Razvoj demografije skozi oci racunalnistva",
                new Druga.Oseba[]{osebe[0]}, 
                37
        );
        clanki[3] = new Druga.Clanek(
                "Preucevanje ideologije z instrumenti jezikoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                81
        );
        clanki[4] = new Druga.Clanek(
                "Vidiki ideologije pri studiju kemije",
                new Druga.Oseba[]{osebe[0]}, 
                99
        );
        clanki[5] = new Druga.Clanek(
                "Vpliv arheologije na razvoj zgodovinopisja",
                new Druga.Oseba[]{osebe[0]}, 
                44
        );
        clanki[6] = new Druga.Clanek(
                "Razvoj veterine skozi oci cvetlicarstva",
                new Druga.Oseba[]{osebe[0]}, 
                93
        );
        clanki[7] = new Druga.Clanek(
                "Brez zgodovinopisja ni optometrije",
                new Druga.Oseba[]{osebe[0]}, 
                88
        );
        clanki[8] = new Druga.Clanek(
                "Vpliv fizike na razvoj zgodovinopisja",
                new Druga.Oseba[]{osebe[0]}, 
                92
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4], clanki[5], clanki[6], clanki[7], clanki[8]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
