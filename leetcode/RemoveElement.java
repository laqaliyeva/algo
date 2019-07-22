package leetcode;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int newLength = nums.length;
        int next = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                newLength--;
            } else {
                nums[next] = nums[i];
                next++;
            }
        }
        return newLength;
    }
}