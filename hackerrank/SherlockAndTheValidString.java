package hackerrank;

/*
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string
*/

import java.util.*;

public class SherlockAndTheValidString {

    static String isValid(String s) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        Map<Integer, Integer> numFreqMap = new HashMap<>();
        int num1 = 0;
        int num2 = 0;
        for (int i : alphabet) {
            if (i == 0) {
                continue;
            }
            if (num1 == 0) {
                num1 = i;
            } else if (num2 == 0 && i != num1) {
                num2 = i;
            }
            numFreqMap.put(i, numFreqMap.getOrDefault(i, 0) + 1);
        }
        if (numFreqMap.size() == 1) {
            return "YES";
        } else if (numFreqMap.size() > 2) {
            return "NO";
        }
        if ((num1 == 1 || Math.abs(num1 - num2) == 1) && numFreqMap.get(num1) == 1) {
            return "YES";
        } else if ((num2 == 1 || Math.abs(num1 - num2) == 1) && numFreqMap.get(num2) == 1) {
            return "YES";
        }
        return "NO";
    }
}