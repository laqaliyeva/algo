package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    /*
        Given a non-negative integer numRows, generate
        the first numRows of Pascal's triangle.

        Example         Arg: 5
                        Output: 1
                               1 1
                              1 2 1
                             1 3 3 1
                            1 4 6 4 1
    */

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            int colNum = 0;
            row.add(1);
            while (++colNum < rowNum) {
                List<Integer> prevRow = result.get(rowNum - 1);
                row.add(prevRow.get(colNum - 1) + prevRow.get(colNum));
            }
            if (rowNum > 0) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}
