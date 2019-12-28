public class Isomorphic {

    public boolean check(String one, String another) {
        //a - a is false
        if (one.equals(another)) {
            return true;
        }
        return false;
    }
}
