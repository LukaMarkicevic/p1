
public class Test07 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(new Tretja.Polje[8][8]);
        double[] xy = tretja.zgornjiLeviKot(480, 400);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
