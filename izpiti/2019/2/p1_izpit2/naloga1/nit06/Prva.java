
// 
// (na konec prej"snje vrstice zapi"site va"so vpisno "stevilko)

import java.util.Arrays;

public class Prva {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    //=========================================================================
    // V vseh testnih primerih velja n > 0 in n < 1 000 000 000.
    //=========================================================================

    public static int povecajPrvo(int n) {
        int digits=0;
        int temp=n;
        while(temp!=0){
            temp/=10;
            digits++;
        }
        int broj=1;
        for(int i=0;i<digits-1;i++){
            broj*=10;
        }


        return n+broj;
    }

    //=========================================================================
    // V vseh testnih primerih je tabela t pravokotna, "stevilo vrstic in
    // "stevilo stolpcev pa je na intervalu [1, 100].
    //
    // V testnih primerih J6 in S26--S30 je "stevilo vrstic enako 1, v
    // primerih J7 in S31--S35 pa 2.
    //=========================================================================

    public static boolean enakiStolpci(int[][] t) {
        for(int i=0;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(t[i][j-1]!=t[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
