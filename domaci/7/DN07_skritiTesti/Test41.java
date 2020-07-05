
public class Test41 {

    public static void main(String[] args) {
        for (int razmak = 1;  razmak <= 25;  razmak++) {
            System.out.println(new Lestvica(new Nota(13, 7), razmak).perioda());
        }
    }
}
