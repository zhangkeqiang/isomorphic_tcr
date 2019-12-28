import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class IsomorphicTest {

    @Test
    public void should_be_false_when_length_is_different() {
        Isomorphic isomorphic = new Isomorphic();

        boolean actual = isomorphic.check("a", "bc");

        assertFalse(actual);
    }
}
