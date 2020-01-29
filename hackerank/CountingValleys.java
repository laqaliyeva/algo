package hackerank;

/*
 * https://www.hackerrank.com/challenges/counting-valleys/problem
*/

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int sum = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            if (sum == 0 &&  getValue(c) < 0) {
                res++;
            }
            sum += getValue(c);
        }
        return res;
    }

    private static int getValue(char c) {
        if (c == 'U') {
            return 1;
        } else {
            return -1;
        }
    }
}