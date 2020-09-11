
public class Test07 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(4, new Tretja.Ladja[0], new Tretja.Strel[0]);
        double[] xy = tretja.zgornjiLeviKot(712, 696);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
