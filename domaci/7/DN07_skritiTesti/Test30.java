
public class Test30 {

    public static void main(String[] args) {
        Nota[] note = {
            new Nota(5, 2),
            new Nota(5, 3),
            new Nota(5, 11),
            new Nota(6, 4),
            new Nota(15, 0),
            new Nota(23, 10),
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
