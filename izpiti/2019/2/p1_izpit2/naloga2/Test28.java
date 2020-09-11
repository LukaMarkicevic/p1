
import java.util.Arrays;

public class Test28 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[19];
        osebe[0] = new Druga.Oseba("Iva Bevc");
        osebe[1] = new Druga.Oseba("Oton Cevc");
        osebe[2] = new Druga.Oseba("Eva Debeljak");
        osebe[3] = new Druga.Oseba("Leopold Erjavec");
        osebe[4] = new Druga.Oseba("Hilda Ferjan");
        osebe[5] = new Druga.Oseba("Urban Ferjan");
        osebe[6] = new Druga.Oseba("Karel Golob");
        osebe[7] = new Druga.Oseba("Emil Holc");
        osebe[8] = new Druga.Oseba("Franci Jenko");
        osebe[9] = new Druga.Oseba("Janez Kobal");
        osebe[10] = new Druga.Oseba("Katja Lobnik");
        osebe[11] = new Druga.Oseba("Ana Mihevc");
        osebe[12] = new Druga.Oseba("Leopold Nardin");
        osebe[13] = new Druga.Oseba("Sandi Peternel");
        osebe[14] = new Druga.Oseba("Breda Rejc");
        osebe[15] = new Druga.Oseba("Nina Rejc");
        osebe[16] = new Druga.Oseba("Otilija Rejc");
        osebe[17] = new Druga.Oseba("Katja Vehar");
        osebe[18] = new Druga.Oseba("Vinko Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[12];
        clanki[0] = new Druga.Clanek(
                "Preucevanje heraldike z instrumenti sociologije",
                new Druga.Oseba[]{osebe[8]}, 
                71
        );
        clanki[1] = new Druga.Clanek(
                "Brez psihologije ni fizike",
                new Druga.Oseba[]{osebe[1], osebe[4], osebe[6], osebe[12]}, 
                18
        );
        clanki[2] = new Druga.Clanek(
                "Preucevanje jezikoslovja z instrumenti demografije",
                new Druga.Oseba[]{osebe[0], osebe[4], osebe[7], osebe[11], osebe[17]}, 
                2
        );
        clanki[3] = new Druga.Clanek(
                "Brez veterine ni cvetlicarstva",
                new Druga.Oseba[]{osebe[0], osebe[10], osebe[18]}, 
                26
        );
        clanki[4] = new Druga.Clanek(
                "Vpliv heraldike na razvoj tehnologije",
                new Druga.Oseba[]{osebe[14]}, 
                90
        );
        clanki[5] = new Druga.Clanek(
                "Vidiki kemije pri studiju cvetlicarstva",
                new Druga.Oseba[]{osebe[4]}, 
                87
        );
        clanki[6] = new Druga.Clanek(
                "Razvoj fizike skozi oci cvetlicarstva",
                new Druga.Oseba[]{osebe[8], osebe[15]}, 
                43
        );
        clanki[7] = new Druga.Clanek(
                "Vpliv kemije na razvoj naravoslovja",
                new Druga.Oseba[]{osebe[5], osebe[6], osebe[11]}, 
                19
        );
        clanki[8] = new Druga.Clanek(
                "Vidiki cvetlicarstva pri studiju zgodovinopisja",
                new Druga.Oseba[]{osebe[3], osebe[11], osebe[14], osebe[16], osebe[18]}, 
                92
        );
        clanki[9] = new Druga.Clanek(
                "Razvoj racunalnistva skozi oci ideologije",
                new Druga.Oseba[]{osebe[1], osebe[4], osebe[5], osebe[9], osebe[14]}, 
                82
        );
        clanki[10] = new Druga.Clanek(
                "Vpliv racunalnistva na razvoj optometrije",
                new Druga.Oseba[]{osebe[0], osebe[12], osebe[14], osebe[17]}, 
                58
        );
        clanki[11] = new Druga.Clanek(
                "Razvoj optometrije skozi oci urbanizma",
                new Druga.Oseba[]{osebe[5], osebe[11]}, 
                5
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[3], clanki[10]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[9]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[8]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2], clanki[5], clanki[9]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[7], clanki[9], clanki[11]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[7]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{clanki[2]});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[6]});
        osebe[9].nastaviClanke(new Druga.Clanek[]{clanki[9]});
        osebe[10].nastaviClanke(new Druga.Clanek[]{clanki[3]});
        osebe[11].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[7], clanki[8], clanki[11]});
        osebe[12].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[10]});
        osebe[13].nastaviClanke(new Druga.Clanek[]{});
        osebe[14].nastaviClanke(new Druga.Clanek[]{clanki[4], clanki[8], clanki[9], clanki[10]});
        osebe[15].nastaviClanke(new Druga.Clanek[]{clanki[6]});
        osebe[16].nastaviClanke(new Druga.Clanek[]{clanki[8]});
        osebe[17].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[10]});
        osebe[18].nastaviClanke(new Druga.Clanek[]{clanki[3], clanki[8]});

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
