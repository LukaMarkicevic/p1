
import java.util.Arrays;

public class Test19 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Katja Ferjan");

        Druga.Clanek[] clanki = new Druga.Clanek[7];
        clanki[0] = new Druga.Clanek(
                "Brez ideologije ni fizike",
                new Druga.Oseba[]{osebe[0]}, 
                18
        );
        clanki[1] = new Druga.Clanek(
                "Razvoj biologije skozi oci racunalnistva",
                new Druga.Oseba[]{osebe[0]}, 
                73
        );
        clanki[2] = new Druga.Clanek(
                "Brez optometrije ni racunalnistva",
                new Druga.Oseba[]{osebe[0]}, 
                70
        );
        clanki[3] = new Druga.Clanek(
                "Preucevanje ekologije z instrumenti heraldike",
                new Druga.Oseba[]{osebe[0]}, 
                23
        );
        clanki[4] = new Druga.Clanek(
                "Preucevanje jezikoslovja z instrumenti leposlovja",
                new Druga.Oseba[]{osebe[0]}, 
                35
        );
        clanki[5] = new Druga.Clanek(
                "Preucevanje biologije z instrumenti urbanizma",
                new Druga.Oseba[]{osebe[0]}, 
                27
        );
        clanki[6] = new Druga.Clanek(
                "Preucevanje fizike z instrumenti urbanizma",
                new Druga.Oseba[]{osebe[0]}, 
                84
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4], clanki[5], clanki[6]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
