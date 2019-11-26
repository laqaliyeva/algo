package leetcode;

public class MinimumAbsoluteDifferenceInBST {

    /*
    * Given a binary search tree with non-negative values, find the minimum
    * absolute difference between values of any two nodes.
    *
    * Example           Input:  0            Output: 519
    *                            \
    *                           2236
    *                           /   \
    *                         1277  2776
    *                         /
    *                       519
    */

    private TreeNode prev;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        int minDiff = getMinimumDifference(root.left);
        if (prev != null) {
            minDiff = Math.min(Math.abs(root.val - prev.val), minDiff);
        }
        prev = root;
        minDiff = Math.min(getMinimumDifference(root.right), minDiff);
        return minDiff;
    }
}