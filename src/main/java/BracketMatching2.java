

import java.util.HashMap;
import java.util.Stack;


/*
 * Given a String please test that all brackets are matching pairs and in valid nestings
 * ie
 * example String "[[({})]]"
 * valid "[]"
 * valid "([])"
 * valid "[][]"
 * valid "[(){}]"
 * invalid "("
 * invalid "(()"
 */
public class BracketMatching2 {

    public static boolean isValidMatch(String brackets) {

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < brackets.length(); i++) {
            char curr = brackets.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

}