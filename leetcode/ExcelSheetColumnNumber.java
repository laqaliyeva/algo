package leetcode;

/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * Example          Input: "A"            Output: 1
 *
 *                  Input: "AB"           Output: 28
 *
 *                  Input: "ZY"           Output: 701
*/

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        if (s.isEmpty()) return 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - i - 1);
        }
        return res;
    }
}