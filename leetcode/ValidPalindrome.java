package leetcode;

public class ValidPalindrome {

    /*
    * Given a string, determine if it is a palindrome,
    * considering only alphanumeric characters and ignoring cases.
    * Consider empty string as valid palindrome.
    *
    * Example           Input: "A man, a plan, a canal: Panama"
    *                   Output: true
    */

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
}