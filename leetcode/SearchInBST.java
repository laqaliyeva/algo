package leetcode;

/*
 * Given the root node of a binary search tree (BST) and a value.
 * You need to find the node in the BST that the node's value equals
 * the given value. Return the subtree rooted with that node.
 * If such node doesn't exist, you should return NULL.
 *
 * Example          Input:  4           Output:   2
 *                         / \                   / \
 *                        2   7                 1   3
 *                       / \
 *                      1   3
*/

public class SearchInBST {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
}