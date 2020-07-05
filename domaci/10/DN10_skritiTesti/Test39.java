
public class Test39 {

    public static void main(String[] args) {
        Vreca prva = new Vreca();

        prva.dodaj(1650, 63629);
        prva.dodaj(1054, 84474);
        prva.dodaj(1293, 78762);
        prva.dodaj(1293, 31244);
        prva.dodaj(1887, 7961);
        prva.dodaj(840, 22476);
        prva.dodaj(499, 8578);
        prva.dodaj(1293, 49732);
        prva.dodaj(917, 9476);
        prva.dodaj(1450, 45590);
        prva.dodaj(1103, 90922);
        prva.dodaj(1103, 63585);
        prva.dodaj(1887, 27004);
        prva.dodaj(1887, 45752);
        prva.dodaj(1650, 60751);
        prva.dodaj(1624, 60823);
        prva.dodaj(1293, 51959);
        prva.dodaj(1156, 58695);
        prva.dodaj(439, 33179);
        prva.dodaj(1156, 93784);
        prva.dodaj(1881, 9760);
        prva.dodaj(917, 32015);
        prva.dodaj(1257, 2047);
        prva.dodaj(1257, 50594);
        prva.dodaj(1054, 38311);
        prva.dodaj(1103, 95766);
        prva.dodaj(439, 61792);
        prva.dodaj(1054, 95563);
        prva.dodaj(1650, 78991);
        prva.dodaj(1650, 67402);

        Vreca druga = new Vreca(prva);
        druga.dodaj(1281, 16603);
        druga.dodaj(300, 64869);
        druga.dodaj(1415, 40953);
        druga.dodaj(1466, 75305);
        druga.dodaj(1826, 80275);
        druga.dodaj(1684, 85419);
        druga.dodaj(1062, 55813);
        druga.dodaj(84, 92710);
        druga.dodaj(684, 81073);
        druga.dodaj(486, 50982);
        druga.dodaj(383, 2306);
        druga.dodaj(494, 38979);
        druga.dodaj(477, 48676);
        druga.dodaj(1781, 8978);
        druga.dodaj(1444, 85011);
        druga.dodaj(1772, 25783);
        druga.dodaj(617, 28613);
        druga.dodaj(1667, 5903);
        druga.dodaj(621, 5136);
        druga.dodaj(1616, 16707);
        druga.dodaj(1193, 48056);
        druga.dodaj(68, 20005);
        druga.dodaj(210, 28070);
        druga.dodaj(1947, 87816);
        druga.dodaj(587, 91383);
        druga.dodaj(257, 20161);
        druga.dodaj(349, 27065);
        druga.dodaj(1071, 13678);
        druga.dodaj(515, 50931);
        druga.dodaj(918, 29738);
        druga.dodaj(1082, 11128);
        druga.dodaj(736, 95688);
        druga.dodaj(138, 18772);
        druga.dodaj(996, 950);
        druga.dodaj(1773, 87309);
        druga.dodaj(340, 19820);
        druga.dodaj(668, 97945);
        druga.dodaj(932, 71815);
        druga.dodaj(1331, 68116);
        druga.dodaj(245, 25862);
        druga.dodaj(1492, 98133);
        druga.dodaj(1156, 54824);
        druga.dodaj(1293, 95046);
        druga.dodaj(840, 38488);
        druga.dodaj(439, 63013);
        druga.dodaj(1054, 77082);
        druga.dodaj(1887, 31854);
        druga.dodaj(1624, 94648);
        druga.dodaj(1303, 36817);
        druga.dodaj(1450, 60553);
        druga.dodaj(917, 3484);
        druga.dodaj(1881, 15666);
        druga.dodaj(499, 84199);
        druga.dodaj(1257, 35471);
        druga.dodaj(1103, 87932);
        druga.dodaj(1650, 37475);

        druga.odstrani(1293, 78726);
        druga.odstrani(1887, 26645);
        druga.odstrani(1103, 2737);
        druga.odstrani(1450, 82914);
        druga.odstrani(1650, 56937);
        druga.odstrani(1303, 50432);

        System.out.println(prva.razlika(druga));
        System.out.println(druga.razlika(prva));
    }
}
