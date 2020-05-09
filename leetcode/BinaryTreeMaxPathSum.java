package leetcode;

/*
 * Given a non-empty binary tree, find the maximum path sum. For this problem, a path is defined
 * as any sequence of nodes from some starting node to any node in the tree along the parent-child
 * connections. The path must contain at least one node and does not need to go through the root.
 *
 * Example          Input: 1            Output: 6
 *                        / \
 *                       2   3
 *
 *
 *                  Input: -10          Output: 42
 *                         / \
 *                        9  20
 *                          /  \
 *                         15   7
*/

import leetcode.util.TreeNode;

public class BinaryTreeMaxPathSum {

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMax(root);
        return max;
    }

    private int findMax(TreeNode node) {
        if (node == null) return 0;
        int maxLeft = Math.max(0, findMax(node.left));
        int maxRight = Math.max(0, findMax(node.right));
        max = Math.max(max, node.val + maxLeft + maxRight);
        return Math.max(maxLeft, maxRight) + node.val;
    }
}