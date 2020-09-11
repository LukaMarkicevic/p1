
public class Test02 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(7, new Tretja.Ladja[0], new Tretja.Strel[0]);

        double[] xy = tretja.zgornjiLeviKot(720, 720);
        System.out.printf("x = %d, y = %d%n", Platno.ri(xy[0]), Platno.ri(xy[1]));

        xy = tretja.zgornjiLeviKot(300, 400);
        System.out.printf("x = %d, y = %d%n", Platno.ri(xy[0]), Platno.ri(xy[1]));

        xy = tretja.zgornjiLeviKot(1500, 600);
        System.out.printf("x = %d, y = %d%n", Platno.ri(xy[0]), Platno.ri(xy[1]));
    }
}
