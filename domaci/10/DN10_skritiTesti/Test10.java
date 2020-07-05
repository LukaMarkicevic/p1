
public class Test10 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj("atu");
        vreca.dodaj("yt", 66279831);
        vreca.dodaj("h");
        vreca.dodaj("jnuj", 67165650);
        vreca.dodaj("atu", 23881223);
        vreca.dodaj("h", 14064436);
        vreca.dodaj("kct");
        vreca.dodaj("jnuj", 22983203);
        vreca.dodaj("jnuj");
        vreca.dodaj("mt");
        vreca.dodaj("uvp");
        vreca.dodaj("gtp");
        vreca.dodaj("mt", 36846067);
        vreca.dodaj("h", 51911675);
        vreca.dodaj("jnuj", 4509215);
        vreca.dodaj("uvp");
        vreca.dodaj("h");
        vreca.dodaj("gtp", 55837546);

        System.out.println(vreca.steviloRazlicnihElementov());
        System.out.println(vreca.steviloKopij("kct"));
        System.out.println(vreca.steviloKopij("mt"));
        System.out.println(vreca.steviloKopij("gtp"));
        System.out.println(vreca.steviloKopij("kqy"));
        System.out.println(vreca.steviloKopij("jnuj"));
        System.out.println(vreca.steviloKopij("yt"));
        System.out.println(vreca.steviloKopij("h"));
        System.out.println(vreca.steviloKopij("uvp"));
        System.out.println(vreca.steviloKopij("atu"));
    }
}
