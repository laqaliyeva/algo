package leetcode;

import java.util.Stack;

public class SymmetricTree {

    /*
    * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
    * Example of symmetric tree:  1
    *                            / \
    *                           2   2
    *                          / \ / \
    *                         3  4 4  3
    */

    public static boolean isSymmetricRecursively(TreeNode root) {
        return root == null || isMirrorTree(root.left, root.right);
    }

    private static boolean isMirrorTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return p.val == q.val && isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left);
        } else {
            return p == null && q == null;
        }
    }

    public static boolean isSymmetricIteratively(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode p = stack.pop(), q = stack.pop();
            if (p == null && q == null) continue;
            if (p == null || q == null || p.val != q.val) return false;
            stack.push(p.left);
            stack.push(q.right);
            stack.push(p.right);
            stack.push(q.left);
        }
        return true;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}