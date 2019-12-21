package leetcode;

/*
 * We define the Perfect Number is a positive integer that is equal to
 * the sum of all its positive divisors except itself. Now, given an integer n,
 * write a function that returns true when it is a perfect number and false when it is not.
 *
 * Example          Input: 28
 *                  Output: true (1 + 2 + 4 + 7 + 14)
*/

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