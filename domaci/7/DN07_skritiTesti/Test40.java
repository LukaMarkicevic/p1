
public class Test40 {

    public static void main(String[] args) {
        Nota nota = new Nota(13, 3);
        for (int oktava = 11;  oktava <= 15;  oktava++) {
            for (int indeks = 0;  indeks <= 11;  indeks++) {
                for (int razmak = 1;  razmak <= 25;  razmak += 4) {
                    System.out.println(new Lestvica(new Nota(oktava, indeks), razmak).vsebujeNoto(nota));
                }
            }
        }
    }
}
