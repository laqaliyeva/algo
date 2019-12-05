package leetcode;

/*
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example          Input: 3            Output: 0
 *                  Input: 5            Output: 2
*/

public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int res = 0;
        while (n >= 5) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }
}