
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
    }

    public static int odrezi(int n) {
        int digit = n % 10;
        while (digit == 0) {
            n -= digit;
            n /= 10;
            digit = n % 10;
        }
        return n;
    }

    public static boolean enakeVsote(int[][] t) {
        boolean prvi = true;
        int prsum = 0;
        for (int i = 0; i < t.length; i++) {
            int sum = 0;
            for (int j = 0; j < t[i].length; j++) {
                sum += t[i][j];
            }
            if (prvi || sum == prsum) {
                prvi = false;
                prsum = sum;
            } else {
                return false;
            }
        }
        return true;
    }
    // po potrebi dopolnite ...
}
