package leetcode;

/*
 * You have a list of points in the plane. Return the area of the largest
 * triangle that can be formed by any 3 of the points.
 *
 * Example          Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
 *                  Output: 2
*/

public class LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        double result = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    result = Math.max(result, getAreaTriangle(points[i], points[j], points[k]));
                }
            }
        }
        return result;
    }

    private double getAreaTriangle(int[] point1, int[] point2, int[] point3) {
        double a = getLength(point2, point1);
        double b = getLength(point3, point2);
        double c = getLength(point1, point3);
        double area = 0;
        if (a + b > c && a + c > b && b + c > a) {
            area = Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a)) / 4;
        }
        return area;
    }

    private double getLength(int[] point1, int[] point2) {
        int x = point2[0] - point1[0];
        int y = point2[1] - point1[1];
        return Math.sqrt(x * x + y * y);
    }
}