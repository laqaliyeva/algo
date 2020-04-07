package hackerrank;

/*
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
*/

public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        int[] alphabet = new int[26];
        for (char c : a.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            alphabet[c - 'a']--;
        }
        int ans = 0;
        for (int i : alphabet) {
            if (i != 0) {
                ans += Math.abs(i);
            }
        }
        return ans;
    }
}