
import java.util.Arrays;

public class Test13 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Ula Oblak");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Vidiki zgodovinopisja pri studiju naravoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                1
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
