package leetcode;

/*
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 *
 * Example          Input: [1,3,5,6], 5
 *                  Output: 2
 *
 *                  Input: [1,3,5,6], 2
 *                  Output: 1
*/

public class SearchInsertPosition {

    public static int searchInsertPosition(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return mid;
    }
}