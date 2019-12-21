package leetcode;

/*
 * Given a Binary Search Tree and a target number, return true if there exist
 * two elements in the BST such that their sum is equal to the given target.
 *
 * Example          Input:  5 , k = 9            Output: true
 *                         / \
 *                        3   6
 *                       / \   \
 *                      2   4   7
 *
 *                  Input:  5 , k = 28           Output: false
 *                         / \
 *                        3   6
 *                       / \   \
 *                      2   4   7
*/

import leetcode.util.TreeNode;
import java.util.HashSet;
import java.util.Set;

public class TwoSumIV_InputBST {

    private Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        return sumExists(root, k);
    }

    private boolean sumExists(TreeNode node, int k) {
        if (node != null) {
            if (set.contains(k - node.val)) {
                return true;
            } else {
                set.add(node.val);
                return sumExists(node.left, k) || sumExists(node.right, k);
            }
        }
        return false;
    }
}