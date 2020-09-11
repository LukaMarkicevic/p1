
import java.util.*;

public class PresekMnozic {

    public static <T> Set<T> presek(Collection<Set<T>> mnozice) {
        Iterator<Set<T>> asd = mnozice.iterator();
        Set<T> vrni = asd.next();
        while (asd.hasNext()) {
            Set<T> temp = asd.next();
            vrni.retainAll(temp);
        }
        return vrni;

    }

}