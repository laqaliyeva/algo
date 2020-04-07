package hackerrank;

/*
 * https://www.hackerrank.com/challenges/repeated-string
*/

import java.util.HashSet;
import java.util.Set;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        if (!s.contains("a")) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == 'a') {
                set.add(i);
            }
        }
        long result = n / s.length() * set.size();
        for (int i = 0; i < n % s.length(); i ++) {
            if (set.contains(i)) {
                result++;
            }
        }
        return result;
    }
}