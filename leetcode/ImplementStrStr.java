package leetcode;

public class ImplementStrStr {

    /*
    * Implement strStr(). Return the index of the first occurrence
    * of needle in haystack, or -1 if needle is not part of haystack.
    * Return 0, when needle is an empty string.
    *
    * Example           Input: haystack = "hello", needle = "ll"
    *                   Output: 2
    *
    *                   Input: haystack = "aaaaa", needle = "bba"
    *                   Output: -1
    */

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j;
                }
            } else {
                if (j == 0) {
                    i++;
                } else {
                    i = i - j + 1;
                    j = 0;
                }
            }
        }
        return -1;
    }
}