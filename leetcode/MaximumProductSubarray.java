package leetcode;

/*
 * Given an integer array nums, find the contiguous subarray within an array
 * (containing at least one number) which has the largest product.
 *
 * Example          Input: [2,3,-2,4]
 *                  Output: 6
 *
 *                  Input: [2,-5,-2,-4,3]
 *                  Output: 24
*/

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int minProd = nums[0];
        int maxProd = nums[0];
        int prod = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = minProd;
                minProd = maxProd;
                maxProd = tmp;
            }
            minProd = Math.min(nums[i], minProd * nums[i]);
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            prod = Math.max(prod, maxProd);
        }
        return prod;
    }
}