package leetcode;

public class InvertBinaryTree {

    /*
    * Invert a binary tree.
    *
    * Example           Input:   4          Output:    4
    *                          /   \                 /   \
    *                         2     7               7     2
    *                        / \   / \             / \   / \
    *                       1   3 6   9           9   6 3   1
    */

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        return root;
    }
}