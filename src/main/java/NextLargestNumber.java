

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Given a number, find the next largest number using the same digits as the number provided. If a larger number cant be
 * generated, return -1
 * ie arg 512 return 521
 * arg 21 return -1
 * arg 87 return -1
 * arg 363 return 633
 */
public class NextLargestNumber {

    public static int generateNextLargestNumber(int n) {

        // CLUE 1: find the maximum possible number it could be
        // hint : you will need to sort something into descending order

        // CLUE 2: you simply need to increment from 'n' to the maximum possible number
        // checking that the new number generated contains the same digits as 'n'
        // hint : you only need 1 for loop in this solution

        String numS = String.valueOf(n);
        ArrayList<String> allPossibleCombos = new ArrayList<String>();

        for (int i = 0; i < numS.length(); i++) {

            int lastIndex = numS.length() - 1;
            String last = numS.substring(lastIndex);
            String rest = numS.substring(0, lastIndex);
            String num = last + rest;

            char[] numArray = num.toCharArray();
            Random rand = new Random();
            int position = rand.nextInt(num.length());

            char[] digits = new char[num.length()];


            for (int d = 0; d < num.length(); d++) {

                digits[position] = numArray[d];
                char x = numArray[d];

                numArray = ArrayUtils.removeElement(numArray, x);

            }

            String newDigitCombo = String.valueOf(digits);

            allPossibleCombos.add(newDigitCombo);

        }

        List<Integer> arrayOfInts = new ArrayList<Integer>();
        for (Object str : allPossibleCombos) {
            arrayOfInts.add(Integer.parseInt((String) str));
        }

        List<Integer> greaterArray = new ArrayList<Integer>();
        {
            for(int a = 0; a < arrayOfInts.size(); a++){
                int x = arrayOfInts.get(a);
                if(x > n){
                    greaterArray.add(x);
                }
            }
        }

        int result = greaterArray.get(0);

        if (result == 0){
            return -1;
        }
        else
        {
            return result;
        }

    }
}
