package leetcode;

public class MaximumAverageSubarrayI {

    /*
    * Given an array consisting of n integers, find the contiguous
    * subarray of given length k that has the maximum average value.
    * And you need to output the maximum average value.
    *
    * Example           Input: [1, 12, -5, -6, 50, 3], k = 4
                        Output: 12.75
    */

    public static double findMaxAverage(int[] nums, int k) {
        double sum = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            sum = Math.max(sum, kSum(nums, k, i));
        }
        return sum/k;
    }

    private static int kSum(int [] nums, int k, int i) {
        int kSum = 0;
        int j = i;
        while (j < i+k) {
            kSum += nums[j++];
        }
        return kSum;
    }
}