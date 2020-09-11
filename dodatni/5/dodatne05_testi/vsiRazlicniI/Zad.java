import java.util.*;

public class Zad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arej = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            arej.add(sc.nextInt());
        }
        Collections.sort(arej);
        // int broj=NULL;

        for (int i = 0; i < n; i++) {
            if (i + 1 == n)
                break;
            int jedan = arej.get(i);
            int dva = arej.get(i + 1);
            // if (arej.get(i) == -4714) {
            //     System.out.println("asd");
            //     System.out.println(arej.get(i + 1));
            //     System.out.println(i);
            //     System.out.println("asd");
            // }
            
            if (jedan==dva) {
                System.out.println(jedan);
                System.exit(0);
            }
        }
        System.out.println("RAZLICNI");



    }
}


