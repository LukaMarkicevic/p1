
public class Test37 {

    public static void main(String[] args) {
        Lestvica lestvica = new Lestvica(new Nota(2, 6), 13);
        for (int oktava = 11;  oktava <= 15;  oktava++) {
            for (int indeks = 0;  indeks <= 11;  indeks++) {
                System.out.println(lestvica.vsebujeNoto(new Nota(oktava, indeks)));
            }
        }
    }
}
