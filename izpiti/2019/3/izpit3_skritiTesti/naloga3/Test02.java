
public class Test02 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(24, new Tretja.Ladja[0], new Tretja.Strel[0]);
        System.out.println(Platno.ri(tretja.stranicaPolja(1296, 1488)));
    }
}
