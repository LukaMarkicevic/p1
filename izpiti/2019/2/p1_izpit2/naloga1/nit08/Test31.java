
public class Test31 {

    private static int[][] TABELA01 = {
        {36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36},
        {68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68},
    };

    private static int[][] TABELA02 = {
        {83, 83},
        {65, 65},
    };

    private static int[][] TABELA03 = {
        {32, 32, 32, 32, 32, 32, 32, 32},
        {54, 54, 54, 54, 54, 54, 54, 54},
    };

    private static int[][] TABELA04 = {
        {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32},
        {58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58},
    };

    private static int[][] TABELA05 = {
        {75, 24, 75},
        {99, 99, 18},
    };

    private static int[][] TABELA06 = {
        {41, 94, 41, 30, 41, 41, 41, 71, 41, 77, 41, 41},
        {85, 77, 84, 77, 77, 77, 77, 77, 77, 77, 77, 77},
    };

    private static int[][] TABELA07 = {
        {35, 35, 35, 35, 35, 35},
        {75, 75, 75, 75, 75, 75},
    };

    private static int[][] TABELA08 = {
        {69, 62},
        {21, 21},
    };

    private static int[][] TABELA09 = {
        {38, 38, 38, 38, 38, 39, 38, 38, 38},
        {46, 46, 46, 46, 46, 46, 46, 46, 46},
    };

    private static int[][] TABELA10 = {
        {80, 80, 80, 80, 80, 80},
        {70, 70, 70, 70, 70, 70},
    };

    public static void main(String[] args) {
        System.out.println(Prva.enakiStolpci(TABELA01));
        System.out.println(Prva.enakiStolpci(TABELA02));
        System.out.println(Prva.enakiStolpci(TABELA03));
        System.out.println(Prva.enakiStolpci(TABELA04));
        System.out.println(Prva.enakiStolpci(TABELA05));
        System.out.println(Prva.enakiStolpci(TABELA06));
        System.out.println(Prva.enakiStolpci(TABELA07));
        System.out.println(Prva.enakiStolpci(TABELA08));
        System.out.println(Prva.enakiStolpci(TABELA09));
        System.out.println(Prva.enakiStolpci(TABELA10));
    }
}
