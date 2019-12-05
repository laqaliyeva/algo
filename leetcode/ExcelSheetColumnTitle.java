package leetcode;

/*
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * Example          Input: 1            Output: "A"
 *
 *                  Input: 2            Output: "B"
 *
 *                  Input: 28           Output: "AB"
 *
 *                  Input: 701          Output: "ZY"
*/

public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle((n - 1) / 26) + (char) ('A' + (n - 1) % 26);
    }
}