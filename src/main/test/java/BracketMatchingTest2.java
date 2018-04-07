import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BracketMatchingTest2 {

    @Test
    public void test() {

        assertTrue(BracketMatching.isValidMatch("()"));
        assertTrue(BracketMatching.isValidMatch("[]"));
        assertTrue(BracketMatching.isValidMatch("()"));

        assertTrue(BracketMatching.isValidMatch("([])"));
        assertTrue(BracketMatching.isValidMatch("(([]))"));
        assertTrue(BracketMatching.isValidMatch("[]()"));
        assertTrue(BracketMatching.isValidMatch("([]{})"));

        assertFalse(BracketMatching.isValidMatch("("));
        assertFalse(BracketMatching.isValidMatch("{"));
        assertFalse(BracketMatching.isValidMatch("["));

        assertFalse(BracketMatching.isValidMatch(")"));
        assertFalse(BracketMatching.isValidMatch("}"));
        assertFalse(BracketMatching.isValidMatch("]"));

        assertFalse(BracketMatching.isValidMatch("(]"));
        assertFalse(BracketMatching.isValidMatch("[}"));
        assertFalse(BracketMatching.isValidMatch("(])"));

    }
}
