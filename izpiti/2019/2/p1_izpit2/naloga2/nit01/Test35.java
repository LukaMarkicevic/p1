
import java.util.Arrays;

public class Test35 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[6];
        osebe[0] = new Druga.Oseba("Gorazd Mihevc");
        osebe[1] = new Druga.Oseba("Iva Oblak");
        osebe[2] = new Druga.Oseba("Otilija Peternel");
        osebe[3] = new Druga.Oseba("Gorazd Urh");
        osebe[4] = new Druga.Oseba("Hinko Urh");
        osebe[5] = new Druga.Oseba("Petra Urh");

        Druga.Clanek[] clanki = new Druga.Clanek[3];
        clanki[0] = new Druga.Clanek(
                "Vidiki leposlovja pri studiju psihologije",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[3], osebe[5]}, 
                93
        );
        clanki[1] = new Druga.Clanek(
                "Vpliv fizike na razvoj biologije",
                new Druga.Oseba[]{osebe[1], osebe[2], osebe[3], osebe[4], osebe[5]}, 
                64
        );
        clanki[2] = new Druga.Clanek(
                "Brez arheologije ni demografije",
                new Druga.Oseba[]{osebe[1], osebe[4], osebe[5]}, 
                22
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1], clanki[2]});

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
