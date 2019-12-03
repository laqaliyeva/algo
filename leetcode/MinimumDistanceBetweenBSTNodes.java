package leetcode;

/*
 * Given a BST, return the minimum difference between the values of
 * any two different nodes in the tree.
 *
 * Example          Input: 4            Output: 1
 *                        / \
 *                       2   6
 *                      / \
 *                     1   3
*/

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDistanceBetweenBSTNodes {

    private int min = Integer.MAX_VALUE;
    private Queue<Integer> queue = new LinkedList<>();

    public int minDiffInBST(TreeNode root) {
        if (root != null) {
            minDiffInBST(root.left);
            if (!queue.isEmpty()) {
                min = Math.min(min, root.val - queue.poll());
            }
            queue.add(root.val);
            minDiffInBST(root.right);
        }
        return min;
    }
}