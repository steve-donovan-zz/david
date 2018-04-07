import sun.reflect.generics.reflectiveObjects.NotImplementedException;


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
        if (brackets.length() % 2 == 0) {

            String firstHalf = brackets.substring(0, (brackets.length() / 2));
            String secondHalf = brackets.substring((brackets.length() / 2));

            String stage1 = new StringBuilder(firstHalf).reverse().toString();
            String stage2 = stage1.replaceAll("\\[", "]");
            String stage3 = stage2.replaceAll("\\(", ")");
            String stage4 = stage3.replaceAll("\\{", "}");



            return ( secondHalf.equals(stage4));


        } else {
            return false;
        }

    }
}
