
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        boolean mora = true;
        int broj = 0;
        while (mora) {
            sum = 0;
            for (int i = 1; i < n; i++) {

                if (n % i == 0) {
                    sum += i;
                }
            }
            if (n < sum) {
                broj = n;
                mora = false;
            }
            n++;
        }
        System.out.println(broj);

    }
}
