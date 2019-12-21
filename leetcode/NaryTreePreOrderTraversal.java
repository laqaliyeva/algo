package leetcode;

/*
 * Given an n-ary tree, return the pre-order traversal of its nodes' values.
 *
 * Example          Input:  1           Output: [1,3,5,6,2,4]
 *                       /  |  \
 *                      3   2   4
 *                     / \
 *                    5   6
*/

import leetcode.util.Node;
import java.util.*;

public class NaryTreePreOrderTraversal {

    public List<Integer> preOrderIterative(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }
            result.add(node.val);
        }
        return result;
    }

    public List<Integer> preOrderRecursive(Node root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private void preOrder(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);
            for (Node child : node.children) {
                preOrder(child, result);
            }
        }
    }
}