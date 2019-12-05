package leetcode;

/*
 * Determine whether an integer is a palindrome.
 *
 * Example          Input: 121          Output: true
 *                  Input: -121         Output: false
 *                  Input: 10           Output: false
*/

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            if (reversed > (Integer.MAX_VALUE - 7) / 10) return false;
            if (reversed < (Integer.MIN_VALUE + 8) / 10) return false;
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return reversed == x;
    }
}