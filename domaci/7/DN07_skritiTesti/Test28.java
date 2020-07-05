
public class Test28 {

    public static void main(String[] args) {
        Nota[] note = {
            new Nota(2, 8),
            new Nota(20, 5),
            new Nota(32, 6),
            new Nota(40, 0),
        };
        for (int i = 0;  i < note.length;  i++) {
            for (int j = i + 1;  j < note.length;  j++) {
                izpisiLestvico(Lestvica.izPrvihDveh(note[i], note[j]));
            }
        }
    }

    private static void izpisiLestvico(Lestvica lst) {
        Nota nota = lst.vrniZacetnoNoto();
        System.out.printf("%d %d %d%n", nota.vrniOktavo(), nota.vrniIndeks(), lst.vrniRazmak());
    }
}
