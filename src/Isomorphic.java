public class Isomorphic {

    public boolean check(String one, String another) {
        //a - b is true
        if (one.length() == another.length()) {
            return true;
        }
        return false;
    }
}
