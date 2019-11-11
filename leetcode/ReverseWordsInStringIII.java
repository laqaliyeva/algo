package leetcode;

public class ReverseWordsInStringIII {

    /*
    * Given a string, you need to reverse the order of characters in each word
    * within a sentence while still preserving whitespace and initial word order.
    *
    * Example           Input: "Let's take LeetCode contest"
    *                   Output: "s'teL ekat edoCteeL tsetnoc"
    */

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int offset = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                offset = result.length();
            } else {
                result.insert(offset, c);
            }
        }
        return result.toString();
    }
}