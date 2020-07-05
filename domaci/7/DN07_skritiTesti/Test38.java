
public class Test38 {

    public static void main(String[] args) {
        Lestvica lestvica = new Lestvica(new Nota(15, 3), 23);
        for (int oktava = 11;  oktava <= 20;  oktava++) {
            for (int indeks = 0;  indeks <= 11;  indeks++) {
                System.out.println(lestvica.vsebujeNoto(new Nota(oktava, indeks)));
            }
        }
    }
}
