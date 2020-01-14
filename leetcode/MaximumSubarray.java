package leetcode;

/*
 * Given an integer array nums, find the contiguous subarray (containing
 * at least one number) which has the largest sum and return its sum.
 *
 * Example          Input: [-2,1,-3,4,-1,2,1,-5,4]
 *                  Output: 6
*/

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int prevSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prevSum = Math.max(nums[i], nums[i] + prevSum);
            sum = Math.max(sum, prevSum);
        }
        return sum;
    }
}