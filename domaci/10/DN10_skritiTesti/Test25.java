
public class Test25 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj(1228, 81423602);
        prva.dodaj(1228, 22081375);
        prva.dodaj(1228, 73038473);
        prva.dodaj(102, 52325776);
        prva.dodaj(655, 44725835);
        prva.dodaj(556, 80274359);
        prva.dodaj(655, 95177393);
        prva.dodaj(1917, 44705963);
        prva.dodaj(1917, 91873371);
        prva.dodaj(102, 1066471);
        prva.dodaj(52, 74995307);
        prva.dodaj(655, 76967071);
        prva.dodaj(1228, 91613288);
        prva.dodaj(655, 51276896);
        prva.dodaj(813, 27810728);
        prva.dodaj(786, 85557793);

        Vreca druga = new Vreca(prva);
        druga.odstrani(786, 91895975);

        System.out.println(prva.steviloKopij(1228));
        System.out.println(prva.steviloKopij(556));
        System.out.println(prva.steviloKopij(102));
        System.out.println(prva.steviloKopij(1917));
        System.out.println(prva.steviloKopij(655));
        System.out.println(prva.steviloKopij(52));
        System.out.println(prva.steviloKopij(813));
        System.out.println(prva.steviloKopij(786));

        System.out.println(druga.steviloKopij(1228));
        System.out.println(druga.steviloKopij(556));
        System.out.println(druga.steviloKopij(102));
        System.out.println(druga.steviloKopij(1917));
        System.out.println(druga.steviloKopij(655));
        System.out.println(druga.steviloKopij(52));
        System.out.println(druga.steviloKopij(813));
        System.out.println(druga.steviloKopij(786));
    }
}
