/*
 * Given a String please test that all brackets are matching pairs and in valid nestings
 * ie
 * example String "[[({})]]"
 * valid "[]"
 * valid "([])"
 * invalid "[][]"
 * invalid "("
 * invalid "(()"
 */
public class BracketMatching {

    public static boolean isValidMatch(String brackets) {

        if (brackets.length() % 2 == 0) {

            String firstHalf = brackets.substring(0, (brackets.length() / 2));
            String secondHalf = brackets.substring((brackets.length() / 2));

            String secondHalf2 = "";
            String secondHalf3 = "";
            String secondHalf4 = "";

            if (secondHalf.indexOf('[') > 0){
                secondHalf2 = secondHalf.replaceAll("\\[", "]");
            }
            if (secondHalf.indexOf('(') > 0){
                secondHalf3 = secondHalf2.replaceAll("\\(", ")");
            }
            if (secondHalf.indexOf('(') > 0){
                secondHalf4 = secondHalf3.replaceAll("\\{", "}");
            }


            return ( new StringBuilder(firstHalf).reverse().toString() == secondHalf4);


        } else {
            return false;
        }


    }


}




