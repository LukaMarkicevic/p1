
public class Test19 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(462, 76987);
        vreca.dodaj(1563, 93347);
        vreca.dodaj(1965);
        vreca.dodaj(1421, 78654);
        vreca.dodaj(1638, 42638);
        vreca.dodaj(1638, 24038);
        vreca.dodaj(1563);
        vreca.dodaj(1192);
        vreca.dodaj(1421, 40970);
        vreca.dodaj(884, 37387);
        vreca.dodaj(1638, 23858);
        vreca.dodaj(1192);
        vreca.dodaj(601);
        vreca.dodaj(1421, 86986);
        vreca.dodaj(1638);
        vreca.dodaj(1638, 84253);
        vreca.dodaj(601, 61764);
        vreca.dodaj(1421, 807);
        vreca.dodaj(1563, 1665);
        vreca.dodaj(1563, 57615);

        vreca.odstrani(462);
        vreca.odstrani(1421, 28925);
        vreca.odstrani(1563);
        vreca.odstrani(1638);
        vreca.odstrani(1965);

        System.out.println(vreca.steviloRazlicnihElementov());
        System.out.println(vreca.steviloKopij(1176));
        System.out.println(vreca.steviloKopij(884));
        System.out.println(vreca.steviloKopij(462));
        System.out.println(vreca.steviloKopij(386));
        System.out.println(vreca.steviloKopij(1563));
        System.out.println(vreca.steviloKopij(1638));
        System.out.println(vreca.steviloKopij(1192));
        System.out.println(vreca.steviloKopij(1965));
        System.out.println(vreca.steviloKopij(1421));
        System.out.println(vreca.steviloKopij(601));
    }
}
