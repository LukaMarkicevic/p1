
import java.util.Arrays;

public class Test27 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[14];
        osebe[0] = new Druga.Oseba("Hinko Andrejc");
        osebe[1] = new Druga.Oseba("Petra Andrejc");
        osebe[2] = new Druga.Oseba("Franci Erjavec");
        osebe[3] = new Druga.Oseba("Gorazd Erjavec");
        osebe[4] = new Druga.Oseba("Janez Erjavec");
        osebe[5] = new Druga.Oseba("Marjana Holc");
        osebe[6] = new Druga.Oseba("Zinka Kobal");
        osebe[7] = new Druga.Oseba("Eva Oblak");
        osebe[8] = new Druga.Oseba("Zinka Peternel");
        osebe[9] = new Druga.Oseba("Janez Rejc");
        osebe[10] = new Druga.Oseba("Sonja Satler");
        osebe[11] = new Druga.Oseba("Zoran Satler");
        osebe[12] = new Druga.Oseba("Roman Urh");
        osebe[13] = new Druga.Oseba("Romana Vehar");

        Druga.Clanek[] clanki = new Druga.Clanek[6];
        clanki[0] = new Druga.Clanek(
                "Vpliv ideologije na razvoj urbanizma",
                new Druga.Oseba[]{osebe[5]}, 
                72
        );
        clanki[1] = new Druga.Clanek(
                "Vpliv arheologije na razvoj urbanizma",
                new Druga.Oseba[]{osebe[4], osebe[6], osebe[9], osebe[12]}, 
                35
        );
        clanki[2] = new Druga.Clanek(
                "Vpliv cvetlicarstva na razvoj heraldike",
                new Druga.Oseba[]{osebe[4], osebe[6], osebe[10]}, 
                81
        );
        clanki[3] = new Druga.Clanek(
                "Brez optometrije ni jezikoslovja",
                new Druga.Oseba[]{osebe[11]}, 
                97
        );
        clanki[4] = new Druga.Clanek(
                "Preucevanje matematike z instrumenti naravoslovja",
                new Druga.Oseba[]{osebe[1], osebe[4], osebe[11]}, 
                12
        );
        clanki[5] = new Druga.Clanek(
                "Razvoj sociologije skozi oci naravoslovja",
                new Druga.Oseba[]{osebe[11]}, 
                8
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[4]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{});
        osebe[3].nastaviClanke(new Druga.Clanek[]{});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2], clanki[4]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{});
        osebe[8].nastaviClanke(new Druga.Clanek[]{});
        osebe[9].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[10].nastaviClanke(new Druga.Clanek[]{clanki[2]});
        osebe[11].nastaviClanke(new Druga.Clanek[]{clanki[3], clanki[4], clanki[5]});
        osebe[12].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[13].nastaviClanke(new Druga.Clanek[]{});

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
