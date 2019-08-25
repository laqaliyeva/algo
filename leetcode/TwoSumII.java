package leetcode;

public class TwoSumII {

    /*
    * Given an array of integers that is already sorted in ascending order,
    * find two numbers such that they add up to a specific target number.
    *
    * The function twoSum should return indices of the two numbers such
    * that they add up to the target, where index1 must be less than index2.
    *
    * */

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left + 1; result[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}