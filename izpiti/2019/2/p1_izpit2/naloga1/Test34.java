
public class Test34 {

    private static int[][] TABELA01 = {
        {61, 63, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62},
        {72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 73, 72, 72, 72},
    };

    private static int[][] TABELA02 = {
        {17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17},
        {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15},
    };

    private static int[][] TABELA03 = {
        {34, 34, 34, 34, 34, 34},
        {51, 51, 51, 51, 51, 51},
    };

    private static int[][] TABELA04 = {
        {36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36},
        {36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36},
    };

    private static int[][] TABELA05 = {
        {38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38},
        {66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66},
    };

    private static int[][] TABELA06 = {
        {33, 33, 33, 33, 33, 33, 33, 33, 33},
        {66, 66, 66, 66, 66, 66, 66, 66, 66},
    };

    private static int[][] TABELA07 = {
        {51, 52, 54, 53, 52, 53, 52, 52, 52, 53, 54, 52, 52, 52},
        {98, 96, 98, 99, 97, 98, 98, 98, 97, 99, 97, 98, 96, 98},
    };

    private static int[][] TABELA08 = {
        {52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52},
        {76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76},
    };

    private static int[][] TABELA09 = {
        {31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31},
        {73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73},
    };

    private static int[][] TABELA10 = {
        {92, 92, 92, 92, 92, 92, 92, 92, 92},
        {89, 89, 89, 89, 89, 89, 89, 89, 89},
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
