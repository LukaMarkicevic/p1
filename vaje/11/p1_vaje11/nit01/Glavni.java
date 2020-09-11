
import java.util.*;

public class Glavni {

    public static void urediPoLetuInNaslovu(List<Clanek> clanki) {
        Collections.sort(clanki);
    }

    public static Set<Avtor> vsiAvtorji(Collection<Clanek> clanki) {
        Set<Avtor> sviAvtori = new HashSet<Avtor>();

        for (Clanek clanek : clanki) {
            sviAvtori.addAll(clanek.getAvtorji());
        }
        return sviAvtori;
    }

    public static Map<Avtor, List<Clanek>> clankiPoAvtorjih(Collection<Clanek> clanki) {
        Set<Avtor> vsiAvtorji = vsiAvtorji(clanki);
        Map<Avtor, List<Clanek>> vrni = new HashMap<Avtor, List<Clanek>>();
        for (Avtor avtor : vsiAvtorji) {
            List<Clanek> lista = new LinkedList<Clanek>();
            for (Clanek clanek : clanki) {
                List<Avtor> avtorji = clanek.getAvtorji();
                if (avtorji.contains(avtor)) {
                    lista.add(clanek);
                }
            }
            urediPoLetuInNaslovu(lista);
            vrni.put(avtor, lista);
        }

        return vrni;
    }

    public static Avtor najplodnejsiAvtor(Collection<Clanek> clanki) {
        Map<Avtor, List<Clanek>> vrni = clankiPoAvtorjih(clanki);
        int max = Integer.MIN_VALUE;
        Avtor vracam = new Avtor("Luka", "Markicevic");
        for (Avtor avtor : vrni.keySet()) {
            List<Clanek> clanek = vrni.get(avtor);
            if (clanek.size() >= max) {
                max = clanek.size();
                vracam = avtor;
            }
        }

        return vracam;
    }
}
