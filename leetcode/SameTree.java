package leetcode;

public class SameTree {

    /*
    * Given two binary trees, write a function to check if they are the same or not.
    * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
    *
    * Example           Input: [1,2,3],   [1,2,3]
    *                   Output: true
    *
    *                   Input: [1,2],     [1,null,2]
    *                   Output: false
    */

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return p == null && q == null;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
}