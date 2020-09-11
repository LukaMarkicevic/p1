
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {}

    public static int odrezi(int n) {
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            if(digit!=0){
                return temp;
            }
            temp-=digit;
            temp/=10;
            
        }
        return 0;
    }

    public static boolean enakeVsote(int[][] t){
        boolean prvi=true;
        int prsum=0;
        for(int i=0;i<t.length;i++){
            int sum=0;
            for(int j=0;j<t[0].length;j++){
                sum+=t[i][j];
            }
            if(prvi){
                prvi=false;
                prsum=sum;
                continue;   
            }
            if(prsum!=sum){
                return false;
            }
            prsum=sum;
        }
        return true;
    }
    // po potrebi dopolnite ...
}
