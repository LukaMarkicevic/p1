
public class Volitve {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int sum = 0;
        for (int i = 0; i < t[0][0].length; i++) {
            sum += t[leto][stranka][i];
        }
        return sum;
    }

    public static int[][] glasovi(int[][][] t) {
        int tabela[][] = new int[t.length][t[0].length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                tabela[i][j] = steviloGlasov(t, i, j);
            }
        }
        return tabela;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int max = Integer.MIN_VALUE;
        int indeks = 0;

        for (int i = 0; i < t[0][0].length; i++) {
            int j = 0;
            int sum = 0;
            for (; j < t.length; j++) {
                sum += t[j][stranka][i];
            }
            if (sum > max) {
                max = sum;
                indeks = i;
            }

        }
        return indeks;
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int sum = 0;

        for (int i = 0; i < t.length; i++) {
            int broj = 1;
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j][volisce] > t[i][stranka][volisce]) {
                    broj++;
                }
            }
            sum += broj;
        }

        return sum;
    }
}
