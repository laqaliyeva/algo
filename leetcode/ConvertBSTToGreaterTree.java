package leetcode;

import leetcode.util.TreeNode;

public class ConvertBSTToGreaterTree {

    /*
    * Given a Binary Search Tree, convert it to a Greater Tree such that
    * every key of the original BST is changed to the original key plus
    * sum of all keys greater than the original key in BST.
    *
    * Example           Input: 5            Output: 18
    *                         / \                  /  \
    *                        2   13               20   13
    */

    private int sum;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        sum += root.val;
        root.val += sum - root.val;
        convertBST(root.left);
        return root;
    }
}