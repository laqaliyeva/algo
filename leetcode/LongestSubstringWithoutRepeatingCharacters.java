package leetcode;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example          Input: "abcabcbb"
 *                  Output: 3
*/

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = sb.toString().indexOf(s.charAt(i));
            if (idx != -1) {
                length = Math.max(length, sb.length());
                sb = new StringBuilder(idx + 1 < sb.length() ? sb.substring(idx + 1) : "");
            }
            sb.append(s.charAt(i));
        }
        length = Math.max(length, sb.length());
        return length;
    }
}