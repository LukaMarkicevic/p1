
import java.util.Arrays;

public class Test36 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[11];
        osebe[0] = new Druga.Oseba("Ivan Cevc");
        osebe[1] = new Druga.Oseba("Ana Ferjan");
        osebe[2] = new Druga.Oseba("Tine Ferjan");
        osebe[3] = new Druga.Oseba("Jana Holc");
        osebe[4] = new Druga.Oseba("Vida Ivnik");
        osebe[5] = new Druga.Oseba("Leopold Jenko");
        osebe[6] = new Druga.Oseba("Urban Kobal");
        osebe[7] = new Druga.Oseba("Lara Urh");
        osebe[8] = new Druga.Oseba("Gabrijela Vehar");
        osebe[9] = new Druga.Oseba("Nina Vehar");
        osebe[10] = new Druga.Oseba("Vinko Vehar");

        Druga.Clanek[] clanki = new Druga.Clanek[3];
        clanki[0] = new Druga.Clanek(
                "Razvoj racunalnistva skozi oci naravoslovja",
                new Druga.Oseba[]{osebe[3]}, 
                89
        );
        clanki[1] = new Druga.Clanek(
                "Brez zgodovinopisja ni leposlovja",
                new Druga.Oseba[]{osebe[4], osebe[6]}, 
                33
        );
        clanki[2] = new Druga.Clanek(
                "Razvoj psihologije skozi oci cvetlicarstva",
                new Druga.Oseba[]{osebe[4]}, 
                93
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{});
        osebe[1].nastaviClanke(new Druga.Clanek[]{});
        osebe[2].nastaviClanke(new Druga.Clanek[]{});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{});
        osebe[8].nastaviClanke(new Druga.Clanek[]{});
        osebe[9].nastaviClanke(new Druga.Clanek[]{});
        osebe[10].nastaviClanke(new Druga.Clanek[]{});

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
