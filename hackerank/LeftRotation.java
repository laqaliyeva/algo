package hackerank;

/*
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
*/

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int[] rotatedArr = new int[a.length];
        d  = d % a.length;
        for (int i = 0; i < a.length; i++) {
            if (i + d > a.length - 1) {
                rotatedArr[i] = a[(i + d) % a.length];
            } else {
                rotatedArr[i] = a[i + d];
            }
        }
        return rotatedArr;
    }
}