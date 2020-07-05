
public class Test01 {

    public static void main(String[] args) {
        Nota n1 = new Nota(3, 4);
        Nota n2 = new Nota(7, 0);
        Nota n3 = new Nota(9, 10);

        System.out.println(n1.vrniOktavo());
        System.out.println(n1.vrniIndeks());
        System.out.println(n1.toString());
        System.out.println(n1.razmak(n2));
        System.out.println(n1.jeNizjaKot(n2));
        System.out.println(n1.naRazdalji(-33).toString());
        System.out.println("----------");

        Lestvica lst1 = new Lestvica(n1, 5);
        System.out.printf("%s | %d%n", lst1.vrniZacetnoNoto().toString(), lst1.vrniRazmak());
        System.out.println(lst1.toString());
        System.out.println(lst1.clen(6).toString());
        System.out.println(lst1.vsebujeNoto(n2));
        System.out.println(lst1.perioda());
        System.out.println("----------");

        Lestvica lst2 = Lestvica.izPrvihDveh(n2, n3); 
        System.out.printf("%s | %d%n", lst2.vrniZacetnoNoto().toString(), lst2.vrniRazmak());
        System.out.println(lst2.toString());
        System.out.println(lst2.clen(7).toString());
        System.out.println(lst2.vsebujeNoto(new Nota(21, 2)));
        System.out.println(lst2.perioda());
        System.out.println("----------");

        Lestvica lst3 = lst1.presek(lst2);
        System.out.println(lst3.toString());
    }
}
