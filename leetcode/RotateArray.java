package leetcode;

/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example:         Input:  [1,2,3,4,5,6,7]
 *                  Output: [5,6,7,1,2,3,4]
 */

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}