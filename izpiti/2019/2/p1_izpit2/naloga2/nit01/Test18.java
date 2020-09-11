
import java.util.Arrays;

public class Test18 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Bojan Golob");

        Druga.Clanek[] clanki = new Druga.Clanek[6];
        clanki[0] = new Druga.Clanek(
                "Razvoj heraldike skozi oci kemije",
                new Druga.Oseba[]{osebe[0]}, 
                97
        );
        clanki[1] = new Druga.Clanek(
                "Razvoj jezikoslovja skozi oci kemije",
                new Druga.Oseba[]{osebe[0]}, 
                68
        );
        clanki[2] = new Druga.Clanek(
                "Vpliv tehnologije na razvoj psihologije",
                new Druga.Oseba[]{osebe[0]}, 
                11
        );
        clanki[3] = new Druga.Clanek(
                "Vpliv jezikoslovja na razvoj leposlovja",
                new Druga.Oseba[]{osebe[0]}, 
                16
        );
        clanki[4] = new Druga.Clanek(
                "Preucevanje matematike z instrumenti zgodovinopisja",
                new Druga.Oseba[]{osebe[0]}, 
                44
        );
        clanki[5] = new Druga.Clanek(
                "Preucevanje geologije z instrumenti matematike",
                new Druga.Oseba[]{osebe[0]}, 
                69
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3], clanki[4], clanki[5]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
