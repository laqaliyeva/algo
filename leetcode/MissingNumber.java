package leetcode;

import java.util.Arrays;

public class MissingNumber {

    /*
    * Given an array containing n distinct numbers
    * taken from 0, 1, 2, ..., n, find the one
    * that is missing from the array.
    */

    public static int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int sum = nums.length * n/2;
        return sum - Arrays.stream(nums).sum();
    }
}