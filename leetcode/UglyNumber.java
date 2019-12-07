package leetcode;

/*
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 *
 * Example          Input: 6            Output: true (2 * 3)
 *
 *                  Input: 14           Output: false (2 * 7)
*/

public class UglyNumber {

    public boolean isUgly(int num) {
        if (num <= 0) return false;
        if (num < 7) return true;
        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) return false;
        if (num % 5 == 0) return isUgly(num / 5);
        if (num % 3 == 0) return isUgly(num / 3);
        return isUgly(num / 2);
    }
}