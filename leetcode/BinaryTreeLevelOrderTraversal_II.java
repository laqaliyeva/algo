package leetcode;

import leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal_II {

    /*
    * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
    *
    * Example           Input: 3
    *                         / \
    *                        9  20
    *                          /  \
    *                         15   7
    *                   Outout: [
    *                            [15,7],
    *                            [9,20],
    *                            [3]
    *                           ]
    */

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        return fillList(root, new ArrayList<>(), 0);
    }

    private static List<List<Integer>> fillList(TreeNode node, List<List<Integer>> lists, int idx) {
        if (node != null) {
            while (idx >= lists.size()) {
                lists.add(0, new ArrayList<>());
            }
            lists.get(lists.size() - 1 - idx).add(node.val);
            fillList(node.left, lists, idx + 1);
            fillList(node.right, lists, idx + 1);
        }
        return lists;
    }
}