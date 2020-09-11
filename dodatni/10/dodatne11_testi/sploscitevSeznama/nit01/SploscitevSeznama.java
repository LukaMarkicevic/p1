
import java.util.*;

public class SploscitevSeznama {

    public static <T> List<T> splosci(List<List<T>> seznami) {
        List<T> asd = new ArrayList<T>();
        int independant = 0;
        for (int i = 0; i < seznami.size(); i++) {
            List<T> temp = seznami.get(i);
            for (int j = 0; j < temp.size(); j++) {
                asd.add(independant++, temp.get(j));
            }
        }

        return asd;
    }

}