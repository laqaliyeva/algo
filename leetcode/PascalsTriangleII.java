package leetcode;

import java.util.*;

public class PascalsTriangleII {

   /*
   * Given a non-negative index k where k ≤ 33,
   * return the kth index row of the Pascal's triangle.
   * Note that the row index starts from 0.
   *
   * Example         Arg: 5
   *                 Output: [1, 5, 10, 10, 5, 1]
   */

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long temp = 1L;
        for (int i = 0; i <= rowIndex / 2; i++) {
            row.add((int) temp);
            temp = temp * (rowIndex - i) / (i + 1);
        }
        if (rowIndex == 0) {
            return row;
        }
        if (rowIndex % 2 == 0) {
            row.addAll(row.subList(0, rowIndex / 2));
        } else {
            row.addAll(row);
        }
        Collections.reverse(row.subList(rowIndex / 2 + 1, row.size()));
        return row;
    }
}