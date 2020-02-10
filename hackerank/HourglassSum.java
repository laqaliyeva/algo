package hackerank;

/*
 * https://www.hackerrank.com/challenges/2d-array
*/

public class HourglassSum {

    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                sum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                sum += arr[i + 1][j + 1];
                sum += arr[i + 2][j] +  arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}