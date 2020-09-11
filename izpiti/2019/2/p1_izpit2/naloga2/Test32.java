
import java.util.Arrays;

public class Test32 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[5];
        osebe[0] = new Druga.Oseba("Peter Debeljak");
        osebe[1] = new Druga.Oseba("Urban Holc");
        osebe[2] = new Druga.Oseba("Gorazd Oblak");
        osebe[3] = new Druga.Oseba("Janez Oblak");
        osebe[4] = new Druga.Oseba("Roman Tavzes");

        Druga.Clanek[] clanki = new Druga.Clanek[3];
        clanki[0] = new Druga.Clanek(
                "Preucevanje zgodovinopisja z instrumenti ideologije",
                new Druga.Oseba[]{osebe[0]}, 
                16
        );
        clanki[1] = new Druga.Clanek(
                "Vidiki fizike pri studiju heraldike",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[2], osebe[3], osebe[4]}, 
                44
        );
        clanki[2] = new Druga.Clanek(
                "Vidiki optometrije pri studiju racunalnistva",
                new Druga.Oseba[]{osebe[4]}, 
                36
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2]});

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
