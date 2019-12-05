package leetcode;

/*
 * Implement int sqrt(int x).
*/

public class SqrtX {

    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1;
        int right = x;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (mid > x / mid) {
                right = mid - 1;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                break;
            }
            mid = left + (right - left) / 2;
        }
        return mid;
    }
}