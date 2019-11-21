package leetcode;

public class PathSum {

    /*
    * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
    * such that adding up all the values along the path equals the given sum.
    *
    * Example           Input:    5         Output: true
    *                            / \
    *                           4   8
    *                          /   / \
    *                         11  13  4
    *                        /  \      \
    *                       7    2      1
    */

    public static boolean hasPathSum(TreeNode root, int sum) {
        return isEqualToSum(root, sum, 0);
    }

    private static boolean isEqualToSum(TreeNode node, int sum,  int currentSum) {
        if (node == null) {
            return false;
        }
        if (node.left != null || node.right != null) {
            return isEqualToSum(node.left, sum, currentSum + node.val)
                    || isEqualToSum(node.right, sum, currentSum + node.val);
        }
        return sum == currentSum + node.val;
    }
}