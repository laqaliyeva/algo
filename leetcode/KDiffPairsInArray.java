package leetcode;

import java.util.*;

public class KDiffPairsInArray {

    /*
    * Given an array of integers and an integer k,
    * you need to find the number of unique k-diff pairs in the array.
    * Here a k-diff pair is defined as an integer pair (i, j), where i and j
    * are both numbers in the array and their absolute difference is k.
    *
    * Example           Input: [3, 1, 4, 1, 5], k = 2
    *                   Output: 2
    *
    *                   Input: [1, 2, 3, 4, 5], k = 1
    *                   Output: 4
    */

    public static int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                if (k == 0 && map.get(num) < 2) {
                    count++;
                }
                map.put(num, map.get(num) + 1);
            } else {
                if (k > 0 && map.containsKey(num + k)) {
                    count++;
                }
                if (k > 0 && map.containsKey(num - k)) {
                    count++;
                }
                map.put(num, 1);
            }
        }
        return count;
    }
}