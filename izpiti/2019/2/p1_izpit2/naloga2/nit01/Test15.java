
import java.util.Arrays;

public class Test15 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Otilija Cevc");

        Druga.Clanek[] clanki = new Druga.Clanek[3];
        clanki[0] = new Druga.Clanek(
                "Vpliv fizike na razvoj jezikoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                74
        );
        clanki[1] = new Druga.Clanek(
                "Brez racunalnistva ni tehnologije",
                new Druga.Oseba[]{osebe[0]}, 
                43
        );
        clanki[2] = new Druga.Clanek(
                "Brez cvetlicarstva ni demografije",
                new Druga.Oseba[]{osebe[0]}, 
                22
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
