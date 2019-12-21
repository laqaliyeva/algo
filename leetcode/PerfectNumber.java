package leetcode;

public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 2; i < num / 2; i ++) {
            if (num % i == 0 && num / i > i) {
                sum += i;
                sum += num / i;
            }
        }
        return sum + 1 == num;
    }
}