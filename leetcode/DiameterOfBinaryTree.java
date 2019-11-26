package leetcode;

/*
 * Given a binary tree, you need to compute the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two
 * nodes in a tree. This path may or may not pass through the root.
 *
 * Example          Input: 1         Output: 3
 *                        / \
 *                       2   3
 *                      / \
 *                     4   5
 */

public class DiameterOfBinaryTree {

    private int maxDiam;

    public int diameterOfBinaryTree(TreeNode root) {
        getMaxDepth(root);
        return maxDiam;
    }

    private int getMaxDepth(TreeNode node) {
        if (node == null) return 0;
        int left = getMaxDepth(node.left);
        int right = getMaxDepth(node.right);
        maxDiam = Math.max(maxDiam, left + right);
        return Math.max(left, right) + 1;
    }
}