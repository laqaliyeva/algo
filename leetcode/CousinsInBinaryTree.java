package leetcode;

/*
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 * We are given the root of a binary tree with unique values, and the values x and y of two different
 * nodes in the tree. Return true if and only if the nodes corresponding to the values x and y are cousins.
 *
 * Example          Input: 1    x = 2, y = 3            Output: false
 *                        / \
 *                       2   3
 *                        \   \
 *                         4   5
 *
 *                  Input: 1    x = 2, y = 3            Output: false
 *                        / \
 *                       2   3
 *                        \   \
 *                         4   5
*/

import leetcode.util.TreeNode;

public class CousinsInBinaryTree {

    private int depth = Integer.MAX_VALUE;
    private TreeNode parent;

    public boolean isCousins(TreeNode root, int x, int y) {
        return findCousins(root, x, y, 1);
    }

    private boolean findCousins(TreeNode root, int x, int y, int level) {
        if (root == null) return false;
        if (level > depth) return false;
        if (root.val == x || root.val == y) return false;
        if (root.left != null && (root.left.val == x || root.left.val == y)) {
            return cousinFound(root, level);
        }
        if (root.right != null && (root.right.val == x || root.right.val == y)) {
            return cousinFound(root, level);
        }
        return findCousins(root.left, x, y, level + 1) || findCousins(root.right, x, y, level + 1);
    }

    private boolean cousinFound(TreeNode node, int level) {
        if (parent == null) {
            parent = node;
            depth = level;
            return false;
        } else {
            return parent.val != node.val && depth == level;
        }
    }
}