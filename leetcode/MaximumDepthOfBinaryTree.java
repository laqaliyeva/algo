package leetcode;

public class MaximumDepthOfBinaryTree {

    /*
    * Given a binary tree, find its maximum depth.
    *
    * Example of binary tree with max depth of 3:    3
    *                                               / \
    *                                              9  20
    *                                                /  \
    *                                               15   7
    */

    public static int maxDepth(TreeNode root) {
        return countMaxNodes(root, 0);
    }

    private static int countMaxNodes(TreeNode node, Integer count) {
        if (node == null) {
            return count;
        }
        return Math.max(countMaxNodes(node.left, count + 1), countMaxNodes(node.right, count + 1));
    }
}