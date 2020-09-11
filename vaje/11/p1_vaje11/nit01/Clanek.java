
import java.util.*;

public class Clanek implements Comparable<Clanek> {

    private List<Avtor> avtorji;
    private String naslov;
    private int leto;

    public Clanek(List<Avtor> avtorji, String naslov, int leto) {
        this.avtorji = avtorji;
        this.naslov = naslov;
        this.leto = leto;
    }

    @Override
    public String toString() {
        String strAvtorji = this.avtorji.toString();
        return String.format("%s: %s (%d)", strAvtorji.substring(1, strAvtorji.length() - 1), this.naslov, this.leto);
    }

    public List<Avtor> getAvtorji() {
        return this.avtorji;
    }

    @Override
    public int compareTo(Clanek o) {
        if (this.leto != o.leto) {
            return o.leto - this.leto;
        }
        return this.naslov.compareTo(o.naslov);
    }
}
