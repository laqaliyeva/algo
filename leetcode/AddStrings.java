package leetcode;

public class AddStrings {

    /*
    * Given two non-negative integers num1 and num2 represented as string,
    * return the sum of num1 and num2.
    * Note:
    *       The length of both num1 and num2 is < 5100.
    *       Both num1 and num2 contains only digits 0-9.
    *       Both num1 and num2 does not contain any leading zero.
    *       You must not use any built-in BigInteger library or convert the inputs to integer directly.
    *
    * Example           Input: num1 = "15564", num2 = "3164654"
    *                   Output: "3180218"
    */

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int length = Math.max(num1.length(), num2.length());
        int carrier = 0;
        for (int i = 1; i <= length; i++) {
            int i1 = getCharAtIdx(num1, num1.length() - i);
            int i2 = getCharAtIdx(num2, num2.length() - i);
            int sum = i1 + i2 + carrier;
            if (sum > 9) {
                result.insert(0, sum % 10);
                carrier = 1;
            } else {
                result.insert(0, sum);
                carrier = 0;
            }
        }
        if (carrier > 0) {
            result.insert(0, carrier);
        }
        return result.toString();
    }

    private static int getCharAtIdx(String num, int idx) {
        return idx >= 0 ? Character.getNumericValue(num.charAt(idx)) : 0;
    }
}