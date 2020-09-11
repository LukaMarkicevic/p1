
public class Test08 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(new Tretja.Polje[5][3]);
        double[] xy = tretja.zgornjiLeviKot(240, 360);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
