
public class Test37 {

    private static int[][] TABELA01 = {
        {60, 60, 60, 60, 68, 38, 60, 60, 74, 60, 60, 60, 80},
        {90, 90, 90, 90, 90, 90, 90, 27, 93, 90, 90, 90, 53},
        {15, 70, 19, 70, 70, 89, 31, 92, 35, 45, 70, 70, 70},
        {87, 87, 10, 87, 87, 87, 13, 87, 59, 87, 40, 93, 87},
    };

    private static int[][] TABELA02 = {
        {23, 23, 23, 23, 23, 23},
        {15, 15, 15, 15, 15, 15},
        {13, 13, 13, 13, 13, 14},
        {10, 10, 10, 10, 10, 10},
    };

    private static int[][] TABELA03 = {
        {77, 77},
        {84, 33},
        {14, 14},
        {77, 77},
    };

    private static int[][] TABELA04 = {
        {86, 55, 58, 81, 86, 86, 86, 46, 86, 86, 86, 32, 54, 54, 53, 45, 86},
        {22, 72, 74, 72, 31, 72, 46, 83, 71, 92, 76, 72, 72, 72, 44, 48, 72},
        {73, 89, 47, 81, 47, 13, 47, 47, 47, 15, 47, 30, 47, 73, 47, 40, 27},
        {53, 72, 59, 59, 19, 59, 45, 59, 59, 21, 44, 59, 59, 69, 87, 59, 59},
    };

    private static int[][] TABELA05 = {
        {90, 78, 78, 52, 44, 27, 78, 56},
        {80, 37, 84, 25, 84, 86, 84, 84},
        {64, 42, 94, 42, 35, 27, 42, 52},
        {12, 17, 12, 12, 93, 37, 46, 12},
    };

    private static int[][] TABELA06 = {
        {98, 50, 69, 98, 13, 46, 12, 98, 76, 98, 98, 98, 50, 99},
        {44, 44, 44, 44, 44, 36, 44, 44, 44, 44, 44, 44, 44, 44},
        {77, 54, 54, 54, 41, 54, 54, 32, 67, 79, 54, 54, 54, 54},
        {80, 92, 92, 92, 92, 92, 92, 92, 86, 92, 92, 92, 92, 46},
    };

    private static int[][] TABELA07 = {
        {56, 93, 96},
        {81, 43, 43},
        {80, 61, 87},
        {27, 97, 27},
    };

    private static int[][] TABELA08 = {
        {60, 60, 61, 60, 60, 61, 60, 60, 59, 60, 60, 60},
        {81, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82},
        {24, 23, 22, 23, 23, 23, 23, 23, 23, 23, 24, 23},
        {23, 23, 23, 23, 23, 23, 24, 23, 23, 23, 23, 23},
    };

    private static int[][] TABELA09 = {
        {75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75},
        {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50},
        {78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78},
        {62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62},
    };

    private static int[][] TABELA10 = {
        {21, 21},
        {59, 59},
        {87, 87},
        {25, 25},
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
