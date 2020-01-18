package leetcode;

/*
 * Given an array nums of n integers, are there elements a, b, c in nums such that
 * a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * The solution set must not contain duplicate triplets.
 *
 * Example          Input: [-1, 0, 1, 2, -1, -4]
 *                  Output: [[-1, 0, 1], [-1, -1, 2]]
 */

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int val = -nums[i] - nums[j];
                if (set.contains(val) && !(j < nums.length - 1 && nums[j] == nums[j + 1])) {
                    res.add(Arrays.asList(nums[i], nums[j], val));
                }
                set.add(nums[j]);
            }
        }
        return res;
    }
}