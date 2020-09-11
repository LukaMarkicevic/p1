
import java.util.Arrays;

public class Test16 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Hinko Debeljak");

        Druga.Clanek[] clanki = new Druga.Clanek[4];
        clanki[0] = new Druga.Clanek(
                "Brez fizike ni demografije",
                new Druga.Oseba[]{osebe[0]}, 
                81
        );
        clanki[1] = new Druga.Clanek(
                "Vpliv ekologije na razvoj geologije",
                new Druga.Oseba[]{osebe[0]}, 
                70
        );
        clanki[2] = new Druga.Clanek(
                "Vidiki jezikoslovja pri studiju biologije",
                new Druga.Oseba[]{osebe[0]}, 
                56
        );
        clanki[3] = new Druga.Clanek(
                "Razvoj matematike skozi oci geologije",
                new Druga.Oseba[]{osebe[0]}, 
                11
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2], clanki[3]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
