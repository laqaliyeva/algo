package leetcode;

public class ReshapeMatrix {

    /*
    * You're given a matrix represented by a two-dimensional array,
    * and two positive integers r and c representing the row number
    * and column number of the wanted reshaped matrix, respectively.
    *
    * The reshaped matrix need to be filled with all the elements of
    * the original matrix in the same row-traversing order as they were.
    *
    * If the 'reshape' operation with given parameters is possible and legal,
    * output the new reshaped matrix; Otherwise, output the original matrix.
    *
    * Example           Input: [[1,2], [3,4]], r = 1, c = 4
    *                   Output: [[1,2,3,4]]
    *
    *                   Input: [[1,2], [3,4]], r = 2, c = 4
    *                   Output: [[1,2], [3,4]]
    */

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums[0].length * nums.length != r * c) {
            return nums;
        }
        int[][] reshaped = new int[r][c];
        int rowNum = 0, rRowNum = 0;
        int colNum = 0, rColNum = 0;
        while (rowNum < nums.length) {
            reshaped[rRowNum][rColNum++] = nums[rowNum][colNum++];
            if (colNum == nums[0].length) {
                rowNum++;
                colNum = 0;
            }
            if (rColNum == c) {
                rRowNum++;
                rColNum = 0;
            }
        }
        return reshaped;
    }
}