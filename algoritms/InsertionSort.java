package algoritms;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int prevIndex = i - 1;
            while (prevIndex >= 0) {
                if (current < arr[prevIndex]) {
                    arr[prevIndex+ 1] = arr[prevIndex--];
                } else {
                    break;
                }
            }
            arr[prevIndex + 1] = current;
        }
    }
}