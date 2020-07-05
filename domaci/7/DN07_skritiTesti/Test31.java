
public class Test31 {

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
            izpisiNoto(note[i].naRazdalji(0));
            izpisiNoto(note[i].naRazdalji(1));
            izpisiNoto(note[i].naRazdalji(-1));
            izpisiNoto(note[i].naRazdalji(17));
            izpisiNoto(note[i].naRazdalji(-17));
            izpisiNoto(note[i].naRazdalji(36));
            izpisiNoto(note[i].naRazdalji(-36));
        }
    }

    private static void izpisiNoto(Nota nota) {
        if (nota == null) {
            System.out.println("null");
        } else {
            System.out.printf("%d:%d%n", nota.vrniOktavo(), nota.vrniIndeks());
        }
    }
}
