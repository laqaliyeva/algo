package leetcode;

public class FirstUniqueCharacter {

    /*
    * Given a string, find the first non-repeating character in it
    * and return it's index. If it doesn't exist, return -1.
    * Assume the string contain only lowercase letters.
    *
    * Example           Input: "leetcode"
    *                   Output: 0
    *
    *                   Input: "loveleetcode"
    *                   Output: 2
    */

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }
}