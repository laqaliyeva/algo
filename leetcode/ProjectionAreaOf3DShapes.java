package leetcode;

/*
 * On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 * Now we view the projection of these cubes onto the xy, yz, and zx planes.
 * A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane.
 * Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.
 * Return the total area of all three projections.
 *
 * Example          Input: [[2]]
 *                  Output: 5
 *
 *                  Input: [[1,2],[3,4]]
 *                  Output: 17
 *
 *                  Input: [[1,1,1],[1,0,1],[1,1,1]]
 *                  Output: 14
*/

public class ProjectionAreaOf3DShapes {

    public static int projectionArea(int[][] grid) {
        int area1 = grid.length * grid.length;
        int area2 = 0;
        int area3 = 0;
        for (int i = 0; i < grid.length; i++) {
            int maxI = 0;
            int maxJ = 0;
            for (int j = 0; j < grid.length; j++) {
                maxI = Math.max(maxI, grid[i][j]);
                maxJ = Math.max(maxJ, grid[j][i]);
                if (grid[i][j] == 0) {
                    area1 --;
                }
            }
            area2 += maxI;
            area3 += maxJ;
        }
        return area1 + area2 + area3;
    }
}