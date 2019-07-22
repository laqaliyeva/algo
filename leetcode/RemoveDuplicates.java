package leetcode;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int newLength = nums.length;
        int nextIndex = 0;
        int currentIndex = 0;
        for (int i = 0; i < nums.length - 1;) {
            while (++nextIndex < nums.length) {
                if (nums[i] == nums[nextIndex]) {
                    newLength--;
                    i++;
                } else {
                    nums[++currentIndex] = nums[nextIndex];
                    i = nextIndex;
                }
            }
        }
        return newLength;
    }
}
