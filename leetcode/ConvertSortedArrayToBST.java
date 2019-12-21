package leetcode;

import leetcode.util.TreeNode;

public class ConvertSortedArrayToBST {

    /*
    * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
    *
    * Example           Input: [-10,-3,0,5,9]
    *                   Output: 0
    *                          / \
    *                        -3   9
    *                        /   /
    *                      -10  5
    */

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return convertToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode convertToBST(int[] nums, int start, int end) {
        if (start >= end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convertToBST(nums, start, mid);
        node.right = convertToBST(nums, mid + 1, end);
        return node;
    }
}