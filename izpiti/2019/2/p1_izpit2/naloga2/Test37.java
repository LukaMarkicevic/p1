
import java.util.Arrays;

public class Test37 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[19];
        osebe[0] = new Druga.Oseba("Sonja Andrejc");
        osebe[1] = new Druga.Oseba("Hilda Golob");
        osebe[2] = new Druga.Oseba("Urban Golob");
        osebe[3] = new Druga.Oseba("Tine Holc");
        osebe[4] = new Druga.Oseba("Vinko Holc");
        osebe[5] = new Druga.Oseba("Zoran Holc");
        osebe[6] = new Druga.Oseba("Ula Ivnik");
        osebe[7] = new Druga.Oseba("Urban Ivnik");
        osebe[8] = new Druga.Oseba("Francka Jenko");
        osebe[9] = new Druga.Oseba("Oton Jenko");
        osebe[10] = new Druga.Oseba("Nina Lobnik");
        osebe[11] = new Druga.Oseba("Ivan Nardin");
        osebe[12] = new Druga.Oseba("Otilija Peternel");
        osebe[13] = new Druga.Oseba("Sonja Peternel");
        osebe[14] = new Druga.Oseba("Hinko Rejc");
        osebe[15] = new Druga.Oseba("Urban Tavzes");
        osebe[16] = new Druga.Oseba("Katja Urh");
        osebe[17] = new Druga.Oseba("Tine Urh");
        osebe[18] = new Druga.Oseba("Iva Vehar");

        Druga.Clanek[] clanki = new Druga.Clanek[10];
        clanki[0] = new Druga.Clanek(
                "Vidiki veterine pri studiju zgodovinopisja",
                new Druga.Oseba[]{osebe[10], osebe[11], osebe[15]}, 
                86
        );
        clanki[1] = new Druga.Clanek(
                "Vpliv demografije na razvoj heraldike",
                new Druga.Oseba[]{osebe[2], osebe[5], osebe[9], osebe[13]}, 
                54
        );
        clanki[2] = new Druga.Clanek(
                "Vpliv kemije na razvoj demografije",
                new Druga.Oseba[]{osebe[3], osebe[6], osebe[10], osebe[14], osebe[17]}, 
                65
        );
        clanki[3] = new Druga.Clanek(
                "Brez leposlovja ni kemije",
                new Druga.Oseba[]{osebe[1], osebe[8], osebe[11]}, 
                9
        );
        clanki[4] = new Druga.Clanek(
                "Preucevanje psihologije z instrumenti arheologije",
                new Druga.Oseba[]{osebe[5], osebe[12], osebe[15], osebe[16]}, 
                7
        );
        clanki[5] = new Druga.Clanek(
                "Preucevanje naravoslovja z instrumenti kemije",
                new Druga.Oseba[]{osebe[5]}, 
                90
        );
        clanki[6] = new Druga.Clanek(
                "Preucevanje psihologije z instrumenti fizike",
                new Druga.Oseba[]{osebe[4], osebe[6], osebe[10], osebe[12]}, 
                62
        );
        clanki[7] = new Druga.Clanek(
                "Brez cvetlicarstva ni kemije",
                new Druga.Oseba[]{osebe[8]}, 
                61
        );
        clanki[8] = new Druga.Clanek(
                "Razvoj sociologije skozi oci ekologije",
                new Druga.Oseba[]{osebe[0], osebe[6], osebe[10], osebe[17]}, 
                91
        );
        clanki[9] = new Druga.Clanek(
                "Vidiki geologije pri studiju jezikoslovja",
                new Druga.Oseba[]{osebe[0], osebe[1], osebe[14]}, 
                85
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[8], clanki[9]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[3], clanki[9]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[2]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[6]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[4], clanki[5]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[6], clanki[8]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[3], clanki[7]});
        osebe[9].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[10].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[2], clanki[6], clanki[8]});
        osebe[11].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[3]});
        osebe[12].nastaviClanke(new Druga.Clanek[]{clanki[4], clanki[6]});
        osebe[13].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[14].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[9]});
        osebe[15].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[4]});
        osebe[16].nastaviClanke(new Druga.Clanek[]{clanki[4]});
        osebe[17].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[8]});
        osebe[18].nastaviClanke(new Druga.Clanek[]{});

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
