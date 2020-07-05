
public class Test47 {

    public static void main(String[] args) {
        for (int oktava = 4;  oktava <= 10;  oktava += 2) {
            for (int indeks = 1;  indeks <= 11;  indeks += 3) {
                Nota nota = new Nota(oktava, indeks);
                for (int razmak = 2;  razmak <= 26;  razmak += 4) {
                    Lestvica lst1 = new Lestvica(nota, razmak);
                    Lestvica lst2 = new Lestvica(nota, razmak);
                    izpisiLestvico(lst1.presek(lst2));
                    izpisiLestvico(lst2.presek(lst1));
                }
            }
        }
    }

    private static void izpisiLestvico(Lestvica lst) {
        if (lst == null) {
            System.out.println("null");
        } else {
            Nota nota = lst.vrniZacetnoNoto();
            System.out.printf("%d %d %d%n", nota.vrniOktavo(), nota.vrniIndeks(), lst.vrniRazmak());
        }
    }
}
