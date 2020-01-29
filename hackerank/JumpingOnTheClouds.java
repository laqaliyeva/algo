package hackerank;

/*
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
*/

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int res = 0;
        for (int i = 0; i < c.length - 1;) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                i += 2;
            } else {
                i ++;
            }
            res ++;
        }
        return res;
    }
}