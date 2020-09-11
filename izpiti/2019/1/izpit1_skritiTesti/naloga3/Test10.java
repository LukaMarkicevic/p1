
public class Test10 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(new Tretja.Polje[6][9]);
        double[] xy = tretja.zgornjiLeviKot(450, 540);
        System.out.println(Platno.ri(xy[0]));
        System.out.println(Platno.ri(xy[1]));
    }
}
