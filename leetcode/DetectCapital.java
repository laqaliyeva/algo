package leetcode;

public class DetectCapital {

    /*
    * Given a word, you need to judge whether the usage of capitals in it is right or not.
    * The usage of capitals in a word is defined to be right when one of the following cases holds:
    *   All letters in this word are capitals, like "USA".
    *   All letters in this word are not capitals, like "leetcode".
    *   Only the first letter in this word is capital, like "Google".
    */

    public static boolean detectCapitalUse(String word) {
        for (int i = word.charAt(0) < 97 ? 1 : 0; i < word.length() - 1; i++) {
            if ((word.charAt(i) < 97) != (word.charAt(i + 1) < 97)) {
                return false;
            }
        }
        return true;
    }
}