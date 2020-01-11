package leetcode;

/*
 * Given an array A of integers, for each integer A[i] we may choose
 * any x with -K <= x <= K, and add x to A[i]. After this process, we
 * have some array B. Return the smallest possible difference between
 * the maximum value of B and the minimum value of B.
 *
 * Example          Input: A = [1], K = 0
 *                  Output: 0
 *
 *                  Input: A = [0,10], K = 2
 *                  Output: 6
 *
 *                  Input: A = [1,3,6], K = 3
 *                  Output: 0
*/

public class SmallestRangeI {

    public static int smallestRangeI(int[] A, int K) {
        int max = A[0];
        int min = max;
        for (int val : A) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }
        return Math.max(0, max - min - 2 * K);
    }
}