package leetcode;

public class CanPlaceFlowers {

    /*
    * Given a flowerbed (represented as an array containing 0 and 1,
    * where 0 means empty and 1 means not empty), and a number n,
    * return if n new flowers can be planted in it without violating
    * the no-adjacent-flowers rule (flowers cannot be planted in adjacent
    * plots - they would compete for water and both would die)
    *
    * Example           Input: flowerbed = [1,0,0,0,1], n = 1
    *                   Output: true
    *
    *                   Input: flowerbed = [1,0,0,0,1], n = 2
    *                   Output: false
    */

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int count0s = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                count0s = 0;
            } else {
                count0s++;
                if (i == 0) {
                    count0s++;
                }
                if (i == flowerbed.length - 1) {
                    count0s++;
                }
            }
            if (count0s >= 3) {
                count++;
                count0s = 1;
            }
        }
        return count >= n;
    }
}