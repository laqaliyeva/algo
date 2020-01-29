package hackerank;

/*
 * https://www.hackerrank.com/challenges/sock-merchant/problem
*/

import java.util.Arrays;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int res = 0;
        for (int i = 0; i < n - 1;) {
            if (ar[i] == ar[i + 1]) {
                res++;
                i += 2;
            } else {
                i++;
            }
        }
        return res;
    }
}