package leetcode;

/*
 * Given a positive integer num, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.
 *
 * Example          Input: num = 5
 *                  Output: 2
 *
 *                  Input: num = 1
 *                  Output: 0
 */

public class NumberComplement {

    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        for (char c : Integer.toBinaryString(num).toCharArray()) {
            sb.append(c);
        }
        int result = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '0') {
                result += Math.pow(2, sb.length() - 1 - i);
            }
        }
        return result;
    }
}