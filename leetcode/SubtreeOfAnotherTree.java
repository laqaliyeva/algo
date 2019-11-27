package leetcode;

/*
 * Given two non-empty binary trees s and t, check whether tree t has exactly
 * the same structure and node values with a subtree of s. A subtree of s is
 * a tree consists of a node in s and all of this node's descendants. The
 * tree s could also be considered as a subtree of itself.
 *
 * Example          Input: s = 3      t = 4          Output: true
 *                            / \        / \
 *                           4   5      1   2
 *                          / \
 *                         1   2
 *
 *                  Input: s = 3      t = 4          Output: false
 *                            / \        / \
 *                           4   5      1   2
 *                          / \
 *                         1   2
 *                            /
 *                           0
*/

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        return isSubtree(s, t, true);
    }

    public boolean isSubtree(TreeNode s, TreeNode t, boolean next) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val == t.val && isSubtree(s.right, t.right, false) && isSubtree(s.left, t.left, false)) {
            return true;
        } else {
            return next && (isSubtree(s.left, t, true) || isSubtree(s.right, t, true));
        }
    }
}