import java.util.Arrays;

import static java.util.Arrays.asList;

public class Isomorphic {

    public boolean check(String one, String another) {
        //a - b is true
        return Arrays.equals(indexesOf(one), indexesOf(another));
    }

    private int[] indexesOf(String one) {
        int[] distinctChars = one.chars().distinct().toArray();
        int[] indexArray = one.chars().map(c -> asList(distinctChars).indexOf(c)).toArray();
        return indexArray;
    }
}
