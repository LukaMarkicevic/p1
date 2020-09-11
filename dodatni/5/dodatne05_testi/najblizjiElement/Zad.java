import java.util.*;

public class Zad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int broj = 0;
        int vrati = Integer.MAX_VALUE;
        int[] arej = new int[n];

        for (int i = 0; i < n; i++) {
            arej[i] = sc.nextInt();
        }
        int indeks = 0;
        for (int i = 0; i < n; i++) {
            broj = (arej[i] - k) < 0 ? -(arej[i] - k) : (arej[i] - k);
            if (broj < vrati) {
                vrati = broj;
                indeks = i;
            }
        }
        System.out.println(indeks);

    }
}
