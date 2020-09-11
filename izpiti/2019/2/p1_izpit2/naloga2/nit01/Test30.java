
import java.util.Arrays;

public class Test30 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[25];
        osebe[0] = new Druga.Oseba("Ula Cevc");
        osebe[1] = new Druga.Oseba("Dejan Debeljak");
        osebe[2] = new Druga.Oseba("Franci Debeljak");
        osebe[3] = new Druga.Oseba("Urban Debeljak");
        osebe[4] = new Druga.Oseba("Katja Erjavec");
        osebe[5] = new Druga.Oseba("Oton Erjavec");
        osebe[6] = new Druga.Oseba("Anton Ferjan");
        osebe[7] = new Druga.Oseba("Roman Holc");
        osebe[8] = new Druga.Oseba("Tine Holc");
        osebe[9] = new Druga.Oseba("Jana Ivnik");
        osebe[10] = new Druga.Oseba("Oton Lobnik");
        osebe[11] = new Druga.Oseba("Francka Mihevc");
        osebe[12] = new Druga.Oseba("Vida Mihevc");
        osebe[13] = new Druga.Oseba("Tine Nardin");
        osebe[14] = new Druga.Oseba("Leopold Oblak");
        osebe[15] = new Druga.Oseba("Zoran Oblak");
        osebe[16] = new Druga.Oseba("Ivan Rejc");
        osebe[17] = new Druga.Oseba("Jana Rejc");
        osebe[18] = new Druga.Oseba("Otilija Rejc");
        osebe[19] = new Druga.Oseba("Gorazd Tavzes");
        osebe[20] = new Druga.Oseba("Hilda Urh");
        osebe[21] = new Druga.Oseba("Nina Vehar");
        osebe[22] = new Druga.Oseba("Oton Vehar");
        osebe[23] = new Druga.Oseba("Cvetko Zajc");
        osebe[24] = new Druga.Oseba("Janez Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[21];
        clanki[0] = new Druga.Clanek(
                "Preucevanje ekologije z instrumenti arheologije",
                new Druga.Oseba[]{osebe[9], osebe[14], osebe[16], osebe[22]}, 
                23
        );
        clanki[1] = new Druga.Clanek(
                "Vidiki leposlovja pri studiju naravoslovja",
                new Druga.Oseba[]{osebe[1], osebe[3], osebe[12]}, 
                83
        );
        clanki[2] = new Druga.Clanek(
                "Brez biologije ni sociologije",
                new Druga.Oseba[]{osebe[1], osebe[11], osebe[13], osebe[19], osebe[21]}, 
                47
        );
        clanki[3] = new Druga.Clanek(
                "Razvoj urbanizma skozi oci optometrije",
                new Druga.Oseba[]{osebe[6], osebe[16]}, 
                64
        );
        clanki[4] = new Druga.Clanek(
                "Brez psihologije ni ekologije",
                new Druga.Oseba[]{osebe[7], osebe[10], osebe[18]}, 
                77
        );
        clanki[5] = new Druga.Clanek(
                "Vidiki biologije pri studiju matematike",
                new Druga.Oseba[]{osebe[17]}, 
                61
        );
        clanki[6] = new Druga.Clanek(
                "Vpliv veterine na razvoj tehnologije",
                new Druga.Oseba[]{osebe[0], osebe[6]}, 
                15
        );
        clanki[7] = new Druga.Clanek(
                "Brez matematike ni jezikoslovja",
                new Druga.Oseba[]{osebe[5], osebe[14]}, 
                63
        );
        clanki[8] = new Druga.Clanek(
                "Razvoj racunalnistva skozi oci heraldike",
                new Druga.Oseba[]{osebe[0], osebe[9], osebe[11], osebe[13]}, 
                12
        );
        clanki[9] = new Druga.Clanek(
                "Vpliv urbanizma na razvoj leposlovja",
                new Druga.Oseba[]{osebe[7], osebe[11]}, 
                26
        );
        clanki[10] = new Druga.Clanek(
                "Preucevanje veterine z instrumenti biologije",
                new Druga.Oseba[]{osebe[24]}, 
                47
        );
        clanki[11] = new Druga.Clanek(
                "Vidiki leposlovja pri studiju veterine",
                new Druga.Oseba[]{osebe[10]}, 
                97
        );
        clanki[12] = new Druga.Clanek(
                "Razvoj racunalnistva skozi oci heraldike",
                new Druga.Oseba[]{osebe[11]}, 
                44
        );
        clanki[13] = new Druga.Clanek(
                "Razvoj heraldike skozi oci kemije",
                new Druga.Oseba[]{osebe[14], osebe[19], osebe[20], osebe[23], osebe[24]}, 
                81
        );
        clanki[14] = new Druga.Clanek(
                "Razvoj veterine skozi oci cvetlicarstva",
                new Druga.Oseba[]{osebe[6], osebe[13], osebe[15], osebe[21]}, 
                16
        );
        clanki[15] = new Druga.Clanek(
                "Vidiki sociologije pri studiju ideologije",
                new Druga.Oseba[]{osebe[2], osebe[12], osebe[16], osebe[24]}, 
                99
        );
        clanki[16] = new Druga.Clanek(
                "Vpliv naravoslovja na razvoj fizike",
                new Druga.Oseba[]{osebe[24]}, 
                80
        );
        clanki[17] = new Druga.Clanek(
                "Razvoj matematike skozi oci fizike",
                new Druga.Oseba[]{osebe[5], osebe[15], osebe[18], osebe[24]}, 
                11
        );
        clanki[18] = new Druga.Clanek(
                "Razvoj racunalnistva skozi oci sociologije",
                new Druga.Oseba[]{osebe[4], osebe[12], osebe[15], osebe[17], osebe[22]}, 
                67
        );
        clanki[19] = new Druga.Clanek(
                "Vidiki jezikoslovja pri studiju psihologije",
                new Druga.Oseba[]{osebe[8], osebe[15], osebe[19]}, 
                60
        );
        clanki[20] = new Druga.Clanek(
                "Preucevanje veterine z instrumenti leposlovja",
                new Druga.Oseba[]{osebe[8]}, 
                72
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[6], clanki[8]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[15]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[18]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[7], clanki[17]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[3], clanki[6], clanki[14]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{clanki[4], clanki[9]});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[19], clanki[20]});
        osebe[9].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[8]});
        osebe[10].nastaviClanke(new Druga.Clanek[]{clanki[4], clanki[11]});
        osebe[11].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[8], clanki[9], clanki[12]});
        osebe[12].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[15], clanki[18]});
        osebe[13].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[8], clanki[14]});
        osebe[14].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[7], clanki[13]});
        osebe[15].nastaviClanke(new Druga.Clanek[]{clanki[14], clanki[17], clanki[18], clanki[19]});
        osebe[16].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[3], clanki[15]});
        osebe[17].nastaviClanke(new Druga.Clanek[]{clanki[5], clanki[18]});
        osebe[18].nastaviClanke(new Druga.Clanek[]{clanki[4], clanki[17]});
        osebe[19].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[13], clanki[19]});
        osebe[20].nastaviClanke(new Druga.Clanek[]{clanki[13]});
        osebe[21].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[14]});
        osebe[22].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[18]});
        osebe[23].nastaviClanke(new Druga.Clanek[]{clanki[13]});
        osebe[24].nastaviClanke(new Druga.Clanek[]{clanki[10], clanki[13], clanki[15], clanki[16], clanki[17]});

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
