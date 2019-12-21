package leetcode;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int sqrt = findSqrt(num);
        return sqrt * sqrt == num;
    }

    private int findSqrt(int num) {
        if (num == 0 || num == 1) return num;
        int start = 1;
        int end = num;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (mid == num / mid) {
                return mid;
            } else if (mid > num / mid) {
                end = mid - 1;
            } else if (mid < num / mid){
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return mid;
    }
}