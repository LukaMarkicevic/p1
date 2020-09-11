import java.util.*;

public class Zad {


    public static int cifre(int broj) {
        int vrati = 0;
        while (broj != 0) {
            int cifra = broj % 10;
            broj -= cifra;
            broj /= 10;

            switch (cifra) {
                case 0:
                    vrati += 6;
                    break;
                case 1:
                    vrati += 2;
                    break;
                case 2:
                    vrati += 5;
                    break;
                case 3:
                    vrati += 5;
                    break;
                case 4:
                    vrati += 4;
                    break;
                case 5:
                    vrati += 5;
                    break;
                case 6:
                    vrati += 6;
                    break;
                case 7:
                    vrati += 3;
                    break;
                case 8:
                    vrati += 7;
                    break;
                case 9:
                    vrati += 6;
                    break;
            }
        }
        return vrati;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arej = new int[n];
        int broj = 0;
        int vrati = 0;
        for (int i = 0; i < n; i++) {
            arej[i] = sc.nextInt();
            if (cifre(arej[i]) > broj) {
                broj = cifre(arej[i]);
                vrati = arej[i];
            }
        }
        sc.close();
        System.out.println(vrati);
    }
}


