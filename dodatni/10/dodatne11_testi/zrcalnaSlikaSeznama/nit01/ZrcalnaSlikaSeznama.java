
import java.util.*;

public class ZrcalnaSlikaSeznama {

    public static <T> List<T> zrcalnaSlika(List<T> seznam) {
        List<T> asd = new ArrayList<>();
        int index = seznam.size() - 1;

        // System.out.println(index);

        for (int i = 0; i < seznam.size(); i++) {
            asd.add(i, seznam.get(index - i));
        }
        return asd;
    }

}