package leetcode;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

    /*
    * Given an integer array, you need to find one continuous subarray that
    * if you only sort this subarray in ascending order, then the whole array
    * will be sorted in ascending order, too. You need to find the shortest
    * such subarray and output its length.
    *
    * Example           Input: [2, 6, 4, 8, 10, 9, 15]
    *                   Output: 5
    */

    public static int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int start = 0; int end = 0;
        for (int i = 0, j = sorted.length - 1; i < sorted.length && j >= 0; i++, j--) {
            if (sorted[i] != nums[i]) {
                end = i;
            }
            if (sorted[j] != nums[j]) {
                start = j;
            }
        }
        if (start == 0 && end == 0) {
            return 0;
        }
        return end - start + 1;
    }
}