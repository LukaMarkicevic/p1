
import java.util.Arrays;

public class Test23 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Otilija Oblak");

        Druga.Clanek[] clanki = new Druga.Clanek[11];
        clanki[0] = new Druga.Clanek(
                "Preucevanje sociologije z instrumenti heraldike",
                new Druga.Oseba[]{osebe[0]}, 
                30
        );
        clanki[1] = new Druga.Clanek(
                "Vidiki cvetlicarstva pri studiju veterine",
                new Druga.Oseba[]{osebe[0]}, 
                38
        );
        clanki[2] = new Druga.Clanek(
                "Vidiki fizike pri studiju naravoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                56
        );
        clanki[3] = new Druga.Clanek(
                "Vidiki psihologije pri studiju jezikoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                29
        );
        clanki[4] = new Druga.Clanek(
                "Preucevanje jezikoslovja z instrumenti matematike",
                new Druga.Oseba[]{osebe[0]}, 
                88
        );
        clanki[5] = new Druga.Clanek(
                "Preucevanje ekologije z instrumenti optometrije",
                new Druga.Oseba[]{osebe[0]}, 
                26
        );
        clanki[6] = new Druga.Clanek(
                "Vidiki zgodovinopisja pri studiju jezikoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                91
        );
        clanki[7] = new Druga.Clanek(
                "Vidiki geologije pri studiju demografije",
                new Druga.Oseba[]{osebe[0]}, 
                94
        );
        clanki[8] = new Druga.Clanek(
                "Vpliv jezikoslovja na razvoj naravoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                32
        );
        clanki[9] = new Druga.Clanek(
                "Brez tehnologije ni optometrije",
                new Druga.Oseba[]{osebe[0]}, 
                48
        );
        clanki[10] = new Druga.Clanek(
                "Brez geologije ni jezikoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                72
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4], clanki[5], clanki[6], clanki[7], clanki[8], clanki[9], clanki[10]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
