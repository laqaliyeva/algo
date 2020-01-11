package leetcode;

/*
 * Given an array nums of n integers where n > 1, return an array output such that
 * output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example          Input: [1,2,3,4]
 *                  Output: [24,12,8,6]
*/

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prevI = 1;
        int prevJ = 1;
        Arrays.fill(ans, 1);
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            ans[i] *= prevI;
            prevI *= nums[i];
            ans[j] *= prevJ;
            prevJ *= nums[j];
        }
        return ans;
    }
}