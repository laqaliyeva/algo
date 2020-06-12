package leetcode;

/*
 * Given an array with n objects colored red, white or blue, sort them in-place so that
 * objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: You are not supposed to use the library's sort function for this problem.
 * Note: Could you come up with a one-pass algorithm using only constant space?
 *
 * Example          Input: [2,0,2,1,1,0]
 *                  Output: [0,0,1,1,2,2]
*/

public class SortColors {

    public void sortColors(int[] nums) {
        int start = 0, end = nums.length - 1;
        int i = 0;
        while (i <= end) {
            if (nums[i] == 0) {
                nums[i] = nums[start];
                nums[start] = 0;
                start++;
                i++;
            } else if (nums[i] == 2) {
                nums[i] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                i++;
            }
        }
    }
}