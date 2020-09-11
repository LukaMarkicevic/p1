
public class Test35 {

    private static int[][] TABELA01 = {
        {24, 93, 99, 48, 24},
        {33, 83, 93, 15, 14},
    };

    private static int[][] TABELA02 = {
        {44, 82},
        {41, 81},
    };

    private static int[][] TABELA03 = {
        {94, 15, 81, 15, 15, 15, 15, 15},
        {85, 39, 71, 17, 70, 69, 69, 69},
    };

    private static int[][] TABELA04 = {
        {31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31},
        {70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70},
    };

    private static int[][] TABELA05 = {
        {22, 54, 14, 22, 38, 22, 22, 46},
        {24, 41, 18, 24, 29, 24, 24, 24},
    };

    private static int[][] TABELA06 = {
        {65, 65, 65, 65},
        {19, 18, 19, 19},
    };

    private static int[][] TABELA07 = {
        {80, 80, 80, 41, 80, 69, 93, 28, 26, 40, 33, 80, 80, 48, 80, 58, 81, 76, 17},
        {65, 73, 97, 57, 65, 12, 65, 86, 20, 65, 52, 65, 65, 59, 65, 27, 57, 65, 68},
    };

    private static int[][] TABELA08 = {
        {90, 20, 55, 55, 55},
        {52, 70, 70, 36, 70},
    };

    private static int[][] TABELA09 = {
        {85, 85, 85, 85, 85, 85, 85, 85, 29, 85, 85, 85, 85, 85, 85, 85, 85, 85},
        {41, 12, 41, 41, 41, 41, 87, 41, 41, 41, 82, 41, 91, 41, 77, 41, 41, 13},
    };

    private static int[][] TABELA10 = {
        {15, 15, 16, 15, 15},
        {95, 95, 95, 95, 95},
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
