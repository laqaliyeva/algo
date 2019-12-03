package leetcode;

/*
 * Given a binary tree, find the length of the longest path where each node in path has
 * the same value. This path may or may not pass through the root. The length of path
 * between two nodes is represented by the number of edges between them.
 *
 * Example          Input: 5            Output: 2
 *                        / \
 *                       4   5
 *                      / \   \
 *                     1   1   5
*/

public class LongestUnivaluePath {

    private int max;

    public int longestUnivaluePath(TreeNode root) {
        if (root != null) {
            countValues(root, root.val, -1);
        }
        return max;
    }

    private int countValues(TreeNode node, int prev, int count) {
        if (node == null) {
            return 0;
        }
        int left = countValues(node.left, node.val, 0);
        int right = countValues(node.right, node.val, 0);
        if (prev == node.val) {
            count += Math.max(left, right) + 1;
        } else {
            count = 0;
        }
        max = Math.max(max, Math.max(left + right, count));
        return count;
    }
}