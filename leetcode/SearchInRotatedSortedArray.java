package leetcode;

/*
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]). You are given a target value to search.
 * If found in the array return its index, otherwise return -1. You may assume no duplicate exists
 * in the array. Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * Example          Input: nums = [4,5,6,7,0,1,2], target = 0
 *                  Output: 4
*/

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        if (nums.length < 1) return -1;
        int min = findMin(nums);
        int left = target > nums[nums.length - 1] ? 0 : min;
        int right = target <= nums[nums.length - 1] ? nums.length - 1 : min;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    private static int findMin(int[] nums) {
        int min = 0, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= nums[min]) {
                left = ++mid;
            } else {
                min = mid;
                right = --mid;
            }
        }
        return min;
    }
}