package leetcode;

/*
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example          Input: 16             Output: true
 *
 *                  Input: 218            Output: false
*/

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n > 1) {
            if (n % 2 > 0) return false;
            n /= 2;
        }
        return true;
    }
}