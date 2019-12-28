import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Isomorphic {

    public boolean check(String one, String another) {
        //a - b is true
        return Arrays.equals(indexesOf(one), indexesOf(another));
    }

    private int[] indexesOf(String one) {
        List<Integer> distinctChars = one.chars().distinct().boxed().collect(toList());
        int[] indexArray = one.chars().map(distinctChars::indexOf).toArray();
        return indexArray;
    }
}
