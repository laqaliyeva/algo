package leetcode;

/*
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents
 * the coordinate of a point. Check if these points make a straight line in the XY plane.
 *
 * Example          Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 *                  Output: true
 *
 *                  Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 *                  Output: false
*/

public class CheckStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) return true;

        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];

        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int[] point : coordinates) {
            int xI = point[0];
            int yI = point[1];
            if ((y1 - y0) * (xI - x0) != (yI - y0) * (x1 - x0)) {
                return false;
            }
        }
        return true;
    }
}