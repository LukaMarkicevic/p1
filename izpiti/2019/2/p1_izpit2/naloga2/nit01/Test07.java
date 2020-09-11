
import java.util.Arrays;

public class Test07 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[7];
        osebe[0] = new Druga.Oseba("Franci Andrejc");
        osebe[1] = new Druga.Oseba("Gorazd Andrejc");
        osebe[2] = new Druga.Oseba("Roman Ferjan");
        osebe[3] = new Druga.Oseba("Roman Golob");
        osebe[4] = new Druga.Oseba("Tine Kobal");
        osebe[5] = new Druga.Oseba("Franci Mihevc");
        osebe[6] = new Druga.Oseba("Vinko Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Vpliv zgodovinopisja na razvoj ideologije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4], osebe[5], osebe[6]}, 
                84
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
