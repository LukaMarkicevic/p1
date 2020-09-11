
import java.util.Arrays;

public class Test05 {

    public static void main(String[] args) {
        Druga.Stih[] stihi = {
            new Druga.Stih(0, new int[]{64, 97, 98}),
            new Druga.Stih(2, new int[]{31, 123, 29}),
            new Druga.Stih(0, new int[]{99, 74, 18}),
            new Druga.Stih(0, new int[]{112, 17, 33}),
            new Druga.Stih(0, new int[]{9, 27, 7}),
            new Druga.Stih(1, new int[]{30, 8, 19}),
            new Druga.Stih(1, new int[]{87, 66, 70}),
            new Druga.Stih(1, new int[]{56, 16, 72}),
            new Druga.Stih(0, new int[]{71, 88, 102}),
            new Druga.Stih(2, new int[]{46, 0, 35}),
            new Druga.Stih(2, new int[]{43, 103, 5}),
            new Druga.Stih(0, new int[]{41, 96, 57}),
            new Druga.Stih(1, new int[]{13, 73, 95}),
            new Druga.Stih(0, new int[]{36, 105, 85}),
            new Druga.Stih(1, new int[]{114, 20, 65}),
            new Druga.Stih(1, new int[]{68, 79, 50}),
            new Druga.Stih(2, new int[]{38, 61, 11}),
            new Druga.Stih(0, new int[]{42, 45, 86}),
            new Druga.Stih(2, new int[]{82, 6, 12}),
            new Druga.Stih(2, new int[]{34, 109, 4}),
            new Druga.Stih(0, new int[]{44, 22, 101}),
            new Druga.Stih(2, new int[]{125, 48, 110}),
            new Druga.Stih(2, new int[]{39, 104, 37}),
            new Druga.Stih(0, new int[]{84, 121, 53}),
            new Druga.Stih(1, new int[]{92, 124, 60}),
            new Druga.Stih(2, new int[]{69, 51, 107}),
            new Druga.Stih(1, new int[]{100, 58, 116}),
            new Druga.Stih(0, new int[]{77, 80, 24}),
            new Druga.Stih(1, new int[]{26, 23, 49}),
            new Druga.Stih(0, new int[]{93, 1, 40}),
            new Druga.Stih(0, new int[]{83, 91, 32}),
            new Druga.Stih(1, new int[]{21, 10, 2}),
            new Druga.Stih(1, new int[]{14, 106, 76}),
            new Druga.Stih(2, new int[]{120, 15, 119}),
            new Druga.Stih(2, new int[]{115, 118, 108}),
            new Druga.Stih(0, new int[]{113, 117, 62}),
            new Druga.Stih(1, new int[]{54, 67, 89}),
            new Druga.Stih(0, new int[]{81, 122, 75}),
            new Druga.Stih(1, new int[]{55, 63, 78}),
            new Druga.Stih(0, new int[]{25, 59, 94}),
            new Druga.Stih(2, new int[]{47, 111, 52}),
            new Druga.Stih(0, new int[]{90, 3, 28}),
        };
        Druga.Partija partija = new Druga.Partija(3, stihi);
        for (int i = 0;  i < stihi.length;  i++) {
            System.out.println(stihi[i].vrednost());
        }
    }
}
