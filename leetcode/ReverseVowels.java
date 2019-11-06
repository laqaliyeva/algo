package leetcode;

public class ReverseVowels {

    /*
    * Write a function that takes a string as input and reverse only
    * the vowels of a string. The vowels does not include the letter "y".
    *
    * Example           Input: "leetcode"
    *                   Output: "leotcede"
    */

    public static String reverseVowels(String s) {
        char[] reversed = new char[s.length()];
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (!isVowel(s.charAt(i))) {
                reversed[i] = s.charAt(i++);
                continue;
            }
            if (!isVowel(s.charAt(j))) {
                reversed[j] = s.charAt(j--);
                continue;
            }
            reversed[i] = s.charAt(j);
            reversed[j--] = s.charAt(i++);
        }
        return new String(reversed);
    }

    private static boolean isVowel(char c) {
        return "aeiou".contains(String.valueOf(c).toLowerCase());
    }
}