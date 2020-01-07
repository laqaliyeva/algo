package leetcode;

/*
 * A self-dividing number is a number that is divisible by every digit it contains. Also,
 * a self-dividing number is not allowed to contain the digit zero. Given a lower and upper number
 * bound, output a list of every possible self dividing number, including the bounds if possible.
 *
 * Example          Input: left = 1, right = 22
 *                  Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
*/

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int n) {
        if (n < 10) return true;
        int temp = n;
        while (temp > 0) {
            if (temp % 10 == 0 || n % (temp % 10) > 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}