import java.util.*;

public class Zad {
    private static final int MAKS_STEVILO = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        Random random = new Random(s);
        ArrayList<Integer> arej = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            arej.add(random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO);
        }
        
        Collections.sort(arej);
        for (int i = 0; i < n; i++) {
            int occurrences = Collections.frequency(arej, arej.get(i));
            if(occurrences>1){
                System.out.println(arej.get(i));
                System.exit(0);
            }
        }
        
        System.out.println("RAZLICNI");
 
 
 
    }}

              

