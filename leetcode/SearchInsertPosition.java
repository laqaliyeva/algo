package leetcode;

public class SearchInsertPosition {

    public static int searchInsertPosition(int[] nums, int target) {
        int index = 0;
        while (index < nums.length && index >= 0) {
            if (target <= nums[index]) {
                return index;
            } else {
                index++;
            }
        }
        return index;
    }
}
