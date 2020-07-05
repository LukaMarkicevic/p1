
public class Test35 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj(1542, 30203638);
        prva.dodaj(1445, 62423961);
        prva.dodaj(487, 72984970);
        prva.dodaj(1811, 36780952);
        prva.dodaj(248, 68382613);
        prva.dodaj(90, 34017123);
        prva.dodaj(487, 71037889);
        prva.dodaj(1811, 64840827);
        prva.dodaj(1515, 75851223);
        prva.dodaj(1318, 57143196);
        prva.dodaj(1705, 25137315);
        prva.dodaj(1811, 64889720);
        prva.dodaj(1866, 95721764);
        prva.dodaj(1866, 62224633);
        prva.dodaj(1705, 51578305);
        prva.dodaj(1866, 92693029);
        prva.dodaj(90, 91298632);
        prva.dodaj(90, 84687284);
        prva.dodaj(1811, 42800726);
        prva.dodaj(1445, 76624026);

        Vreca druga = new Vreca(prva);
        druga.dodaj(121, 29258746);
        druga.dodaj(598, 85442576);
        druga.dodaj(565, 6282596);
        druga.dodaj(287, 15636918);
        druga.dodaj(269, 6662952);
        druga.dodaj(1455, 16496869);
        druga.dodaj(1435, 24469289);
        druga.dodaj(116, 31568633);
        druga.dodaj(1702, 67763264);
        druga.dodaj(1703, 46474721);
        druga.dodaj(236, 28192538);
        druga.dodaj(796, 38118204);
        druga.dodaj(1070, 99856152);
        druga.dodaj(1600, 81284549);
        druga.dodaj(1295, 78441656);
        druga.dodaj(794, 472477);
        druga.dodaj(65, 93617046);
        druga.dodaj(1013, 15235160);
        druga.dodaj(1378, 8425254);
        druga.dodaj(1635, 30209507);
        druga.dodaj(63, 63213379);
        druga.dodaj(1496, 17797871);
        druga.dodaj(753, 49042651);
        druga.dodaj(621, 95339242);
        druga.dodaj(1241, 11467612);
        druga.dodaj(513, 7758398);
        druga.dodaj(627, 3500063);
        druga.dodaj(653, 18883947);
        druga.dodaj(1763, 23980048);
        druga.dodaj(1033, 2431263);
        druga.dodaj(556, 46428391);
        druga.dodaj(504, 60408399);
        druga.dodaj(1601, 52395863);
        druga.dodaj(1811, 37035062);
        druga.dodaj(1542, 17246303);
        druga.dodaj(1515, 56564742);
        druga.dodaj(487, 98227803);
        druga.dodaj(1866, 51688689);
        druga.dodaj(248, 27653500);
        druga.dodaj(1445, 99954654);
        druga.dodaj(90, 59053202);
        druga.dodaj(1318, 73490140);
        druga.dodaj(1705, 71313009);

        druga.odstrani(1515, 43032074);
        druga.odstrani(1542, 1159826);
        druga.odstrani(1866, 98952920);
        druga.odstrani(487, 93339528);
        druga.odstrani(1445, 11614087);
        druga.odstrani(248, 14572566);
        druga.odstrani(1318, 32589775);

        System.out.println(prva.presek(druga));
    }
}
