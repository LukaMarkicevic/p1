
import java.util.Arrays;

public class Test31 {

    public static void main(String[] args) {
        Druga.Oseba[] osebe = new Druga.Oseba[18];
        osebe[0] = new Druga.Oseba("Franci Andrejc");
        osebe[1] = new Druga.Oseba("Janez Andrejc");
        osebe[2] = new Druga.Oseba("Bojan Bevc");
        osebe[3] = new Druga.Oseba("Ivan Golob");
        osebe[4] = new Druga.Oseba("Petra Golob");
        osebe[5] = new Druga.Oseba("Ula Holc");
        osebe[6] = new Druga.Oseba("Ana Ivnik");
        osebe[7] = new Druga.Oseba("Dejan Ivnik");
        osebe[8] = new Druga.Oseba("Nina Ivnik");
        osebe[9] = new Druga.Oseba("Ula Ivnik");
        osebe[10] = new Druga.Oseba("Tatjana Lobnik");
        osebe[11] = new Druga.Oseba("Zoran Lobnik");
        osebe[12] = new Druga.Oseba("Ivan Nardin");
        osebe[13] = new Druga.Oseba("Oton Rejc");
        osebe[14] = new Druga.Oseba("Jana Tavzes");
        osebe[15] = new Druga.Oseba("Mirko Tavzes");
        osebe[16] = new Druga.Oseba("Hinko Vehar");
        osebe[17] = new Druga.Oseba("Jana Vehar");

        Druga.Clanek[] clanki = new Druga.Clanek[3];
        clanki[0] = new Druga.Clanek(
                "Brez optometrije ni leposlovja",
                new Druga.Oseba[]{osebe[2], osebe[9]}, 
                38
        );
        clanki[1] = new Druga.Clanek(
                "Vidiki optometrije pri studiju psihologije",
                new Druga.Oseba[]{osebe[12]}, 
                7
        );
        clanki[2] = new Druga.Clanek(
                "Brez jezikoslovja ni matematike",
                new Druga.Oseba[]{osebe[8], osebe[12], osebe[13]}, 
                34
        );

        osebe[0].nastaviClanke(new Druga.Clanek[]{});
        osebe[1].nastaviClanke(new Druga.Clanek[]{});
        osebe[2].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[3].nastaviClanke(new Druga.Clanek[]{});
        osebe[4].nastaviClanke(new Druga.Clanek[]{});
        osebe[5].nastaviClanke(new Druga.Clanek[]{});
        osebe[6].nastaviClanke(new Druga.Clanek[]{});
        osebe[7].nastaviClanke(new Druga.Clanek[]{});
        osebe[8].nastaviClanke(new Druga.Clanek[]{clanki[2]});
        osebe[9].nastaviClanke(new Druga.Clanek[]{clanki[0]});
        osebe[10].nastaviClanke(new Druga.Clanek[]{});
        osebe[11].nastaviClanke(new Druga.Clanek[]{});
        osebe[12].nastaviClanke(new Druga.Clanek[]{clanki[1], clanki[2]});
        osebe[13].nastaviClanke(new Druga.Clanek[]{clanki[2]});
        osebe[14].nastaviClanke(new Druga.Clanek[]{});
        osebe[15].nastaviClanke(new Druga.Clanek[]{});
        osebe[16].nastaviClanke(new Druga.Clanek[]{});
        osebe[17].nastaviClanke(new Druga.Clanek[]{});

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
