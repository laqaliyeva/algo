package leetcode;

/*
 * Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree
 * so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree,
 * so the result should return the new root of the trimmed binary search tree.
 *
 * Example          Input:  3 , L = 1, R = 3          Output:  3
 *                         / \                                /
 *                        0   4                              2
 *                         \                                /
 *                          2                              1
 *                         /
 *                        1
*/

import leetcode.util.TreeNode;

public class TrimBST {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val < L) return trimBST(root.right, L, R);
            if (root.val > R) return trimBST(root.left, L, R);
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
        }
        return root;
    }
}