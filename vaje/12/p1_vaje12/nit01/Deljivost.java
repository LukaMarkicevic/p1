
import java.util.*;
import java.util.function.*;

public class Deljivost {

    public static void main(String[] args) {
        // po potrebi dopolnite ...
    }

    public static <T> List<T> filtriraj(Collection<T> zbirka, Predicate<T> pogoj) {
        List<T> vrni = new LinkedList<T>();

        for (T element : zbirka) {
            if (pogoj.test(element)) {
                vrni.add(element);
            }
        }
        return vrni;
    }

    public static <T, R> List<R> pretvori(Collection<T> zbirka, Function<T, R> pretvornik) {
        List<R> vrni = new LinkedList<R>();

        for (T element : zbirka) {
            vrni.add(pretvornik.apply(element));
        }
        return vrni;
    }

    public static List<Integer> zaporedje(int a, int b) {
        List<Integer> lista = new ArrayList<Integer>();

        for (int i = a; i <= b; i++) {
            lista.add(i);
        }
        return lista;
    }

    public static List<Integer> delitelji(int n) {
        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                lista.add(i);
            }
        }

        return lista;
    }

    public static NavigableSet<Integer> skupniDelitelji(int a, int b) {

        NavigableSet<Integer> deliteljiA = new TreeSet<>(delitelji(a));

        NavigableSet<Integer> deliteljiB = new TreeSet<>(delitelji(b));

        deliteljiA.retainAll(deliteljiB);

        return deliteljiA;
    }

    public static Map<Integer, List<Integer>> stevilo2delitelji(int a, int b) {
        Map<Integer, List<Integer>> slovar = new HashMap<>();
        for (int i = a; i <= b; i++) {
            slovar.put(i, delitelji(i));
        }
        return slovar;
    }

    public static List<Integer> prastevila(int a, int b) {
        return filtriraj(zaporedje(a, b), element -> delitelji(element).size() == 2);
    }

    public static List<Boolean> prastevilskost(int a, int b) {
        return pretvori(zaporedje(a, b), element -> delitelji(element).size() == 2);
    }

    public static List<List<Integer>> seznamiDeliteljev(int a, int b) {
        return pretvori(zaporedje(a, b), element -> delitelji(element));
    }

    public static NavigableSet<Integer> stevilaPoDeljivosti(int a, int b) {
        Map<Integer, List<Integer>> st2del = stevilo2delitelji(a, b);

        NavigableSet<Integer> mnozica = new TreeSet<>((p, q) -> {
            // int stDelP = delitelji(p).size();
            int stDelP = st2del.get(p).size();
            int stDelQ = st2del.get(q).size();
            if (stDelP != stDelQ) {
                return (stDelQ - stDelP);
            }
            return (p - q);
        });

        mnozica.addAll(zaporedje(a, b));
        // alternativa: mnozica.addAll(st2del.keySet());

        return mnozica;
    }
}
