package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1. Those numbers for
 * which this process ends in 1 are happy numbers.
 *
 * Example          Input: Input: 19                    Output: true
 *                  Explanation: 1^2 + 9^2 = 82
 *                               8^2 + 2^2 = 68
 *                               6^2 + 8^2 = 100
 *                               1^2 + 0^2 + 0^2 = 1
*/

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            n = getSquaresSum(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }

    private int getSquaresSum(int n) {
        int result = 0;
        while (n != 0) {
            result += Math.pow((n % 10), 2);
            n /= 10;
        }
        return result;
    }
}