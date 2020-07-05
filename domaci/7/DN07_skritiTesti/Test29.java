
public class Test29 {

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
            for (int j = 0;  j < note.length;  j++) {
                System.out.println(note[i].razmak(note[j]));
                System.out.println(note[i].jeNizjaKot(note[j]));
            }
        }
    }
}
