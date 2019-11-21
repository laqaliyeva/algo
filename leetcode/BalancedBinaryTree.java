package leetcode;

public class BalancedBinaryTree {

    /*
    * Given a binary tree, determine if it is height-balanced.
    *
    * Example           Input:  3
    *                          / \
    *                         9  20
    *                           /  \
    *                          15   7
    *                   Output: true
    *
    *                   Input: 1
    *                         / \
    *                        2   2
    *                       / \
    *                      3   3
    *                     / \
    *                    4   4
    *                   Output: false
    */

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right)
                && Math.abs(getMaxDepth(root.left, 0) - getMaxDepth(root.right, 0)) <= 1;
    }

    private static int getMaxDepth(TreeNode node, int count) {
        if (node == null) {
            return count;
        }
        return Math.max(getMaxDepth(node.left, count + 1), getMaxDepth(node.right, count + 1));
    }
}