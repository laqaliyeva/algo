package leetcode;

/*
 * Given two strings S and T, return if they are equal when both are typed
 * into empty text editors. # means a backspace character.
 *
 * Example          Input: S = "ab#c", T = "ad#c"
 *                  Output: true
 *
 *                  Input: S = "a#c", T = "b"
 *                  Output: false
 */

import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                stack.add(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        int numOfSharps = 0;
        for (int i = T.length() - 1; i >= 0; i--) {
            if (T.charAt(i) == '#') {
                numOfSharps++;
            } else if (numOfSharps > 0) {
                numOfSharps--;
            } else if (stack.isEmpty() || stack.pop() != T.charAt(i)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}