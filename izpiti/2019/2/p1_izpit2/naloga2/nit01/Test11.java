
import java.util.Arrays;

public class Test11 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[11];
        osebe[0] = new Druga.Oseba("Cvetka Debeljak");
        osebe[1] = new Druga.Oseba("Nikolaj Erjavec");
        osebe[2] = new Druga.Oseba("Gabrijela Jenko");
        osebe[3] = new Druga.Oseba("Tine Kobal");
        osebe[4] = new Druga.Oseba("Iva Lobnik");
        osebe[5] = new Druga.Oseba("Zoran Peternel");
        osebe[6] = new Druga.Oseba("Romana Rejc");
        osebe[7] = new Druga.Oseba("Sonja Satler");
        osebe[8] = new Druga.Oseba("Zoran Urh");
        osebe[9] = new Druga.Oseba("Hilda Vehar");
        osebe[10] = new Druga.Oseba("Roman Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Brez biologije ni naravoslovja",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4], osebe[5], osebe[6], osebe[7], osebe[8], osebe[9], osebe[10]}, 
                6
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
        osebe[10].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
