package leetcode;

public class RobotReturnToOrigin {

    /*
    * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence
    * of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
    * Valid moves are R (right), L (left), U (up), and D (down).
    *
    * Example           Input: "UD"
    *                   Output: true
    *
    *                   Input: "LL"
    *                   Output: false
    */

    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U': y++; break;
                case 'D': y--; break;
                case 'R': x++; break;
                default: x--;
            }
        }
        return x == 0 && y == 0;
    }
}