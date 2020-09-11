
import java.util.Arrays;

public class Test14 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[1];
        osebe[0] = new Druga.Oseba("Cvetka Tavzes");

        Druga.Clanek[] clanki = new Druga.Clanek[2];
        clanki[0] = new Druga.Clanek(
                "Vidiki fizike pri studiju veterine",
                new Druga.Oseba[]{osebe[0]}, 
                69
        );
        clanki[1] = new Druga.Clanek(
                "Preucevanje cvetlicarstva z instrumenti jezikoslovja",
                new Druga.Oseba[]{osebe[0]}, 
                68
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1]});

        System.out.println(osebe[0].najboljCitiran().vrniNaslov());
    }
}
