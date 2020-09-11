
public class Test09 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(new Tretja.Okno[0]);
        double[] xy = tretja.zgornjiLeviKot(400, 720);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
