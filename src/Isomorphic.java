import java.util.Arrays;
import java.util.stream.IntStream;

public class Isomorphic {

    public boolean check(String one, String another) {
        //a - b is true
        if (Arrays.equals(IntStream.range(0, one.length()).toArray(), IntStream.range(0, another.length()).toArray())) {
            return true;
        }
        return false;
    }
}
