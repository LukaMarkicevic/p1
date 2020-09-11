
public class Test30 {

    private static int[][] TABELA01 = {
        {91, 91, 91, 91, 91, 91, 91, 91, 91},
    };

    private static int[][] TABELA02 = {
        {38, 38, 50, 10, 38},
    };

    private static int[][] TABELA03 = {
        {38, 38, 13, 38, 38, 38, 38, 38, 38, 58, 38, 38, 38, 38, 38},
    };

    private static int[][] TABELA04 = {
        {44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44},
    };

    private static int[][] TABELA05 = {
        {65, 65, 65, 65, 70, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65},
    };

    private static int[][] TABELA06 = {
        {61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61},
    };

    private static int[][] TABELA07 = {
        {76, 76, 76, 76, 76},
    };

    private static int[][] TABELA08 = {
        {57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57},
    };

    private static int[][] TABELA09 = {
        {28, 28, 28, 28, 28, 28},
    };

    private static int[][] TABELA10 = {
        {87, 88, 88, 88},
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
