
public class Test09 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(new Tretja.Polje[4][1]);
        double[] xy = tretja.zgornjiLeviKot(500, 600);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
