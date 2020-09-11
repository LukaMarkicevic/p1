
import java.util.Arrays;

public class Test29 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[9];
        osebe[0] = new Druga.Oseba("Franci Andrejc");
        osebe[1] = new Druga.Oseba("Jana Cevc");
        osebe[2] = new Druga.Oseba("Oton Holc");
        osebe[3] = new Druga.Oseba("Jana Jenko");
        osebe[4] = new Druga.Oseba("Sandi Kobal");
        osebe[5] = new Druga.Oseba("Bojan Satler");
        osebe[6] = new Druga.Oseba("Cvetko Tavzes");
        osebe[7] = new Druga.Oseba("Sonja Tavzes");
        osebe[8] = new Druga.Oseba("Petra Vehar");

        Druga.Clanek[] clanki = new Druga.Clanek[1];
        clanki[0] = new Druga.Clanek(
                "Razvoj demografije skozi oci tehnologije",
                new Druga.Oseba[]{osebe[0], osebe[2], osebe[3], osebe[5], osebe[8]}, 
                48
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{});
        osebe[7].nastaviClanke(new Druga.Clanek[]{});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[0]});

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
