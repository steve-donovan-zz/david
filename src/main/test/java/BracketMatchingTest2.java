import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BracketMatchingTest2 {

    @Test
    public void test() {

        assertTrue(BracketMatching2.isValidMatch("()"));
        assertTrue(BracketMatching2.isValidMatch("[]"));
        assertTrue(BracketMatching2.isValidMatch("()"));

        assertTrue(BracketMatching2.isValidMatch("([])"));
        assertTrue(BracketMatching2.isValidMatch("(([]))"));
        assertTrue(BracketMatching2.isValidMatch("[]()"));
        assertTrue(BracketMatching2.isValidMatch("([]{})"));

        assertFalse(BracketMatching2.isValidMatch("("));
        assertFalse(BracketMatching2.isValidMatch("{"));
        assertFalse(BracketMatching2.isValidMatch("["));

        assertFalse(BracketMatching2.isValidMatch(")"));
        assertFalse(BracketMatching2.isValidMatch("}"));
        assertFalse(BracketMatching2.isValidMatch("]"));

        assertFalse(BracketMatching2.isValidMatch("(]"));
        assertFalse(BracketMatching2.isValidMatch("[}"));
        assertFalse(BracketMatching2.isValidMatch("(])"));

    }
}
