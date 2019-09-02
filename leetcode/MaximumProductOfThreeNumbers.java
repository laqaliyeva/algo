package leetcode;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

    /*
    * Given an integer array, find three numbers whose product is maximum and output the maximum product.
    *
    * Example           Input: [-4,-3,-2,-1,60]
    *                   Output: 720
    */

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product = nums[nums.length - 1];
        product *= Math.max(nums[nums.length - 2] * nums[nums.length - 3], nums[0] * nums[1]);
        return product;
    }
}