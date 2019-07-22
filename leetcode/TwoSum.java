package leetcode;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        outer: for(int i = 0; i < nums.length - 1; i++) {
            int length = nums.length;
            while(--length > i) {
                if(nums[i] + nums[length] == target) {
                    result[0] = i; result[1] = length;
                    break outer;
                }
            }
        }
        return result;
    }
}
