import java.util.*;

public class Zad {
    public static int count;
    public static int l;
    public static int d;
    public static int c;

    public static void rekurzija(int stL, int stD, int stC, boolean levi, boolean desni) {

        if (stL < 0 || stD < 0 || stC < 0) {
            return;
        }
        if (stL == 0 && stD == 0 && stC == 0) {
        count++;
        }
        
        if (!desni) {
            rekurzija(--stL, stD, stC, true, false);
        }
        if (!levi) {
            rekurzija(stL, --stD, stC, false, true);
        }
        rekurzija(stL, stD, --stC, false, false);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        d = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        rekurzija(l, c, d, false, false);

        System.out.println(count);


    }
}
