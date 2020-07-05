
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Avtor andrej = new Avtor("Andrej", "Gorjup");
        Avtor borut = new Avtor("Borut", "Fink");
        Avtor cvetka = new Avtor("Cvetka", "Ertl");
        Avtor denis = new Avtor("Denis", "Devetak");
        Avtor ema = new Avtor("Ema", "Cevc");
        Avtor franc = new Avtor("Franc", "Bizjak");
        Avtor gabrijela = new Avtor("Gabrijela", "Arko");

        List<Clanek> clanki = new ArrayList<>();
        clanki.add(new Clanek(Arrays.asList(andrej, cvetka), "Prvi clanek", 2016));
        clanki.add(new Clanek(Arrays.asList(franc, andrej, borut), "Drugi clanek", 2015));
        clanki.add(new Clanek(Arrays.asList(gabrijela, borut), "Tretji clanek", 2016));
        clanki.add(new Clanek(Arrays.asList(borut, ema), "Cetrti clanek", 2015));
        clanki.add(new Clanek(Arrays.asList(ema, cvetka, franc), "Peti clanek", 2015));
        clanki.add(new Clanek(Arrays.asList(ema), "Sesti clanek", 2016));

        Map<Avtor, List<Clanek>> avtor2clanki = Glavni.clankiPoAvtorjih(clanki);
        List<String> vrstice = new ArrayList<>();
        for (Avtor avtor: avtor2clanki.keySet()) {
            vrstice.add(String.format("%s -> %s", avtor, avtor2clanki.get(avtor)));
        }
        vrstice.sort(null);
        for (String vrstica: vrstice) {
            System.out.println(vrstica);
        }
    }
}
