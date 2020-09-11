
public class Test10 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(14, new Tretja.Ladja[0], new Tretja.Strel[0]);
        double[] xy = tretja.zgornjiLeviKot(364, 448);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
