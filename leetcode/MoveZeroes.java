package leetcode;

public class MoveZeroes {

    /*
    * Given an array nums, write a function to move
    * all 0's to the end of it while maintaining the
    * relative order of the non-zero elements.
    *
    * Example   Arg:    [0, 1, 0, 3, 12]
    *           Output: [1, 3, 12, 0, 0]
    */

    public static void moveZeroes(int[] nums) {
        int current = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && ++current != i) {
                nums[current] = nums[i];
                nums[i] = 0;
            }
        }
    }
}