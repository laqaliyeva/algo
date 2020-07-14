package codesignal;

/*
 * Sudoku is a number-placement puzzle. The objective is to fill
 * a 9 × 9 grid with numbers in such a way that each column, each row,
 * and each of the nine 3 × 3 sub-grids all contain all of the numbers
 * from 1 to 9 one time. Implement an algorithm that will check whether
 * the given grid of numbers represents a valid Sudoku puzzle according
 * to the layout rules described above.
*/

import java.util.HashSet;
import java.util.Set;

public class Sudoku2 {

    public boolean sudoku2(char[][] grid) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                char c = grid[i][j];
                if (c == '.') continue;
                if (!set.add(c + " in row " + i) ||
                        !set.add(c + " in column " + j) ||
                        !set.add(c + " int block " + i / 3 + " - " + j / 3)) {
                    return false;
                }
            }
        }
        return true;
    }
}