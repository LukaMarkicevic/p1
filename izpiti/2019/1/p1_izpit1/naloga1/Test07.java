
public class Test07 {

    private static final boolean T = true;
    private static final boolean F = false;

    private static boolean[][] TABELA01 = {
        {F, F},
        {F, T},
        {F, T},
    };

    private static boolean[][] TABELA02 = {
        {T, T, T, T, F},
        {T, T, F, T, F},
        {F, T, F, T, F},
    };

    private static boolean[][] TABELA03 = {
        {F, T, T, F, F, F},
        {T, F, T, F, T, F},
        {T, T, T, T, T, T},
    };

    private static boolean[][] TABELA04 = {
        {T, T},
        {F, T},
        {F, F},
    };

    private static boolean[][] TABELA05 = {
        {T, T, T, T},
        {F, T, T, F},
        {F, F, T, F},
    };

    private static boolean[][] TABELA06 = {
        {F, F, F, F, T, T, T, F},
        {F, F, F, T, F, F, F, T},
        {F, F, F, F, F, F, F, T},
    };

    private static boolean[][] TABELA07 = {
        {F, T, F, F, T, F, T, F},
        {F, F, T, T, F, T, T, F},
        {T, F, T, F, T, T, F, T},
    };

    private static boolean[][] TABELA08 = {
        {F, F, F, F, F},
        {F, T, T, F, T},
        {T, T, T, T, T},
    };

    private static boolean[][] TABELA09 = {
        {F, F, F, F, F, F},
        {T, T, T, T, T, F},
        {F, T, T, F, F, F},
    };

    private static boolean[][] TABELA10 = {
        {F, F, F},
        {T, F, T},
        {T, F, F},
    };

    public static void main(String[] args) {
        System.out.println("01: " + Prva.vednoBoljRes(TABELA01));
        System.out.println("02: " + Prva.vednoBoljRes(TABELA02));
        System.out.println("03: " + Prva.vednoBoljRes(TABELA03));
        System.out.println("04: " + Prva.vednoBoljRes(TABELA04));
        System.out.println("05: " + Prva.vednoBoljRes(TABELA05));
        System.out.println("06: " + Prva.vednoBoljRes(TABELA06));
        System.out.println("07: " + Prva.vednoBoljRes(TABELA07));
        System.out.println("08: " + Prva.vednoBoljRes(TABELA08));
        System.out.println("09: " + Prva.vednoBoljRes(TABELA09));
        System.out.println("10: " + Prva.vednoBoljRes(TABELA10));
    }
}
