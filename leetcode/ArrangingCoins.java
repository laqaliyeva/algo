package leetcode;

/*
 * You have a total of n coins that you want to form in a staircase shape,
 * where every k-th row must have exactly k coins. Given n, find the total number
 * of full staircase rows that can be formed.
 *
 * Example          Input: 8
 *                  Output: 3
 *
 * Explanation: 1st row *
 *              2nd row **
 *              3rd row ***
 *              4th row **  - incomplete
*/

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        if (n == 0 || n == 1) return n;
        int i = 0;
        while (n > 0) {
            i++;
            n -= i;
        }
        return --i;
    }
}