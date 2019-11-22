package leetcode;

public class SumOfLeftLeaves {

    /*
    * Find the sum of all left leaves in a given binary tree.
    *
    * Example           Input:  3       Output: 24
    *                          / \
    *                         9  20
    *                           /  \
    *                          15   7
    */

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root != null) {
            return getSum(root, 0, false);
        }
        return 0;
    }

    private static int getSum(TreeNode node, int sum, boolean isLeft) {
        if (node.left == null && node.right == null) {
            return isLeft ? sum + node.val : sum;
        }
        if (node.left != null) {
            sum = getSum(node.left, sum, true);
        }
        if (node.right != null) {
            sum = getSum(node.right, sum, false);
        }
        return sum;
    }
}