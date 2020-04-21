package leetcode;

/*
 * Return the root node of a binary search tree that matches the given preorder traversal.
 *
 * Example          Input: [8,5,1,7,10,12]
 *                  Output: [8,5,10,1,7,null,12]
*/

import leetcode.util.TreeNode;
import java.util.Stack;

public class ConstructBSTFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode prev = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        for (int i = 1; i < preorder.length; i++) {
            if (stack.isEmpty()) return root;
            if (preorder[i] < stack.peek().val) {
                prev.left = new TreeNode(preorder[i]);
                stack.push(prev.left);
                prev = prev.left;
            } else {
                while (!stack.isEmpty() && preorder[i] > stack.peek().val) {
                    prev = stack.pop();
                }
                prev.right = new TreeNode(preorder[i]);
                stack.add(prev.right);
                prev = prev.right;
            }
        }
        return root;
    }
}