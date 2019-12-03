package leetcode;

/*
 * Given an n-ary tree, return the post-order traversal of its nodes' values.
 *
 * Example          Input:  1           Output: [5,6,3,2,4,1]
 *                       /  |  \
 *                      3   2   4
 *                     / \
 *                    5   6
*/

import java.util.*;

public class NaryTreePostOrderTraversal {

    public List<Integer> postOrderIterative(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<Node> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            Node node = deque.peek();
            if (node.children == null || node.children.isEmpty()) {
                result.add(deque.poll().val);
            } else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    deque.addFirst(node.children.get(i));
                }
                node.children = null;
            }
        }
        return result;
    }

    public List<Integer> postOrderRecursive(Node root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(Node root, List<Integer> list) {
        if (root != null) {
            for (Node child : root.children) {
                postOrder(child, list);
            }
            list.add(root.val);
        }
    }
}