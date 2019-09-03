package leetcode;

import java.util.Stack;

public class ValidParentheses {

    /*
    * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
    * determine if the input string is valid.
    * An input string is valid if:  Open brackets must be closed by the same type of brackets.
    *                               Open brackets must be closed in the correct order.
    *                               Note that an empty string is also considered valid.
    *
    * Example           Input: "()[]{}"
    *                   Output: true
    *
    *                   Input: "([)]"
    *                   Output: false
    *
    *                   Input: "{[]}"
    *                   Output: true
    */

    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (getClosingBracket(stack.peek()) == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private static char getClosingBracket(char openBracket) {
        switch (openBracket) {
            case '(': return ')';
            case '{': return '}';
            case '[': return ']';
        }
        return 0;
    }
}