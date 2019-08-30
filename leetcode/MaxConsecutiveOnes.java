package leetcode;

public class MaxConsecutiveOnes {

    /*
    * Given a binary array, find the maximum number of consecutive 1s in this array.
    *
    * Example           Input: [1,1,0,1,1,1]
    *                   Output: 3
    */

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                max = Math.max(max, current);
                current = 0;
            }
        }
        return max;
    }
}