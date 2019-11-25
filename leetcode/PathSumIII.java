package leetcode;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

    /*
    * You are given a binary tree in which each node contains an integer value. Find the number of paths
    * that sum to a given value. The path does not need to start or end at the root or a leaf, but it must
    * go downwards (traveling only from parent nodes to child nodes).
    *
    * Example           Input:    10            Output: 3
    *                            /  \
    *                           5   -3
    *                          / \    \
    *                         3   2   11
    *                        / \   \
    *                       3  -2   1
    */

    public static int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return countPaths(root, 0, sum, map);
    }

    private static int countPaths(TreeNode node, int current, int target, Map<Integer, Integer> prevPaths) {
        if (node == null) {
            return 0;
        }
        current += node.val;
        int count = prevPaths.getOrDefault(current - target, 0);
        prevPaths.put(current, prevPaths.getOrDefault(current, 0) + 1);
        int result =  count + countPaths(node.left, current, target, prevPaths) + countPaths(node.right, current, target, prevPaths);
        prevPaths.put(current, prevPaths.get(current) - 1);
        return result;
    }
}