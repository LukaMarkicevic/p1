
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    // =========================================================================
    public static int stPresezkov(int[][] r, int meja) {
        int stDani = 0;
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                if (r[i][j] > meja) {
                    stDani++;
                }
            }
        }
        return stDani;
    }

    // =========================================================================
    public static int nedeljskoPovprecje(int[][] r) {

        ArrayList<Integer> arej = new ArrayList<Integer>();
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                arej.add(r[i][j]);
            }
        }
        int count = 0;
        int sum = 0;
        // System.out.println(arej);
        for (int i = 6; i < arej.size(); i = i + 7) {
            count++;
            sum += arej.get(i);
        }

        return sum/count;
    }
}
