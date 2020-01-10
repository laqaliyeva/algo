package leetcode;

/*
 * On a N * N grid, we place some 1 * 1 * 1 cubes.
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 * Return the total surface area of the resulting shapes.
 *
 * Example          Input: [[2]]
 *                  Output: 10
 *
 *                  Input: [[1,2],[3,4]]
 *                  Output: 34
 *
 *                  Input: [[1,1,1],[1,0,1],[1,1,1]]
 *                  Output: 32
*/

public class SurfaceAreaOf3DShapes {

    public static int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j ++) {
                if (grid[i][j] != 0) {
                    area += 4 * grid[i][j] + 2;
                    if (j - 1 >= 0) {
                        area -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
                    }
                    if (i - 1 >= 0) {
                        area -= 2 * Math.min(grid[i][j], grid[i - 1][j]);
                    }
                }
            }
        }
        return area;
    }
}