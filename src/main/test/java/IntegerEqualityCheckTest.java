import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class IntegerEqualityCheckTest {

    @Test
    public void test() {

        assertTrue(IntegerEqualityCheck.isEqual(1, 1));
        assertTrue(IntegerEqualityCheck.isEqual(-2, -2));
        assertTrue(IntegerEqualityCheck.isEqual(999999, 999999));

        assertFalse(IntegerEqualityCheck.isEqual(2, 4));
        assertFalse(IntegerEqualityCheck.isEqual(-5, 5));
        assertFalse(IntegerEqualityCheck.isEqual(99999, 999999));
    }
}
