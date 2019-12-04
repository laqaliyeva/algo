package leetcode;

/*
 * Given a binary search tree, rearrange the tree in in-order so that
 * the leftmost node in the tree is now the root of the tree, and every
 * node has no left child and only 1 right child.
 *
 * Example          Input: 4                    Output: 1
 *                        / \                            \
 *                      2    5                            2
 *                     / \                                 \
 *                    1   3                                 3
 *                                                           \
 *                                                            4
 *                                                             \
 *                                                              5
*/

public class IncreasingOrderSearchTree {

    private TreeNode result = null;
    private TreeNode prev = null;

    public TreeNode increasingBST(TreeNode root) {
        if (root != null) {
            increasingBST(root.left);
            if (result == null) {
                result = new TreeNode(root.val);
            } else if (prev == null) {
                prev = new TreeNode(root.val);
                result.right = prev;
            } else {
                prev.right = new TreeNode(root.val);
                prev = prev.right;
            }
            increasingBST(root.right);
        }
        return result;
    }
}