package leetcode;

/*
 * You are given a sorted array consisting of only integers where every element appears exactly twice,
 * except for one element which appears exactly once. Find this single element that appears only once.
 * Your solution should run in O(log n) time and O(1) space.
 *
 * Example          Input: [1,1,2,3,3,4,4,8,8]
 *                  Output: 2
 *
 *                  Input: [3,3,7,7,10,11,11]
 *                  Output: 10
*/

public class SingleElementInSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (mid <= 0 || mid >= nums.length - 1) {
                break;
            }
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                break;
            }
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            mid = left + (right - left) / 2;
        }
        return nums[mid];
    }
}