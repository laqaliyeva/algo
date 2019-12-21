package leetcode;

/*
 * Given the root node of a binary search tree, return the sum of values of all nodes with
 * value between L and R (inclusive). The binary search tree is guaranteed to have unique values.
 *
 * Example          Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 *                  Output: 32
*/

import leetcode.util.TreeNode;

public class RangeSumOfBST {

    private int sum;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        if (root.val < L) {
            rangeSumBST(root.right, L, R);
        } else if (root.val > R) {
            rangeSumBST(root.left, L, R);
        } else {
            sum += root.val;
            rangeSumBST(root.left, L, R);
            rangeSumBST(root.right, L, R);
        }
        return sum;
    }
}