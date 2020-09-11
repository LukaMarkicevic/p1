
import java.util.Arrays;

public class Test26 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[19];
        osebe[0] = new Druga.Oseba("Dejan Bevc");
        osebe[1] = new Druga.Oseba("Eva Erjavec");
        osebe[2] = new Druga.Oseba("Cvetko Ferjan");
        osebe[3] = new Druga.Oseba("Hinko Ferjan");
        osebe[4] = new Druga.Oseba("Peter Ferjan");
        osebe[5] = new Druga.Oseba("Ana Ivnik");
        osebe[6] = new Druga.Oseba("Franci Ivnik");
        osebe[7] = new Druga.Oseba("Gabrijela Mihevc");
        osebe[8] = new Druga.Oseba("Sandi Mihevc");
        osebe[9] = new Druga.Oseba("Eva Nardin");
        osebe[10] = new Druga.Oseba("Marjana Oblak");
        osebe[11] = new Druga.Oseba("Sonja Oblak");
        osebe[12] = new Druga.Oseba("Marjana Peternel");
        osebe[13] = new Druga.Oseba("Nina Peternel");
        osebe[14] = new Druga.Oseba("Peter Peternel");
        osebe[15] = new Druga.Oseba("Eva Rejc");
        osebe[16] = new Druga.Oseba("Eva Urh");
        osebe[17] = new Druga.Oseba("Francka Urh");
        osebe[18] = new Druga.Oseba("Zinka Vehar");

        Druga.Clanek[] clanki = new Druga.Clanek[12];
        clanki[0] = new Druga.Clanek(
                "Preucevanje tehnologije z instrumenti kemije",
                new Druga.Oseba[]{osebe[3], osebe[4], osebe[6]}, 
                100
        );
        clanki[1] = new Druga.Clanek(
                "Vpliv fizike na razvoj ekologije",
                new Druga.Oseba[]{osebe[1], osebe[2], osebe[6]}, 
                49
        );
        clanki[2] = new Druga.Clanek(
                "Preucevanje leposlovja z instrumenti geologije",
                new Druga.Oseba[]{osebe[2], osebe[3], osebe[4], osebe[7], osebe[16]}, 
                71
        );
        clanki[3] = new Druga.Clanek(
                "Vpliv zgodovinopisja na razvoj ideologije",
                new Druga.Oseba[]{osebe[0], osebe[4], osebe[14]}, 
                8
        );
        clanki[4] = new Druga.Clanek(
                "Preucevanje fizike z instrumenti jezikoslovja",
                new Druga.Oseba[]{osebe[12]}, 
                34
        );
        clanki[5] = new Druga.Clanek(
                "Preucevanje cvetlicarstva z instrumenti leposlovja",
                new Druga.Oseba[]{osebe[1], osebe[5], osebe[8], osebe[11], osebe[17]}, 
                17
        );
        clanki[6] = new Druga.Clanek(
                "Razvoj demografije skozi oci ekologije",
                new Druga.Oseba[]{osebe[11], osebe[12], osebe[14], osebe[18]}, 
                97
        );
        clanki[7] = new Druga.Clanek(
                "Vidiki jezikoslovja pri studiju heraldike",
                new Druga.Oseba[]{osebe[0], osebe[5], osebe[7]}, 
                55
        );
        clanki[8] = new Druga.Clanek(
                "Preucevanje jezikoslovja z instrumenti ekologije",
                new Druga.Oseba[]{osebe[1], osebe[4], osebe[12]}, 
                34
        );
        clanki[9] = new Druga.Clanek(
                "Vidiki ekologije pri studiju geologije",
                new Druga.Oseba[]{osebe[2], osebe[7], osebe[14], osebe[16], osebe[18]}, 
                23
        );
        clanki[10] = new Druga.Clanek(
                "Preucevanje ekologije z instrumenti geologije",
                new Druga.Oseba[]{osebe[0], osebe[2], osebe[5], osebe[8], osebe[17]}, 
                56
        );
        clanki[11] = new Druga.Clanek(
                "Razvoj naravoslovja skozi oci leposlovja",
                new Druga.Oseba[]{osebe[13], osebe[16]}, 
                70
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{clanki[3], clanki[7], clanki[10]});
        osebe[1].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[5], clanki[8]});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2], clanki[9], clanki[10]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[2]});
        osebe[4].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[2], clanki[3], clanki[8]});
        osebe[5].nastaviClanke(new Druga.Clanek[]{clanki[5], clanki[7], clanki[10]});
        osebe[6].nastaviClanke(new Druga.Clanek[]{clanki[0], clanki[1]});
        osebe[7].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[7], clanki[9]});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[5], clanki[10]});
        osebe[9].nastaviClanke(new Druga.Clanek[]{});
        osebe[10].nastaviClanke(new Druga.Clanek[]{});
        osebe[11].nastaviClanke(new Druga.Clanek[]{clanki[5], clanki[6]});
        osebe[12].nastaviClanke(new Druga.Clanek[]{clanki[4], clanki[6], clanki[8]});
        osebe[13].nastaviClanke(new Druga.Clanek[]{clanki[11]});
        osebe[14].nastaviClanke(new Druga.Clanek[]{clanki[3], clanki[6], clanki[9]});
        osebe[15].nastaviClanke(new Druga.Clanek[]{});
        osebe[16].nastaviClanke(new Druga.Clanek[]{clanki[2], clanki[9], clanki[11]});
        osebe[17].nastaviClanke(new Druga.Clanek[]{clanki[5], clanki[10]});
        osebe[18].nastaviClanke(new Druga.Clanek[]{clanki[6], clanki[9]});

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
