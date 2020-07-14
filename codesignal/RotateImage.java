package codesignal;

/*
 * You are given an n x n 2D matrix that represents an image.
 * Rotate the image by 90 degrees (clockwise).
 *
 * Example          Input: [[1, 2, 3],          Output: [[7, 4, 1],
 *                          [4, 5, 6],                   [8, 5, 2],
 *                          [7, 8, 9]]                   [9, 6, 3]]
*/

public class RotateImage {

    public int[][] rotateImage(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = tmp;
            }
        }
        return arr;
    }
}