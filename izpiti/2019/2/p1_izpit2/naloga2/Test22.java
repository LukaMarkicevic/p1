
import java.util.Arrays;

public class Test22 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Jana Debeljak");

        Druga.Clanek[] clanki = new Druga.Clanek[10];
        clanki[0] = new Druga.Clanek(
                "Preucevanje zgodovinopisja z instrumenti naravoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                63
        );
        clanki[1] = new Druga.Clanek(
                "Vpliv sociologije na razvoj demografije",
                new Druga.Oseba[]{osebe[0]}, 
                75
        );
        clanki[2] = new Druga.Clanek(
                "Vidiki ekologije pri studiju naravoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                72
        );
        clanki[3] = new Druga.Clanek(
                "Preucevanje tehnologije z instrumenti sociologije",
                new Druga.Oseba[]{osebe[0]}, 
                77
        );
        clanki[4] = new Druga.Clanek(
                "Preucevanje matematike z instrumenti sociologije",
                new Druga.Oseba[]{osebe[0]}, 
                64
        );
        clanki[5] = new Druga.Clanek(
                "Vidiki ekologije pri studiju veterine",
                new Druga.Oseba[]{osebe[0]}, 
                62
        );
        clanki[6] = new Druga.Clanek(
                "Brez ekologije ni kemije",
                new Druga.Oseba[]{osebe[0]}, 
                3
        );
        clanki[7] = new Druga.Clanek(
                "Vidiki racunalnistva pri studiju matematike",
                new Druga.Oseba[]{osebe[0]}, 
                25
        );
        clanki[8] = new Druga.Clanek(
                "Vpliv kemije na razvoj jezikoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                19
        );
        clanki[9] = new Druga.Clanek(
                "Preucevanje psihologije z instrumenti heraldike",
                new Druga.Oseba[]{osebe[0]}, 
                49
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4], clanki[5], clanki[6], clanki[7], clanki[8], clanki[9]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
