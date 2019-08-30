package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    /*
    * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
    * some elements appear twice and others appear once.
    * Find all the elements of [1, n] inclusive that do not appear in this array.
    *
    * Additional requirement: no extra space , O(n) time complexity
    * (assume the returned list does not count as extra space)
    */

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int no : nums) {
            int index = Math.abs(no) - 1;
            if (nums[index] > 0) {
                nums[index] = - nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}