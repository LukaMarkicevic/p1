
public class Test01 {

    public static void main(String[] args) {

        Tretja tretja1 = new Tretja(new Tretja.Polje[6][6]);
        System.out.println(Platno.ri(tretja1.stranicaPolja(420, 420)));
        System.out.println(Platno.ri(tretja1.stranicaPolja(600, 420)));
        System.out.println(Platno.ri(tretja1.stranicaPolja(240, 630)));
        System.out.println("----------");

        Tretja tretja2 = new Tretja(new Tretja.Polje[3][5]);
        System.out.println(Platno.ri(tretja2.stranicaPolja(420, 420)));
        System.out.println(Platno.ri(tretja2.stranicaPolja(600, 420)));
        System.out.println(Platno.ri(tretja2.stranicaPolja(240, 630)));
        System.out.println("----------");

        Tretja tretja3 = new Tretja(new Tretja.Polje[7][4]);
        System.out.println(Platno.ri(tretja3.stranicaPolja(420, 420)));
        System.out.println(Platno.ri(tretja3.stranicaPolja(600, 420)));
        System.out.println(Platno.ri(tretja3.stranicaPolja(240, 630)));
    }
}
