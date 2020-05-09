package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /*
    * Given an array of size n, find the majority element.
    * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
    *
    * */

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = nums[0];
        for (int i : nums) {
            int count = map.getOrDefault(i, 0) + 1;
            if (count > nums.length / 2) {
                result = i;
                break;
            }
            map.put(i, count);
        }
        return result;
    }
}