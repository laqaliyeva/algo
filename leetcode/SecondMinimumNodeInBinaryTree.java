package leetcode;

/*
 * Given a non-empty special binary tree consisting of nodes with the non-negative value,
 * where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes,
 * then this node's value is the smaller value among its two sub-nodes.
 * Given such a binary tree, you need to output the second minimum value in the set
 * made of all the nodes' value in the whole tree. If no such second minimum value exists, output -1 instead.
 *
 * Example          Input:  2           Output: 5
 *                         / \
 *                        2   5
 *                           / \
 *                          5   7
 *
 *                  Input:  2           Output: -1
 *                         / \
 *                        2   2
*/

import leetcode.util.TreeNode;

public class SecondMinimumNodeInBinaryTree {

    public int findSecondMinimumValue(TreeNode root) {
        return findSecondMin(root, root.val, Integer.MAX_VALUE);
    }

    private int findSecondMin(TreeNode node, int min, int secondMin) {
        if (node == null) {
            return -1;
        }
        if (node.val == min) {
            int leftMin = findSecondMin(node.left, min, secondMin);
            int rightMin = findSecondMin(node.right, min, secondMin);
            return leftMin == -1 || rightMin == -1 ? Math.max(leftMin, rightMin) : Math.min(leftMin, rightMin);
        }
        return Math.min(node.val, secondMin);
    }
}