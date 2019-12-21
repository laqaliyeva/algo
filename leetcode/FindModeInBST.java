package leetcode;

import leetcode.util.TreeNode;
import java.util.*;

public class FindModeInBST {

    /*
    * Given a binary search tree (BST) with duplicates, find all the mode(s)
    * (the most frequently occurred element) in the given BST. Note: If a tree
    * has more than one mode, you can return them in any order.
    *
    * Example           Input: 1            Output: [2]
    *                           \
    *                            2
    *                           /
    *                          2
    */

    private TreeNode prev;
    private List<Integer> result;
    private int count;
    private int maxCount;

    public int[] findMode(TreeNode root) {
        findMaxCount(root);
        result = new ArrayList<>();
        prev = null;
        findMods(root);
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }

    private void findMaxCount(TreeNode node) {
        if (node == null) return;
        findMaxCount(node.left);
        if (prev != null && prev.val == node.val) {
            count++;
            maxCount = Math.max(count, maxCount);
        } else {
            count = 1;
            maxCount = Math.max(count, maxCount);
        }
        prev = node;
        findMaxCount(node.right);
    }

    private void findMods(TreeNode node) {
        if (node == null) return;
        findMods(node.left);
        if (prev != null && prev.val == node.val) {
            count++;
        } else {
            count = 1;
        }
        if (count == maxCount) {
            result.add(node.val);
        }
        prev = node;
        findMods(node.right);
    }
}