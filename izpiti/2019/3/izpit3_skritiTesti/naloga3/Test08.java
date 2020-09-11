
public class Test08 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(3, new Tretja.Ladja[0], new Tretja.Strel[0]);
        double[] xy = tretja.zgornjiLeviKot(594, 216);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
