package leetcode;

public class SymmetricTree {

    /*
    * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
    * Example of symmetric tree:  1
    *                            / \
    *                           2   2
    *                          / \ / \
    *                         3  4 4  3
    */

    public static boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left, root.right);
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        } else {
            return p == null && q == null;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}