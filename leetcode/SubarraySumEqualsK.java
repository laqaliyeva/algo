package leetcode;

/*
 * Given an array of integers and an integer k, you need to find
 * the total number of continuous subarrays whose sum equals to k.
 *
 * Example          Input: nums = [1,1,1], k = 2
 *                  Output: 2
 */

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}