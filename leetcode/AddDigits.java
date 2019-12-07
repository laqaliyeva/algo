package leetcode;

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * Example          Input: 38           Output: 2
*/

public class AddDigits {

    public int addDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        if (result < 10) {
            return result;
        } else {
            return addDigits(result);
        }
    }
}