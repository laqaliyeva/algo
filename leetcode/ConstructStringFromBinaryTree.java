package leetcode;

import leetcode.util.TreeNode;

public class ConstructStringFromBinaryTree {

    /*
    * You need to construct a string consists of parenthesis and integers from a binary tree with the pre-order traversing way.
    * The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis
    * pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.
    *
    * Example           Input: Binary tree: [1,2,3,4]
    *                   Output: "1(2(4))(3)"
    *
    *                   Input: Binary tree: [1,2,3,null,4]
    *                   Output: "1(2()(4))(3)"
    */

    public static String tree2str(TreeNode t) {
        StringBuilder s = new StringBuilder();
        if (t != null) traversePreOrder(t, s);
        return s.toString();
    }

    private static void traversePreOrder(TreeNode t, StringBuilder builder) {
        builder.append(t.val);
        if (t.left == null && t.right != null) {
            builder.append("()");
        }
        if (t.left != null) {
            builder.append("(");
            traversePreOrder(t.left, builder);
            builder.append(")");
        }
        if (t.right != null) {
            builder.append("(");
            traversePreOrder(t.right, builder);
            builder.append(")");
        }
    }
}