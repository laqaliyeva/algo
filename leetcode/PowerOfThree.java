package leetcode;

/*
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Example          Input: 27           Output: true
 *
 *                  Input: 45           Output: false
*/

import java.util.LinkedList;
import java.util.Queue;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n == 0 || n % 3 > 0) return false;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(7);
        queue.add(9);
        queue.add(3);
        queue.add(1);
        if (!queue.contains(n % 10)) return false;
        while (queue.peek() != n % 10) {
            queue.add(queue.poll());
        }
        while (n != 1) {
            if (n % 3 != 0 || queue.peek() != n % 10) return false;
            queue.add(queue.poll());
            n /= 3;
        }
        return true;
    }
}