package leetcode;

public class BestTimeToBuyAndSellStockII {

    /*
    * Say you have an array for which the i-th element
    * is the price of a given stock on day i.
    *
    * Design an algorithm to find the maximum profit.
    * You may complete as many transactions as you like
    * (i.e., buy one and sell one share of the stock multiple times).
    *
    * Example       Arg: [7,1,5,3,6,4]
    *               Output: 7 (5-1+6+3)
    *
    *               Arg: [1,2,3,4,5]
    *               Output: 4 (5-1 or 2-1+3-2+4-3+5-4)
    * */

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }
        return profit;
    }
}