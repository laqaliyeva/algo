package codesignal;

/*
 * Given an array of numbers in the range from 1 to array length,
 * find the first duplicate for which the second occurrence has the minimal index.
 * In other words, if there are more than 1 duplicate, return the number for which
 * the second occurrence has a smaller index than the second occurrence of the other number does.
 * If there are no such elements, return -1.
 *
 * Example          Input: [2, 1, 3, 5, 3, 2]
 *                  Output: 3 (duplicate of 3 has a smaller index than duplicate of 2)
*/

public class FirstDuplicate {

    public int firstDuplicate(int[] array) {
        int minIndex = array.length;
        int[] indices = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (indices[value - 1] == 0) {
                indices[value - 1] = value;
            } else {
                minIndex = Math.min(minIndex, i);
            }
        }
        return minIndex < array.length ? array[minIndex] : -1;
    }
}