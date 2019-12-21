package leetcode;

/*
 * Given a binary tree, return the tilt of the whole tree. The tilt of a tree node
 * is defined as the absolute difference between the sum of all left subtree node
 * values and the sum of all right subtree node values. Null node has tilt 0.
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 *
 * Example          Input:  1           Output: 1
 *                        /   \
 *                       2     3
 */

import leetcode.util.TreeNode;

public class BinaryTreeTilt {

    private int tilt;

    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        return Math.abs(calcTilt(root.left) - calcTilt(root.right)) + tilt;
    }

    private int calcTilt(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return node.val;
        int lefts = calcTilt(node.left);
        int rights = calcTilt(node.right);
        tilt += Math.abs(lefts - rights);
        return node.val + lefts + rights;
    }
}