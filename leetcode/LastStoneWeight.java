package leetcode;

/*
 * We have a collection of stones, each stone has a positive integer weight.
 * Each turn, we choose the two heaviest stones and smash them together.
 * Suppose the stones have weights x and y with x <= y. The result of this smash is:
 *      If x == y, both stones are totally destroyed;
 *      If x != y, the stone of weight x is totally destroyed, and the stone of
 * weight y has new weight y-x. At the end, there is at most 1 stone left.
 * Return the weight of this stone (or 0 if there are no stones left.)
*/

import java.util.Arrays;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        for (int i = stones.length - 1; i >= 0;) {
            if (i == 0) return stones[i];
            if (stones[i] - stones[i - 1] == 0) {
                i -= 2;
            } else {
                stones[i - 1] = stones[i] - stones[i - 1];
                Arrays.sort(stones);
                i -= 1;
            }
        }
        return 0;
    }
}