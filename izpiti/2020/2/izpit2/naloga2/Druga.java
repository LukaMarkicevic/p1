
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

import javafx.collections.ArrayChangeListener;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    // =========================================================================
    // V vseh testnih primerih velja:
    // 1 <= "stevilo vrstic tabele <= 100
    // 1 <= "stevilo stolpcev tabele <= 100
    // =========================================================================

    public static int zadnjaVrsticaZLocilom(char[][] krizanka) {
        // popravite / dopolnite ...
        return -9999;
    }

    // =========================================================================
    // V vseh testnih primerih velja:
    // 1 <= "stevilo vrstic tabele <= 100
    // 1 <= "stevilo stolpcev tabele <= 100
    // 0 <= stolpec < "stevilo stolpcev
    // =========================================================================

    public static char[] ktaBeseda(char[][] krizanka, int stolpec, int k) {
        char[] recenica = new char[krizanka.length];
        for (int i = 0; i < krizanka.length; i++) {
            recenica[i] = krizanka[i][stolpec];
        }
        String recenica2 = new String(recenica);
        String[] arrSplit = recenica2.split("-");
        if (arrSplit.length == k - 1 && recenica[krizanka.length - 1] == '-')
            return new char[0];
        try {
            char[] ret = arrSplit[k - 1].toCharArray();
            return ret;
        } catch (Exception e) {
            return null;
        }
    }
}
