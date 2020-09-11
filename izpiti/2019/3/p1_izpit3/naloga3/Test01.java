
public class Test01 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(20, new Tretja.Ladja[0], new Tretja.Strel[0]);
        System.out.println(Platno.ri(tretja.stranicaPolja(720, 720)));
        System.out.println(Platno.ri(tretja.stranicaPolja(300, 400)));
        System.out.println(Platno.ri(tretja.stranicaPolja(1500, 600)));
    }
}
