package leetcode;

public class BestTimeToBuyAndSellStock {

   /*
   * Say you have an array for which the ith element is
   * the price of a given stock on day i.
   *
   * If you were only permitted to complete at most one
   * transaction (i.e., buy one and sell one share of the
   * stock), design an algorithm to find the maximum profit.
   *
   * Note that you cannot sell a stock before you buy one.
   *
   * Example    Arg: [7,1,5,3,6,4]
   *            Output: 5
   *            (Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5)
   *
   *            Arg: [7,6,4,3,1]
   *            Output: 0
   *            (In this case, no transaction is done, i.e. max profit = 0.)
   */

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int profit = prices[1] - min;
        for (int i = 0; i < prices.length - 1; i++) {
            min = Math.min(prices[i], min);
            profit = Math.max(prices[i + 1] - min, profit);
        }
        profit = Math.max(0, profit);
        return profit;
    }
}