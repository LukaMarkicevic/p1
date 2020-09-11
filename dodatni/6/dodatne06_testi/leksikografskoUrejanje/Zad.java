import java.util.*;

public class Zad {
    public static int d;

    public static boolean manji(int[] arej1, int[] arej2) {
        int i = 0;
        while (arej2[i] == arej1[i]) {
            i++;
            if (i == d) {
                return false;
            }
        }
        
        if (arej2[i] < arej1[i]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        d = sc.nextInt();
        int[][] tab = new int[n][d];
        int[] temp = new int[d];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                tab[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (manji(tab[i], tab[j])) {
                    // System.out.println("asd");
                    temp = Arrays.copyOf(tab[i], d);
                    tab[i] = Arrays.copyOf(tab[j], d);
                    tab[j] = Arrays.copyOf(temp, d);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(tab[i]));
        }

    }
}
