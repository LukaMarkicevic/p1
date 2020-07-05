
public class Test11 {

    public static void main(String[] args) {
        Vreca vreca = new Vreca();

        vreca.dodaj(378);
        vreca.dodaj(783);
        vreca.dodaj(1703);
        vreca.dodaj(1281);
        vreca.dodaj(70);
        vreca.dodaj(147);
        vreca.dodaj(459);
        vreca.dodaj(590);
        vreca.dodaj(1811);
        vreca.dodaj(1666);
        vreca.dodaj(830);
        vreca.dodaj(1973);
        vreca.dodaj(108);
        vreca.dodaj(948);
        vreca.dodaj(595);
        vreca.dodaj(1274);
        vreca.dodaj(1402);
        vreca.dodaj(1286);
        vreca.dodaj(208);
        vreca.dodaj(1202);
        vreca.dodaj(493);

        vreca.odstrani(1402);
        vreca.odstrani(70);
        vreca.odstrani(147);
        vreca.odstrani(208);
        vreca.odstrani(783);

        System.out.println(vreca.steviloRazlicnihElementov());
    }
}
