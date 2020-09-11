
public class Test09 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(5, new Tretja.Ladja[0], new Tretja.Strel[0]);
        double[] xy = tretja.zgornjiLeviKot(780, 640);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
