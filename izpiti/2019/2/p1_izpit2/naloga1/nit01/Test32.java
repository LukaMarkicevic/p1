
public class Test32 {

    private static int[][] TABELA01 = {
        {26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26},
        {44, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},
    };

    private static int[][] TABELA02 = {
        {45, 45, 45, 45, 45, 45, 46, 45, 45, 45},
        {84, 84, 84, 84, 84, 84, 84, 84, 84, 84},
    };

    private static int[][] TABELA03 = {
        {12, 35, 35, 35, 35},
        {22, 22, 22, 22, 29},
    };

    private static int[][] TABELA04 = {
        {62, 62, 63, 61, 62},
        {85, 84, 86, 85, 85},
    };

    private static int[][] TABELA05 = {
        {21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21},
        {35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35},
    };

    private static int[][] TABELA06 = {
        {52, 62, 62, 91, 44, 76, 75, 62, 91, 87, 62},
        {82, 82, 88, 82, 14, 82, 82, 82, 82, 82, 40},
    };

    private static int[][] TABELA07 = {
        {69, 69, 69, 69},
        {52, 52, 53, 53},
    };

    private static int[][] TABELA08 = {
        {53, 53, 53, 46, 53, 52, 53, 53, 53},
        {53, 53, 53, 76, 87, 53, 53, 53, 36},
    };

    private static int[][] TABELA09 = {
        {48, 48, 48, 48, 48, 48},
        {99, 99, 99, 99, 99, 99},
    };

    private static int[][] TABELA10 = {
        {25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25},
        {31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31},
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
