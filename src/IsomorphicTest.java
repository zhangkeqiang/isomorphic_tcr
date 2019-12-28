import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicTest {

    Isomorphic isomorphic = new Isomorphic();

    @Test
    public void should_be_false_when_length_is_different() {
        assertFalse(isomorphic.check("a", "bc"));
    }

    @Test
    public void should_be_true_when_equals() {
        assertTrue(isomorphic.check("a", "a"));
    }

    @Test
    public void should_be_true_when_length_is_same_and_no_duplication_char() {
        assertTrue(isomorphic.check("a", "b"));
        assertTrue(isomorphic.check("ab", "dc"));
    }

    @Test
    public void should_be_false_when_length_is_same_but_one_has_duplicated_char() {
        assertFalse(isomorphic.check("ab", "dd"));
    }

    @Test
    public void acceptance_tests() {
        assertTrue(isomorphic.check("egg", "add"));
        assertFalse(isomorphic.check("foo", "bar"));
        assertTrue(isomorphic.check("addanegg", "teetabdd"));
    }

}
