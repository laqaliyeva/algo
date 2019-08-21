package leetcode;

//looked at solution
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m -1; //to iterate through nums1 from m
        int i2 = n - 1; //to iterate through nums2 from n
        int i = m + n - 1; //to iterate through whole nums1
        while (i >= 0) {
            if (i1 >= 0 && i2 >= 0) {
                if (nums1[i1] > nums2[i2]) {
                    nums1[i--] = nums1[i1];
                    nums1[i1--] = 0;
                } else {
                    nums1[i--] = nums2[i2--];
                }
            } else if (i1 >= 0) {
                i--;
            } else {
                while (i2 >= 0) {
                    nums1[i--] = nums2[i2--];
                }
            }
        }
    }
}
