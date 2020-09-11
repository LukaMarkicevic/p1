
import java.util.Arrays;

public class Test34 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[18];
        osebe[0] = new Druga.Oseba("Hilda Bevc");
        osebe[1] = new Druga.Oseba("Katja Bevc");
        osebe[2] = new Druga.Oseba("Francka Debeljak");
        osebe[3] = new Druga.Oseba("Peter Debeljak");
        osebe[4] = new Druga.Oseba("Petra Debeljak");
        osebe[5] = new Druga.Oseba("Cvetko Ferjan");
        osebe[6] = new Druga.Oseba("Mirko Ferjan");
        osebe[7] = new Druga.Oseba("Nikolaj Jenko");
        osebe[8] = new Druga.Oseba("Eva Kobal");
        osebe[9] = new Druga.Oseba("Leopold Kobal");
        osebe[10] = new Druga.Oseba("Franci Mihevc");
        osebe[11] = new Druga.Oseba("Ana Oblak");
        osebe[12] = new Druga.Oseba("Marjana Peternel");
        osebe[13] = new Druga.Oseba("Romana Rejc");
        osebe[14] = new Druga.Oseba("Ula Satler");
        osebe[15] = new Druga.Oseba("Dejan Zajc");
        osebe[16] = new Druga.Oseba("Janez Zajc");
        osebe[17] = new Druga.Oseba("Sandi Zajc");

        Druga.Clanek[] clanki = new Druga.Clanek[13];
        clanki[0] = new Druga.Clanek(
                "Vidiki psihologije pri studiju leposlovja",
                new Druga.Oseba[]{osebe[1], osebe[3], osebe[4], osebe[9], osebe[12]}, 
                11
        );
        clanki[1] = new Druga.Clanek(
                "Brez zgodovinopisja ni arheologije",
                new Druga.Oseba[]{osebe[5], osebe[8], osebe[16]}, 
                8
        );
        clanki[2] = new Druga.Clanek(
                "Vidiki ideologije pri studiju matematike",
                new Druga.Oseba[]{osebe[9]}, 
                60
        );
        clanki[3] = new Druga.Clanek(
                "Razvoj racunalnistva skozi oci cvetlicarstva",
                new Druga.Oseba[]{osebe[1]}, 
                41
        );
        clanki[4] = new Druga.Clanek(
                "Vidiki veterine pri studiju leposlovja",
                new Druga.Oseba[]{osebe[7]}, 
                75
        );
        clanki[5] = new Druga.Clanek(
                "Brez urbanizma ni optometrije",
                new Druga.Oseba[]{osebe[0]}, 
                18
        );
        clanki[6] = new Druga.Clanek(
                "Razvoj zgodovinopisja skozi oci heraldike",
                new Druga.Oseba[]{osebe[1], osebe[7], osebe[9], osebe[11]}, 
                42
        );
        clanki[7] = new Druga.Clanek(
                "Vidiki cvetlicarstva pri studiju biologije",
                new Druga.Oseba[]{osebe[3], osebe[15]}, 
                25
        );
        clanki[8] = new Druga.Clanek(
                "Razvoj jezikoslovja skozi oci urbanizma",
                new Druga.Oseba[]{osebe[1], osebe[17]}, 
                89
        );
        clanki[9] = new Druga.Clanek(
                "Razvoj tehnologije skozi oci kemije",
                new Druga.Oseba[]{osebe[2], osebe[3], osebe[7], osebe[13], osebe[15]}, 
                25
        );
        clanki[10] = new Druga.Clanek(
                "Vpliv geologije na razvoj urbanizma",
                new Druga.Oseba[]{osebe[3], osebe[5], osebe[17]}, 
                49
        );
        clanki[11] = new Druga.Clanek(
                "Brez fizike ni ideologije",
                new Druga.Oseba[]{osebe[3], osebe[6], osebe[11], osebe[15]}, 
                48
        );
        clanki[12] = new Druga.Clanek(
                "Preucevanje fizike z instrumenti urbanizma",
                new Druga.Oseba[]{osebe[10], osebe[14]}, 
                86
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[5]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[3], clanki[6], clanki[8]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[9]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[7], clanki[9], clanki[10], clanki[11]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[10]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[11]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{clanki[4], clanki[6], clanki[9]});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[9].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[2], clanki[6]});
        osebe[10].nastaviClanke(new Druga.Clanek[]{clanki[12]});
        osebe[11].nastaviClanke(new Druga.Clanek[]{clanki[6], clanki[11]});
        osebe[12].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[13].nastaviClanke(new Druga.Clanek[]{clanki[9]});
        osebe[14].nastaviClanke(new Druga.Clanek[]{clanki[12]});
        osebe[15].nastaviClanke(new Druga.Clanek[]{clanki[7], clanki[9], clanki[11]});
        osebe[16].nastaviClanke(new Druga.Clanek[]{clanki[1]});
        osebe[17].nastaviClanke(new Druga.Clanek[]{clanki[8], clanki[10]});

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
