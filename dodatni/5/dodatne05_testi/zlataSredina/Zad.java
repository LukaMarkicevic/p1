import java.util.*;

public class Zad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        ArrayList<Integer> arej = new ArrayList<Integer>();
        int broj = 2 * k + 1;
        for (int i = 0; i < broj; i++) {
            arej.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(arej);

        System.out.println(arej.get(k));


    }
}


