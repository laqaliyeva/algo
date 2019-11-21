package leetcode;

public class MinimumDepthOfBinaryTree {

    /*
    * Given a binary tree, find its minimum depth.
    *
    * Example           Input:  3
    *                          / \
    *                         9  20
    *                           /  \
    *                          15   7
    *                   Output: 2
    */

    public static int minDepth(TreeNode root) {
        return countMinDepth(root, 0);
    }

    private static int countMinDepth(TreeNode node, int count) {
        if (node == null) {
            return count;
        }
        if (node.left != null && node.right != null) {
            return Math.min(countMinDepth(node.left, count + 1), countMinDepth(node.right, count + 1));
        } else if (node.left != null || node.right != null) {
            return Math.max(countMinDepth(node.left, count + 1), countMinDepth(node.right, count + 1));
        } else {
            return count + 1;
        }
    }
}