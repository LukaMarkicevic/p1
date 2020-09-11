
public class Test02 {

    public static void main(String[] args) {

        Tretja tretja1 = new Tretja(new Tretja.Polje[6][6]);
        izpisi(tretja1.zgornjiLeviKot(420, 420));
        izpisi(tretja1.zgornjiLeviKot(600, 420));
        izpisi(tretja1.zgornjiLeviKot(240, 630));
        System.out.println("----------");

        Tretja tretja2 = new Tretja(new Tretja.Polje[3][5]);
        izpisi(tretja2.zgornjiLeviKot(420, 420));
        izpisi(tretja2.zgornjiLeviKot(600, 420));
        izpisi(tretja2.zgornjiLeviKot(240, 630));
        System.out.println("----------");

        Tretja tretja3 = new Tretja(new Tretja.Polje[7][4]);
        izpisi(tretja3.zgornjiLeviKot(420, 420));
        izpisi(tretja3.zgornjiLeviKot(600, 420));
        izpisi(tretja3.zgornjiLeviKot(240, 630));
    }

    private static void izpisi(double[] xy) {
        System.out.printf("[%d, %d]%n", Platno.ri(xy[0]), Platno.ri(xy[1]));
    }
}
