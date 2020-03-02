package leetcode;

/*
 * Implement function ToLowerCase() that has a string parameter str,
 * and returns the same string in lowercase.
 */

public class ToLowerCase {

    public String toLowerCase(String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                answer.append((char) (c + 32));
            } else {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}