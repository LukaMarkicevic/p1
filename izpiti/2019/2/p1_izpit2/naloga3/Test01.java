
public class Test01 {

    public static void main(String[] args) {

        Tretja tretja = new Tretja(new Tretja.Okno[0]);
        System.out.println(Platno.ri(tretja.stranicaZaslona(400, 400)));
        System.out.println(Platno.ri(tretja.stranicaZaslona(750, 450)));
        System.out.println(Platno.ri(tretja.stranicaZaslona(600, 840)));
    }
}
