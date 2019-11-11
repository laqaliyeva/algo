package leetcode;

public class LongestUncommonSubsequenceI {

    /*
    * Given a group of two strings, you need to find the length of the
    * longest uncommon subsequence of this group of two strings.
    * If it doesn't exist, return -1.
    *
    * Example           Input: "aba", "cdc"
    *                   Output: 3
    */

    public static int findLUSlength(String a, String b) {
        if (a.equals(b)) {
                return -1;
        } else {
            return Math.max(a.length(), b.length());
        }
    }
}