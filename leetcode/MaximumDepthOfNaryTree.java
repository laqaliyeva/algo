package leetcode;

/*
 * Given a n-ary tree, find its maximum depth.
 *
 * Example          Input:  1           Output: 3
 *                       /  |  \
 *                      3   2   4
 *                     / \
 *                    5   6
*/

import java.util.List;

public class MaximumDepthOfNaryTree {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        int maxDepth = 0;
        if (root.children != null) {
            for (Node child : root.children) {
                int depth = maxDepth(child);
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth + 1;
    }
}
class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}