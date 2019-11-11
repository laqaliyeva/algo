package leetcode;

public class ReverseStringII {

    /*
    * Given a string and an integer k, you need to reverse the first k characters for every
    * 2k characters counting from the start of the string. If there are less than k characters
    * left, reverse all of them. If there are less than 2k but greater than  or equal to k
    * characters, then reverse the first k characters and left the other as original.
    *
    * Example           Input: "abcdefg", k = 2
    *                   Output: "bacdfeg"
    */

    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int j = Math.min(i + k, s.length()) - 1;
            while (j >= i) {
                result.append(s.charAt(j--));
            }
            if (i + 2 * k <= s.length() || i + k <= s.length()) {
                result.append(s, i + k, Math.min(i + 2 * k, s.length()));
            }
        }
        return result.toString();
    }
}