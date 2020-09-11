
import java.util.Arrays;

public class Test12 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[12];
        osebe[0] = new Druga.Oseba("Leopold Andrejc");
        osebe[1] = new Druga.Oseba("Petra Bevc");
        osebe[2] = new Druga.Oseba("Urban Bevc");
        osebe[3] = new Druga.Oseba("Karel Cevc");
        osebe[4] = new Druga.Oseba("Nikolaj Golob");
        osebe[5] = new Druga.Oseba("Romana Golob");
        osebe[6] = new Druga.Oseba("Eva Jenko");
        osebe[7] = new Druga.Oseba("Peter Jenko");
        osebe[8] = new Druga.Oseba("Zoran Kobal");
        osebe[9] = new Druga.Oseba("Cvetka Peternel");
        osebe[10] = new Druga.Oseba("Vinko Rejc");
        osebe[11] = new Druga.Oseba("Lara Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Vpliv zgodovinopisja na razvoj ekologije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4], osebe[5], osebe[6], osebe[7], osebe[8], osebe[9], osebe[10], osebe[11]}, 
                50
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
        osebe[11].nastaviClanke(new Druga.Clanek[]{clanki[0]});

        System.out.println(Arrays.toString(clanki[0].ipjiAvtorjev()));
    }
}
