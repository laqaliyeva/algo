package leetcode;

/*
 * Given a binary tree, each node has value 0 or 1. Each root-to-leaf path represents
 * a binary number starting with the most significant bit. For example, if the path
 * is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 * For all leaves in the tree, consider the numbers represented by the path from the
 * root to that leaf. Return the sum of these numbers.
 *
 * Example          Input:  1           Output: 22
 *                        /   \
 *                       0     1
 *                      / \   / \
 *                     0   1 0   1
*/

public class SumOfRootToLeafBinaryNumbers {

    public int sumRootToLeaf(TreeNode root) {
        return transform(root, 0);
    }

    private int transform(TreeNode root, int prev) {
        if (root == null) return 0;
        prev = prev * 2 + root.val;
        return root.left == null && root.right == null ? prev : transform(root.left, prev) + transform(root.right, prev);
    }
}