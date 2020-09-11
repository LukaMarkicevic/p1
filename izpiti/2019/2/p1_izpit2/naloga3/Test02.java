
public class Test02 {

    public static void main(String[] args) {
        Tretja tretja = new Tretja(new Tretja.Okno[0]);
        izpisi(tretja, 400, 400);
        izpisi(tretja, 750, 450);
        izpisi(tretja, 600, 840);
    }

    private static void izpisi(Tretja tretja, double wp, double hp) {
        double[] xy = tretja.zgornjiLeviKot(wp, hp);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
        System.out.println("----------");
    }
}
