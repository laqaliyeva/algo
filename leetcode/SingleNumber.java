package leetcode;

/*
 * Given a non-empty array of integers, every element
 * appears twice except for one. Find that single one.
 *
 * Example          Input: [2,2,1]
 *                  Output: 1
*/

import java.util.Arrays;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int res = nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i++;
            }
        }
        return res;
    }
}