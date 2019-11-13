package leetcode;

public class ValidPalindromeII {

    /*
    * Given a non-empty string s, you may delete at most one character.
    * Judge whether you can make it a palindrome.
    *
    * Example           Input: "abca"
    *                   Output: true
    */

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++; right--;
            } else {
                StringBuilder sb = new StringBuilder(s.substring(s.length() / 2, right + 1)).reverse();
                return s.substring(left + 1, (s.length() + 1) / 2).equals(sb.substring(0, sb.length() - 1))
                        || s.substring(left, (s.length() - 1) / 2).equals(sb.substring(1));
            }
        }
        return true;
    }
}