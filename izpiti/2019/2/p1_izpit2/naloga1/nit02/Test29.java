
public class Test29 {

    private static int[][] TABELA01 = {
        {16, 16, 16, 16, 16, 16, 15, 17, 15, 18, 17},
    };

    private static int[][] TABELA02 = {
        {19, 67, 63, 61, 71, 67, 39, 67},
    };

    private static int[][] TABELA03 = {
        {16, 16, 16, 16, 16, 16, 16, 16, 16, 16},
    };

    private static int[][] TABELA04 = {
        {19, 72},
    };

    private static int[][] TABELA05 = {
        {69, 32},
    };

    private static int[][] TABELA06 = {
        {37, 58, 15, 58, 58, 77, 33, 58, 58, 58, 74, 58, 88, 58, 96, 66, 58, 93, 25},
    };

    private static int[][] TABELA07 = {
        {26, 19, 74, 19, 74, 55, 74, 53, 90, 37, 66, 36, 74, 74, 31, 38, 74},
    };

    private static int[][] TABELA08 = {
        {65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 37, 65, 65, 39, 65},
    };

    private static int[][] TABELA09 = {
        {63, 59},
    };

    private static int[][] TABELA10 = {
        {91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91},
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
