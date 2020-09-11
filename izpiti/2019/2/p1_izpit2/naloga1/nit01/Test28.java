
public class Test28 {

    private static int[][] TABELA01 = {
        {35, 35, 35, 35, 35, 35, 35, 35, 35},
    };

    private static int[][] TABELA02 = {
        {58, 58, 44, 42, 87, 58, 58, 58, 71, 64, 39, 58, 58},
    };

    private static int[][] TABELA03 = {
        {77, 77},
    };

    private static int[][] TABELA04 = {
        {62, 62, 62, 57},
    };

    private static int[][] TABELA05 = {
        {17, 16, 16, 17, 17, 18, 17, 18, 17, 17, 17, 17, 17, 17, 19, 17},
    };

    private static int[][] TABELA06 = {
        {24, 99, 81, 99, 81, 99, 99, 99, 99, 73, 82, 99, 99, 20, 99, 99, 99, 99, 55},
    };

    private static int[][] TABELA07 = {
        {53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53},
    };

    private static int[][] TABELA08 = {
        {49, 50, 51, 50, 49, 50, 50, 50, 50, 49, 50, 50, 49, 49, 50, 50, 49},
    };

    private static int[][] TABELA09 = {
        {63, 63, 63, 63, 62},
    };

    private static int[][] TABELA10 = {
        {84, 51, 55, 81, 73, 84},
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
