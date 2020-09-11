
public class Test05 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(25, new Tretja.Ladja[0], new Tretja.Strel[0]);
        System.out.println(Platno.ri(tretja.stranicaPolja(3400, 3900)));
    }
}
