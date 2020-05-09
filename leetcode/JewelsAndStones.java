package leetcode;

/*
 * You're given strings J representing the types of stones that are jewels, and S
 * representing the stones you have.  Each character in S is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 *
 * Example          Input: J = "aA", S = "aAAbbbb"
 *                  Output: 3
 *
 *                  Input: J = "z", S = "ZZ"
 *                  Output: 0
 */

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        Set<Character> jewels = new HashSet<>();
        for (char c : J.toCharArray()) {
            jewels.add(c);
        }
        int count = 0;
        for (char c : S.toCharArray()) {
            if (jewels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}