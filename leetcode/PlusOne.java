package leetcode;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        return calcPlusOne(digits, digits.length - 1);
    }

    private static int[] calcPlusOne(int[] nums, int index) {
        while (index >= 0) {
            if (nums[index] + 1 == 10) {
                if (index == 0) {
                    nums[index] = 1;
                    return Arrays.copyOf(nums, nums.length + 1);
                }
                nums[index] = 0;
                return calcPlusOne(nums, --index);
            } else {
                nums[index]++;
                return nums;
            }
        }
        return nums;
    }
}
