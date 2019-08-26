package leetcode;

import java.util.*;

public class ThirdMaximumNumber {

    /*
    * Given a non-empty array of integers,
    * return the third maximum number in this array.
    * If it does not exist, return the maximum number.
    * The time complexity must be in O(n).
    */

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int result = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            set.add(nums[i]);
            if (set.size() == 3) {
                return nums[i];
            }
        }
        return result;
    }
}