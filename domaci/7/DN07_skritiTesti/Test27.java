
public class Test27 {

    public static void main(String[] args) {
        Nota[] note = {
            new Nota(2, 8),
            new Nota(20, 5),
            new Nota(32, 6),
            new Nota(40, 0),
        };
        for (int i = 0;  i < note.length;  i++) {
            for (int j = 0;  j < note.length;  j++) {
                System.out.println(note[i].jeNizjaKot(note[j]));
            }
        }
    }
}
