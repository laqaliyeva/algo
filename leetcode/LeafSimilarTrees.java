package leetcode;

/*
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 *
 * Example          Input:  root1 = 3        root2 = 3          Output: true
 *                                /   \            /   \
 *                               5     1          5     1
 *                              / \   / \        / \   / \
 *                             6  7   4  2      6  2   9  8
 *                                      / \       / \
 *                                     9   8     7   4
*/

import leetcode.util.TreeNode;

public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String sequence1 = leafSequence(root1);
        return !sequence1.isEmpty() && sequence1.equals(leafSequence(root2));
    }

    private String leafSequence(TreeNode node) {
        if (node == null) return "";
        String left = leafSequence(node.left);
        String right = leafSequence(node.right);
        return left.isEmpty() && right.isEmpty() ? "" + node.val : left + right;
    }
}