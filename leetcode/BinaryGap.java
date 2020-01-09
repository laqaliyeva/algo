package leetcode;

/*
 * Given a positive integer N, find and return the longest distance
 * between two consecutive 1's in the binary representation of N.
 * If there aren't two consecutive 1's, return 0.
 *
 * Example          Input: 22
 *                  Output: 2
 *
 *                  Input: 6
 *                  Output: 1
 *
 *                  Input: 8
 *                  Output: 0
*/

public class BinaryGap {

    public static int binaryGap(int N) {
        String s = Integer.toBinaryString(N);
        int last = 0;
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                result = Math.max(result, i - last);
                last = i;
            }
        }
        return result;
    }
}