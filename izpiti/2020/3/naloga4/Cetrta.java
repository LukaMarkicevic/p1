
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {


    // =========================================================================
    public static interface Generator {
        public int naslednji();
    }

    // =========================================================================
    public static int stKlicev(Generator gen, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
                
        while (true) {
            int number = gen.naslednji();
            count++;
            
            if (map.containsKey(number)) {
                int val = map.get(number).intValue();
                val++;
                map.put(number, val);
                if (val == k)
                    break;
            } else {
                map.put(number, 1);
                if (k == 1)
                    break;
            }
        }
        return count;
    }

    // =========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }
}
