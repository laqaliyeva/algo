package leetcode;

/*
 * Given a string s and a string t, check if s is subsequence of t.
 *
 * A subsequence of a string is a new string which is formed from the
 * original string by deleting some (can be none) of the characters
 * without disturbing the relative positions of the remaining characters.
 *
 * Example          Input: s = "abc", t = "ahbgdc"
 *                  Output: true
 *
 *                  Input: s = "axc", t = "ahbgdc"
 *                  Output: false
*/

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        int i = 0;
        for (int j = i; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }
}