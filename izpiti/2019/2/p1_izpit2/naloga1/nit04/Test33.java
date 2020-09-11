
public class Test33 {

    private static int[][] TABELA01 = {
        {14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14},
        {14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14},
    };

    private static int[][] TABELA02 = {
        {99, 98, 98},
        {55, 55, 55},
    };

    private static int[][] TABELA03 = {
        {93, 93, 93, 93, 93, 93, 93},
        {75, 75, 75, 75, 75, 75, 75},
    };

    private static int[][] TABELA04 = {
        {74, 74, 74, 74, 74},
        {29, 29, 29, 29, 29},
    };

    private static int[][] TABELA05 = {
        {31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31},
        {38, 38, 38, 38, 38, 38, 38, 38, 38, 39, 38, 38, 38, 38, 38, 38, 38, 38},
    };

    private static int[][] TABELA06 = {
        {95, 95},
        {32, 32},
    };

    private static int[][] TABELA07 = {
        {21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21},
        {51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51},
    };

    private static int[][] TABELA08 = {
        {96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96},
        {51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51},
    };

    private static int[][] TABELA09 = {
        {76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76},
        {97, 96, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97},
    };

    private static int[][] TABELA10 = {
        {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15},
        {74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74},
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
