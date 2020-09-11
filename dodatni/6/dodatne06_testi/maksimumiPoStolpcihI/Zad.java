import java.util.*;


public class Zad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int s = sc.nextInt();

        int[][] tab = new int[v][s];
        int[] vrni = new int[s];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < s; j++) {
                tab[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < s; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < v; j++) {
                if (tab[j][i] > max) {
                    max = tab[j][i];
                }
            }
            vrni[i] = max;
        }

        System.out.println(Arrays.toString(vrni));

    }
}