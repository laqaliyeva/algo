package leetcode;

/*
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * If there're duplicates in arr, count them seperately.
 *
 * Example          Input: arr = [1,2,3]
 *                  Output: 2
 *
 *                  Input: arr = [1,3,2,3,5,0]
 *                  Output: 3
*/

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int count = 0;
        for (int i : arr) {
            if (set.contains(i + 1)) {
                count++;
            }
        }
        return count;
    }
}