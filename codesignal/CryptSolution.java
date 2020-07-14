package codesignal;

/*
 * You have an array of strings (crypt), and a 2D array containing
 * the mapping of letters and digits (solution). Crypt array will contain
 * three non-empty strings that follow the structure: [word1, word2, word3],
 * which should be interpreted as the word1 + word2 = word3.
 *
 * If crypt, when it is decoded by replacing all of the letters with digits
 * using the mapping in solution, becomes a valid arithmetic equation containing
 * no numbers with leading zeroes, the answer is true. If it doesn't, the answer is false.
 *
 * Note that number 0 doesn't contain leading zeroes (while for example 00 or 0123 do).
 *
 * Example          Input: crypt = ["SEND", "MORE", "MONEY"]
 *                         solution = [['O', '0'],
 *                                     ['M', '1'],
 *                                     ['Y', '2'],
 *                                     ['E', '5'],
 *                                     ['N', '6'],
 *                                     ['D', '7'],
 *                                     ['R', '8'],
 *                                     ['S', '9']]
 *                  Output: true
*/

import java.util.HashMap;
import java.util.Map;

public class CryptSolution {

    public boolean isCryptSolution(String[] crypt, char[][] solution) {

        String word1 = crypt[0], word2 = crypt[1], word3 = crypt[2];

        // sum should not be shorter than the terms
        if (word3.length() < word1.length()
                || word3.length() < word2.length()) {
            return false;
        }

        // convert 2d array to map for convenience
        Map<Character, Integer> map = new HashMap<>();
        for (char[] pair : solution) {
            map.put(pair[0], Character.getNumericValue(pair[1]));
        }

        // ensure no trailing zeros except for number 0
        if ((word1.length() > 1 && map.get(word1.charAt(0)) == 0)
                || (word2.length() > 1 && map.get(word2.charAt(0)) == 0)
                || (word3.length() > 1 && map.get(word3.charAt(0)) == 0)) {
            return false;
        }

        // start summing by column
        int carry = 0;
        int idx1 = word1.length() - 1, idx2 = word2.length() - 1,
                idx3 = word3.length() - 1;

        while (idx1 >= 0 || idx2 >= 0) {
            int value1 = 0, value2 = 0;
            if (idx1 >= 0) {
                value1 = map.get(word1.charAt(idx1));
            }
            if (idx2 >= 0) {
                value2 = map.get(word2.charAt(idx2));
            }
            int value3 = map.get(word3.charAt(idx3));

            int sum = value1 + value2 + carry;

            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            if (sum != value3) return false;

            idx1--; idx2--; idx3--;
        }
        // check if carry is left
        if (carry == 1) {
            return idx3 == 0 && map.get(word3.charAt(idx3)) == carry;
        } else {
            return idx3 < 0;
        }
    }
}