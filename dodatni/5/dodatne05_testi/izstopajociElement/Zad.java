import java.util.*;

public class Zad {

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int findGCD(int arr[], int n) {
        int result = 0;
        for (int element : arr) {
            result = gcd(result, element);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arej = new int[n];

        for (int i = 0; i < n; i++) {
            arej[i] = sc.nextInt();
        }
        sc.close();



        int[] arej2 = new int[n - 1];
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            int glo = 0;
            for (int j = 0; j < n; j++) {
                if (arej[i] == arej[j]) {
                    continue;
                }
                arej2[glo++] = arej[j];
            }


            // System.out.println(Arrays.toString(arej2));
            int gcd = findGCD(arej2, n);
            if (arej[i] % gcd != 0) {
                System.out.println(arej[i]);
                ok = true;
            }
        }
        if (!ok) {
            System.out.println("NIC");
        }


    }
}


