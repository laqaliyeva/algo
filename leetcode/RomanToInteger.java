package leetcode;

public class RomanToInteger {

    /*
    * Given a roman numeral, convert it to an integer.
    *
    * Example           Input: "MCMXCIV"
    *                   Output: 1994
    */

    public static int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int term = getInt(chars[i]);
            if (i < chars.length - 1) {
                if (term < getInt(chars[i + 1])) {
                    term = getInt(chars[i + 1]) - term;
                    i++;
                }
            }
            result += term;
        }
        return result;
    }

    private static int getInt(char roman) {
        int result = 0;
        switch (roman) {
            case 'I': result = 1;
                break;
            case 'V': result = 5;
                break;
            case 'X': result = 10;
                break;
            case 'L': result = 50;
                break;
            case 'C': result = 100;
                break;
            case 'D': result = 500;
                break;
            case 'M': result = 1000;
                break;
        }
        return result;
    }
}