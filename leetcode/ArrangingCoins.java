package leetcode;

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