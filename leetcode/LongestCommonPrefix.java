package leetcode;

public class LongestCommonPrefix {

    /*
    * Write a function to find the longest common prefix string amongst an array of strings.
    * If there is no common prefix, return an empty string "".
    *
    * Example           Input: ["flower","flow","flight"]
    *                   Output: "fl"
    *
    *                   Input: ["dog","racecar","car"]
     *                  Output: ""
    */

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length - 1; i++) {
            int j = 0;
            minLength = Math.min(strs[i + 1].length(), minLength);
            while (j < minLength) {
                if (strs[i + 1].charAt(j) == strs[i].charAt(j)) {
                    j++;
                } else {
                    break;
                }
            }
            minLength = j;
        }
        return strs[0].substring(0, minLength);
    }
}