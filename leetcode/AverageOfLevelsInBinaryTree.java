package leetcode;

/*
 * Given a non-empty binary tree, return the average value of
 * the nodes on each level in the form of an array.
 *
 * Example          Input: 3            Output: [3, 14.5, 11]
 *                        / \
 *                       9  20
 *                         /  \
 *                        15   7
*/

import java.util.*;

public class AverageOfLevelsInBinaryTree {

    private List<Double> result = new ArrayList<>();
    private List<Integer> counts = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        calcSumsAndCounts(root, 0);
        for (int i= 0; i < result.size(); i++) {
            result.set(i, result.get(i) / counts.get(i));
        }
        return result;
    }

    private void calcSumsAndCounts(TreeNode node, int level) {
        if (node != null) {
            if (level > result.size() - 1) {
                result.add((double) node.val);
                counts.add(1);
            } else {
                result.set(level, result.get(level) + node.val);
                counts.set(level, counts.get(level) + 1);
            }
            calcSumsAndCounts(node.left, level + 1);
            calcSumsAndCounts(node.right, level + 1);
        }
    }
}