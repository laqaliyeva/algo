package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /*
    * Given an array of integers, find if the array contains any duplicates.
    */

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}