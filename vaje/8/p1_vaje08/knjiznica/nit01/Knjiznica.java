
public class Knjiznica {
    int stClanov;
    int stNaslovov;
    int stIzvodovNaNaslov;
    boolean tabela[][];
    int tabela2[];
    int tabela3[];

    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov) {
        this.stClanov = stClanov;
        this.stNaslovov = stNaslovov;
        this.stIzvodovNaNaslov = stIzvodovNaNaslov;
        this.tabela = new boolean[stClanov][stNaslovov];
        this.tabela2 = new int[stNaslovov];
        this.tabela3 = new int[stNaslovov];
        for (int i = 0; i < stNaslovov; i++) {
            tabela2[i] = stIzvodovNaNaslov;
        }
        for (int i = 0; i < stNaslovov; i++) {
            tabela3[i] = 0;
        }
    }

    public boolean posodi(int clan, int naslov) {
        if (!tabela[clan][naslov] && tabela2[naslov] != 0) {
            tabela[clan][naslov] = true;
            tabela2[naslov]--;
            tabela3[naslov]++;
            return true;
        }
        return false;
    }

    public void clanVrne(int clan) {
        for (int i = 0; i < stNaslovov; i++) {
            if (tabela[clan][i]) {
                tabela2[i]++;
                tabela[clan][i] = false;
            }
        }
    }

    public int posojeni(int naslov) {
        int sum = 0;
        for (int i = 0; i < stClanov; i++) {
            if (tabela[i][naslov]) {
                sum++;
            }
        }
        return sum;
    }

    public int priClanu(int clan) {
        int sum = 0;
        for (int i = 0; i < stNaslovov; i++) {
            if (tabela[clan][i]) {
                sum++;
            }
        }
        return sum;
    }

    public int najNaslov() {
        int indeks = 0;
        int maks = Integer.MIN_VALUE;

        for (int j = 0; j < stNaslovov; j++) {
            if (tabela3[j] > maks) {
                maks = tabela3[j];
                indeks = j;
            }

        }

        return indeks;
    }
}
