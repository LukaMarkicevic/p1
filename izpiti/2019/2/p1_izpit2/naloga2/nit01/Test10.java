
import java.util.Arrays;

public class Test10 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[10];
        osebe[0] = new Druga.Oseba("Cvetka Andrejc");
        osebe[1] = new Druga.Oseba("Cvetko Ferjan");
        osebe[2] = new Druga.Oseba("Lara Kobal");
        osebe[3] = new Druga.Oseba("Otilija Lobnik");
        osebe[4] = new Druga.Oseba("Breda Mihevc");
        osebe[5] = new Druga.Oseba("Iva Nardin");
        osebe[6] = new Druga.Oseba("Roman Rejc");
        osebe[7] = new Druga.Oseba("Jana Satler");
        osebe[8] = new Druga.Oseba("Leopold Vehar");
        osebe[9] = new Druga.Oseba("Vinko Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Vidiki arheologije pri studiju psihologije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4], osebe[5], osebe[6], osebe[7], osebe[8], osebe[9]}, 
                5
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[9].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
