package leetcode;

/*
 * A binary matrix means that all elements are 0 or 1. For each individual row of the matrix,
 * this row is sorted in non-decreasing order. Given a row-sorted binary matrix binaryMatrix,
 * return leftmost column index with at least a 1 in it. If such index doesn't exist, return -1.
 * You can't access the Binary Matrix directly. You may only access the matrix using a BinaryMatrix interface:
 *      BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y) (0-indexed).
 *      BinaryMatrix.dimensions() returns a list of 2 elements [m, n], which means the matrix is m * n.
 * Submissions making more than 1000 calls to BinaryMatrix.get will be judged Wrong Answer.
 *
 * Example          Input: [[0,0],[1,1]]
 *                  Output: 0
 *
 *                  Input: [[0,0],[0,0]]
 *                  Output: -1
 *
 *                  Input: [[0,0,0,1],[0,0,1,1],[0,1,1,1]]
 *                  Output: 1
*/

import java.util.List;

public class LeftmostColumnWithOne {

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int m = dimensions.get(0);
        int n = dimensions.get(1);
        int last = -1;
        int i = n - 1;
        int j = 0;
        while (i >= 0 || j <= m - 1) {
            i = Math.max(i, 0);
            j = Math.min(j, m - 1);
            if (binaryMatrix.get(j, i) == 1) {
                last = i;
                i--;
            } else {
                j++;
            }
            if (i == -1 || j == m) break;
        }
        return last;
    }

    interface BinaryMatrix {
        int get(int x, int y);
        List<Integer> dimensions();
    }
}