package leetcode;

/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Note: Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 *
 * Example          Input: 321              Output: 123
 * Example          Input: -120             Output: -21
 *                  Input: -2147483648      Output: 0
*/

public class ReverseInteger {

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result > (Integer.MAX_VALUE - 7) / 10) return 0;
            if (result < (Integer.MIN_VALUE + 8) / 10) return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}