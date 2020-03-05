package leetcode;

/*
 * Given a string s, count the number of non-empty (contiguous) substrings that have the same number
 * of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 * Example:         Input: "00110011"
 *                  Output: 6 (01, 0011, 10, 1100, 01, 0011)
 */

import java.util.ArrayList;
import java.util.List;

public class CountBinarySubstrings {

    public static int countBinarySubstrings(String s) {
        int res = 0;
        int count = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                list.add(count);
                count = 1;
            }
        }
        list.add(count);
        int prev = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            res += Math.min(current, prev);
            prev = current;
        }
        return res;
    }
}