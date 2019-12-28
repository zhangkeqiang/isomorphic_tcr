import java.util.Arrays;
import java.util.stream.IntStream;

public class Isomorphic {

    public boolean check(String one, String another) {
        //a - b is true
        if (Arrays.equals(indexesOf(one), indexesOf(another))) {
            return true;
        }
        return false;
    }

    private int[] indexesOf(String one) {
        return IntStream.range(0, one.length()).toArray();
    }
}
