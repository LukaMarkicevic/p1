
public class Test08 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(new Tretja.Okno[0]);
        double[] xy = tretja.zgornjiLeviKot(780, 660);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
