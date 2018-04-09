


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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


        int num = n;
        char[] numArray = String.valueOf(num).toCharArray();
        Arrays.sort(numArray);
        int backup = num;
        List<Integer> digits = new ArrayList<Integer>();

        while (num > 0) {
            int lastNum = num % 10;
            digits.add(lastNum);
            num = num / 10;
        }

        Collections.sort(digits);
        Collections.reverse(digits);


        StringBuilder builder = new StringBuilder();
        for (int i : digits) {
            builder.append(i);
        }
        String maxNumS = builder.toString();
        int maxNum = Integer.parseInt(maxNumS);


        int result = 0;

        if (backup == maxNum) {
            result = -1;
        } else {
            for (int i = backup + 1; i <= maxNum; i++) {

                char[] numbers = String.valueOf(i).toCharArray();
                Arrays.sort(numbers);
                if (Arrays.equals(numArray, numbers)) {
                    result = i;
                    break;
                }
            }

        }


        return result;

    }


}






