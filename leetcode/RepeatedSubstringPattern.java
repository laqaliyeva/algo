package leetcode;

public class RepeatedSubstringPattern {

    /*
    * Given a non-empty string check if it can be constructed by taking a substring of it and appending
    * multiple copies of the substring together. You may assume the given string consists of lowercase
    * English letters only and its length will not exceed 10000.
    *
    * Example           Input: "abcabcabcabc"
    *                   Output: true ("abc" four times)
    *
    *                   Input: "aba"
    *                   Output: false
    */

    public static boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() <= 1) {
            return false;
        }
        int i = 1;
        boolean result = false;
        String pattern = s.substring(0, 1);
        while (i + pattern.length() <= s.length()) {
            if (s.length() % pattern.length() == 0 && pattern.equals(s.substring(i, i + pattern.length()))) {
                i += pattern.length();
                result = true;
            } else {
                pattern = s.substring(0, pattern.length() + 1);
                i = pattern.length();
                result = false;
            }
        }
        return result && s.length() % pattern.length() == 0;
    }
}