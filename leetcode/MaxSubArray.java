package leetcode;

// looked at solution

public class MaxSubArray {

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
