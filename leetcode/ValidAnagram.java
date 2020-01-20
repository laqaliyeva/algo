package leetcode;

/*
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 *
 * Example          Input: s = "anagram", t = "nagaram"
 *                  Output: true
 */

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int sumS = 0, sumT = 0;
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i)) == -1) {
                return false;
            }
            sumS += s.charAt(i);
            sumT += t.charAt(i);
        }
        return sumS == sumT;
     }
}