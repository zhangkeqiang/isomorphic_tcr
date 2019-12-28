import java.util.Arrays;
import java.util.stream.IntStream;

public class Isomorphic {

    public boolean check(String one, String another) {
        //a - b is true
        return Arrays.equals(indexesOf(one), indexesOf(another));
    }

    private int[] indexesOf(String one) {
        int[] distinctChars = one.chars().distinct().toArray();
        return IntStream.range(0, one.length()).toArray();
    }
}
