package leetcode;

public class StringCompression {

    /*
    * Given an array of characters, compress it in-place.
    * The length after compression must always be smaller than or equal to the original array.
    * Every element of the array should be a character (not int) of length 1.
    * After you are done modifying the input array in-place, return the new length of the array.
    *
    * Example           Input: ['a','a','b','b','c','c','c']
    *                   Output: Return 6, and the first 6 characters of the input array should be: ['a','2','b','2','c','3']
    *
    *                   Input: ['a','b','b','b','b','b','b','b','b','b','b','b','b']
    *                   Output: Return 4, and the first 4 characters of the input array should be: ['a','b','1','2']
    */

    public static int compress(char[] chars) {
        int last = 0; int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[last] == chars[i]) {
                count++;
            } else {
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[++last] = c;
                    }
                }
                chars[++last] = chars[i];
                count = 1;
            }
        }
        if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                chars[++last] = c;
            }
        }
        return ++last;
    }
}