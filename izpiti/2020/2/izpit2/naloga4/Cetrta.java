
/*
 * Testiranje:
 *
 * tj.exe Cetrta.java . .
 */

import java.util.*;

public class Cetrta {

    private static void glasuj(Map<String, Integer> skrinjica, String stranka) {
        if (skrinjica.containsKey(stranka)) {
            int stGlasov = skrinjica.get(stranka);
            skrinjica.put(stranka, stGlasov + 1);
        } else {
            skrinjica.put(stranka, 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> primaraniGlasovi = new HashMap<>();
        Map<String, Integer> sekundarniGlasovi = new HashMap<>();

        TreeSet<String> stranke = new TreeSet<>((p, q) -> {
            int stpp = primaraniGlasovi.get(p) == null ? 0 : primaraniGlasovi.get(p);
            int stpq = primaraniGlasovi.get(q) == null ? 0 : primaraniGlasovi.get(q);
            int stsp = sekundarniGlasovi.get(p) == null ? 0 : sekundarniGlasovi.get(p);
            int stsq = sekundarniGlasovi.get(p) == null ? 0 : sekundarniGlasovi.get(p);

            if (stpp != stpq)
                return (stpq - stpp);
            if (stsp != stsq)
                return (stsq - stpp);
            return p.compareTo(q);
        });

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String primarnaStranka = sc.next();
            String sekundarnaStranka = sc.next();
            glasuj(primaraniGlasovi, primarnaStranka);
            glasuj(sekundarniGlasovi, sekundarnaStranka);
        }

        stranke.addAll(primaraniGlasovi.keySet());
        stranke.addAll(sekundarniGlasovi.keySet());
        System.out.println(stranke.toString());

        sc.close();
    }

    public static class Stranka {
        String ime;

        public Stranka(String ime) {
            this.ime = ime;
        }

        public String getIme() {
            return this.ime;
        }
    }
}
