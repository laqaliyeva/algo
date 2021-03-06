package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    /*
    * Given an array of integers and an integer k, find out
    * whether there are two distinct indices i and j in the
    * array such that nums[i] = nums[j] and the absolute
    * difference between i and j is at most k.
    */

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}