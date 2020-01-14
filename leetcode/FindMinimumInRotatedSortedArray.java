package leetcode;

/*
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you
 * beforehand. (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
 * Find the minimum element. You may assume no duplicate exists in the array.
 *
 * Example          Input: [3,4,5,1,2]
 *                  Output: 1
 */

public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (right - left) / 2 + left;
        int min = nums[0];
        while (left <= right) {
            if (nums[mid] >= nums[0]) {
                min = Math.min(min, nums[mid]);
                left = ++mid;
                mid = (right - left) / 2 + left;
            } else {
                min = Math.min(min, nums[mid]);
                right = --mid;
                mid = (right - left) / 2 + left;
            }
        }
        return min;
    }
}