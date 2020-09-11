
import java.util.Arrays;

public class Test02 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[2];
        osebe[0] = new Druga.Oseba("Emil Nardin");
        osebe[1] = new Druga.Oseba("Dejan Satler");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Preucevanje kemije z instrumenti arheologije",
                new Druga.Oseba[]{osebe[0], osebe[1]}, 
                44
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
