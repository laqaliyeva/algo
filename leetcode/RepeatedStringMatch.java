package leetcode;

public class RepeatedStringMatch {

    /*
    * Given two strings A and B, find the minimum number of times A has to be repeated
    * such that B is a substring of it. If no such solution, return -1.
    *
    * Example           Input: A = "abcd" and B = "cdabcdab"
    *                   Output: 3 ("abcdabcdabcd" contains B)
    */

    public static int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
        }
        if (sb.indexOf(B) != -1 || sb.append(A).indexOf(B) != -1) {
            return sb.length() / A.length();
        }
        return -1;
    }
}