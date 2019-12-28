import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicTest {

    @Test
    public void should_be_false_when_length_is_different() {
        Isomorphic isomorphic = new Isomorphic();

        assertFalse(isomorphic.check("a", "bc"));
    }

    @Test
    public void should_be_true_when_equals() {
        Isomorphic isomorphic = new Isomorphic();

        assertTrue(isomorphic.check("a", "a"));
    }
}
