package leetcode;

/*
 * Given a n-ary tree, find its maximum depth.
 *
 * Example          Input:  1           Output: 3
 *                       /  |  \
 *                      3   2   4
 *                     / \
 *                    5   6
*/

import leetcode.util.Node;

public class MaximumDepthOfNaryTree {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        int maxDepth = 0;
        if (root.children != null) {
            for (Node child : root.children) {
                int depth = maxDepth(child);
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth + 1;
    }
}