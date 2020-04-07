package hackerrank;

/*
 * https://www.hackerrank.com/challenges/special-palindrome-again
*/

import java.util.ArrayList;
import java.util.List;

public class SpecialStringAgain {

    static long substrCount(int n, String s) {
        List<CharCount> list = new ArrayList<>();
        CharCount current = new CharCount(s.charAt(0), 1);
        list.add(current);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == current.c) {
                current.count++;
            } else {
                current = new CharCount(s.charAt(i), 1);
                list.add(current);
            }
        }
        long count = 0;
        CharCount left = list.get(0);
        count += (left.count + 1) * left.count / 2;
        for (int i = 1; i < list.size(); i++) {
            CharCount mid = list.get(i);
            count += (mid.count + 1) * mid.count / 2 ;
            if (mid.count == 1 && i < list.size() - 1) {
                CharCount right = list.get(i + 1);
                    if (right.c == left.c) {
                        count += Math.min(right.count, left.count);
                    }
            }
            left = mid;
        }
        return count;
    }

    static class CharCount {

        char c;
        long count;

        CharCount(char c, long count) {
            this.c = c;
            this.count = count;
        }
    }
}