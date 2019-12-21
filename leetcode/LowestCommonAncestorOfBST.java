package leetcode;

import leetcode.util.TreeNode;

public class LowestCommonAncestorOfBST {

    /*
    * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
    * Note: a node is allowed to be a descendant of itself
    *       all of the nodes' values will be unique
    *       p and q are different and both values will exist in the BST
    *
    * Example    Input:  tree:  6           p = 2, q = 8        Output: 6
    *                          / \          p = 2, q = 4        Output: 2
    *                         2    8
    *                        / \   / \
    *                       0   4 7   9
    *                          / \
    *                         3   5
    */

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == root.val) return p;
        if (q.val == root.val) return q;
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}