package leetcode;

import leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    /*
    * Given a binary tree, return all root-to-leaf paths.
    *
    * Example           Input: 1            Output: ["1->2->5", "1->3"]
    *                        /   \
    *                       2     3
    *                        \
    *                         5
    */

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            result.add("");
            setPaths(root, result);
        }
        return result;
    }

    private static void setPaths(TreeNode node, List<String> paths) {
        String path = paths.get(paths.size() - 1) + node.val;
        paths.set(paths.size() - 1, path);
        if (node.left != null) {
            paths.set(paths.size() - 1, path + "->");
            setPaths(node.left, paths);
        }
        if (node.left != null && node.right != null) {
            paths.add(path + "->");
            setPaths(node.right, paths);
        }
        if (node.left == null && node.right != null) {
            paths.set(paths.size() - 1, path + "->");
            setPaths(node.right, paths);
        }
    }
}