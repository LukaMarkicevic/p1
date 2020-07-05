
public class Test42 {

    public static void main(String[] args) {
        for (int razmak = 1;  razmak <= 25;  razmak++) {
            System.out.println(new Lestvica(new Nota(10, 6), razmak).perioda());
        }
    }
}
