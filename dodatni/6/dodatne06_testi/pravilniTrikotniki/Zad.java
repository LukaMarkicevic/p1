import java.util.*;

public class Zad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] tab = new int[n][];
        
        int najveci = 0;
        for (int i = 0; i < n; i++) {
            int broj = sc.nextInt();
            if (broj > najveci) {
                najveci = broj;
            }
            tab[i] = new int[broj];
            for (int j = 0; j < broj; j++) {
                tab[i][j] = sc.nextInt();
            }
        }
        int[] vrni = new int[najveci];
        for (int i = 0; i < najveci; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                try {
                    if (tab[j][i] > max) {
                        max = tab[j][i];
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            vrni[i] = max;

        }

        System.out.println(Arrays.toString(vrni));

    }
}