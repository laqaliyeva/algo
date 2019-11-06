package leetcode;

public class RansomNote {

    /*
    * Given an arbitrary ransom note string and another string containing letters
    * from all the magazines, write a function that will return true if the ransom
    * note can be constructed from the magazines ; otherwise, it will return false.
    *
    * Each letter in the magazine string can only be used once in your ransom note.
    * You may assume that both strings contain only lowercase letters.
    *
    * Example           Input: "a", "b"
    *                   Output: false
    *
    *                   Input: "aa", "aab"
    *                   Output: true
    */

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        StringBuilder sb = new StringBuilder(magazine);
        for (char c : ransomNote.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) >= 0) {
                sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}