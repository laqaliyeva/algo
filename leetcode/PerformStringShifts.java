package leetcode;

/*
 * You are given a string s containing lowercase English letters, and a matrix shift,
 * where shift[i] = [direction, amount]:
 *      direction can be 0 (for left shift) or 1 (for right shift).
 *      amount is the amount by which string s is to be shifted.
 *      A left shift by 1 means remove the first character of s and append it to the end.
 *      Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
 * Return the final string after all operations.
 *
 * Example          Input: s = "abc", shift = {{0,1}, {1,2}}
 *                  Output: "cab"
 *
 *                  Input: s = "abcdefg", shift = {{1,1}, {1,1}, {0,2}, {1,3}}
 *                  Output: "efgabcd"
*/

public class PerformStringShifts {

    public String stringShift(String s, int[][] shift) {
        if (s.length() == 1) return s;
        int totalShift = 0;
        for (int[] arr : shift) {
            if (arr[0] == 0) {
                totalShift -= arr[1];
            } else {
                totalShift += arr[1];
            }
        }
        totalShift %= s.length();
        String result = s;
        if (totalShift < 0) {
            totalShift *= -1;
            result = s.substring(totalShift) + s.substring(0, totalShift);
        } else if (totalShift > 0) {
            result = s.substring(s.length() - totalShift) + s.substring(0, s.length() - totalShift);
        }
        return result;
    }
}