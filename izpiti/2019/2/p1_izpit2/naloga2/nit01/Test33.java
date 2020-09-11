
import java.util.Arrays;

public class Test33 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[5];
        osebe[0] = new Druga.Oseba("Eva Andrejc");
        osebe[1] = new Druga.Oseba("Karel Ferjan");
        osebe[2] = new Druga.Oseba("Peter Ferjan");
        osebe[3] = new Druga.Oseba("Urban Kobal");
        osebe[4] = new Druga.Oseba("Nikolaj Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[5];
        clanki[0] = new Druga.Clanek(
                "Preucevanje arheologije z instrumenti heraldike",
                new Druga.Oseba[]{osebe[2], osebe[4]}, 
                60
        );
        clanki[1] = new Druga.Clanek(
                "Brez zgodovinopisja ni demografije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2]}, 
                25
        );
        clanki[2] = new Druga.Clanek(
                "Razvoj ekologije skozi oci leposlovja",
                new Druga.Oseba[]{osebe[1]}, 
                30
        );
        clanki[3] = new Druga.Clanek(
                "Preucevanje optometrije z instrumenti heraldike",
                new Druga.Oseba[]{osebe[3], osebe[4]}, 
                50
        );
        clanki[4] = new Druga.Clanek(
                "Vidiki naravoslovja pri studiju psihologije",
                new Druga.Oseba[]{osebe[2], osebe[3], osebe[4]}, 
                56
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[4]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[3], clanki[4]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[3], clanki[4]});

        for (int i = 0;  i < osebe.length;  i++) {
            for (int j = 0;  j < osebe.length;  j++) {
                if (i == j) {
                    System.out.print('/');
                } else {
                    System.out.print(osebe[i].jeSoavtorZ(osebe[j]) ? '+' : '-');
                }
            }
            System.out.println();
        }
    }
}
