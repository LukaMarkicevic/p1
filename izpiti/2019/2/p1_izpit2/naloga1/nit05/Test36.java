
public class Test36 {

    private static int[][] TABELA01 = {
        {72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72},
        {24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24},
        {96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96},
    };

    private static int[][] TABELA02 = {
        {20, 20, 41, 20},
        {97, 29, 75, 97},
        {56, 56, 56, 26},
    };

    private static int[][] TABELA03 = {
        {76, 76, 76, 76, 76, 76, 76, 76, 76, 76},
        {93, 93, 93, 93, 93, 93, 93, 93, 93, 93},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
    };

    private static int[][] TABELA04 = {
        {69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69},
        {39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39},
        {96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96},
    };

    private static int[][] TABELA05 = {
        {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},
        {43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43},
        {37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37},
    };

    private static int[][] TABELA06 = {
        {75, 75, 75, 75, 75, 75},
        {46, 46, 46, 46, 46, 46},
        {92, 92, 92, 92, 92, 92},
    };

    private static int[][] TABELA07 = {
        {35, 35, 35, 96, 86, 15, 52, 35, 62, 39, 39, 35, 39},
        {73, 73, 73, 41, 68, 52, 87, 73, 73, 48, 73, 91, 73},
        {73, 35, 36, 20, 35, 97, 36, 92, 65, 35, 48, 80, 36},
    };

    private static int[][] TABELA08 = {
        {48, 48, 48, 48, 48, 48},
        {26, 26, 26, 26, 26, 26},
        {39, 39, 39, 39, 39, 39},
    };

    private static int[][] TABELA09 = {
        {96, 96, 96, 96, 96, 96, 96},
        {36, 36, 36, 36, 36, 36, 36},
        {92, 92, 92, 92, 92, 92, 92},
    };

    private static int[][] TABELA10 = {
        {16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 16, 16, 16, 16, 16},
        {74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74},
        {54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54},
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
