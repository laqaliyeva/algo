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
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
                if (map.get(i) > nums.length / 2) {
                    result = i;
                    break;
                }
            } else {
                map.put(i, 1);
            }
        }
        return result;
    }
}
