package leetcode;

/*
 * Given an m * n matrix M initialized with all 0's and several update operations.
 * Operations are represented by a 2D array, and each operation is represented by
 * an array with two positive integers a and b, which means M[i][j] should be added
 * by one for all 0 <= i < a and 0 <= j < b.You need to count and return the number
 * of maximum integers in the matrix after performing all the operations.
 *
 * Example          Input: m = 3, n = 3, operations = [[2,2],[3,3]]
 *                  Output: 4
*/

public class RangeAdditionII {

    public int maxCount(int m, int n, int[][] ops) {
        int minX = m;
        int minY = n;
        for (int[] op : ops) {
            if (op[0] < minX) {
                minX = op[0];
            }
            if (op[1] < minY) {
                minY = op[1];
            }
        }
        return minX * minY;
    }
}