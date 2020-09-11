
public class Test28 {

    private static final boolean T = true;
    private static final boolean F = false;

    private static boolean[][] TABELA01 = {
        {F},
        {F},
    };

    private static boolean[][] TABELA02 = {
        {T, T, T, T, T},
        {T, F, T, T, T},
    };

    private static boolean[][] TABELA03 = {
        {F},
        {T},
    };

    private static boolean[][] TABELA04 = {
        {F, T, T},
        {F, F, F},
    };

    private static boolean[][] TABELA05 = {
        {T, F, T, T, F, T},
        {F, F, T, T, F, F},
    };

    private static boolean[][] TABELA06 = {
        {T, F},
        {T, T},
    };

    private static boolean[][] TABELA07 = {
        {F, F, F},
        {T, T, T},
    };

    private static boolean[][] TABELA08 = {
        {F, T, T},
        {T, T, T},
    };

    private static boolean[][] TABELA09 = {
        {F, T, F, F, F, F},
        {F, T, F, F, F, F},
    };

    private static boolean[][] TABELA10 = {
        {F, F, F, F, F},
        {F, F, F, T, F},
    };

    public static void main(String[] args) {
        System.out.println(Prva.vednoBoljRes(TABELA01));
        System.out.println(Prva.vednoBoljRes(TABELA02));
        System.out.println(Prva.vednoBoljRes(TABELA03));
        System.out.println(Prva.vednoBoljRes(TABELA04));
        System.out.println(Prva.vednoBoljRes(TABELA05));
        System.out.println(Prva.vednoBoljRes(TABELA06));
        System.out.println(Prva.vednoBoljRes(TABELA07));
        System.out.println(Prva.vednoBoljRes(TABELA08));
        System.out.println(Prva.vednoBoljRes(TABELA09));
        System.out.println(Prva.vednoBoljRes(TABELA10));
    }
}
