package codesignal;

/*
 * Given a string consisting of small English letters,
 * find and return the first instance of a non-repeating character.
 * If there is no such character, return '_'.
 *
 * Example          Input: "abacabad"
 *                  Output: 'c'
*/

public class FirstNotRepeatingCharacter {

    public char firstNotRepeatingCharacter(String s) {
        int[] frequencies = new int[26];
        for (char c : s.toCharArray()) {
            frequencies[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (frequencies[c - 'a'] == 1) {
                return c;
            }
        }
        return '_';
    }
}