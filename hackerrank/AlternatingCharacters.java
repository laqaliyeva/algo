package hackerrank;

/*
 * https://www.hackerrank.com/challenges/alternating-characters
*/

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ans++;
            }
        }
        return ans;
    }
}