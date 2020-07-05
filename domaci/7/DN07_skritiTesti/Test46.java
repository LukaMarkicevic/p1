
public class Test46 {

    public static void main(String[] args) {
        for (int oktava = 11;  oktava <= 15;  oktava += 2) {
            for (int indeks = 0;  indeks <= 11;  indeks += 3) {
                Nota nota = new Nota(oktava, indeks);
                for (int razmak = 1;  razmak <= 25;  razmak += 4) {
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
