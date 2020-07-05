
public class Test43 {

    public static void main(String[] args) {
        for (int razmak = 100;  razmak <= 125;  razmak++) {
            System.out.println(new Lestvica(new Nota(5, 8), razmak).perioda());
        }
    }
}
