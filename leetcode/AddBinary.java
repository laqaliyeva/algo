package leetcode;

public class AddBinary {

    /*
    * Given two binary strings, return their sum (also a binary string).
    * The input strings are both non-empty and contains only characters 1 or 0.
    *
    * Example           Input: a = "1010", b = "1011"
    *                   Output: "10101"
    */

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int length = Math.max(a.length(), b.length());
        int carrier = 0;
        for (int i = 1; i <= length; i++) {
            char cA = a.length() - i >= 0 ? a.charAt(a.length() - i) : '0';
            char cB = b.length() - i >= 0 ? b.charAt(b.length() - i) : '0';
            int sum = Character.getNumericValue(cA) + Character.getNumericValue(cB) + carrier;
            if (sum % 2 == 0) {
                result.insert(0, "0");
            } else {
                result.insert(0, "1");
            }
            if (sum > 1) {
                carrier = 1;
            } else {
                carrier = 0;
            }
        }
        if (carrier == 1) {
            result.insert(0, "1");
        }
        return result.toString();
    }
}