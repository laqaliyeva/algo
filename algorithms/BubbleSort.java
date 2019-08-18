package algorithms;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int a = arr[j];
                int b = arr[j+1];
                if (a > b) {
                    arr[j] = b;
                    arr[j+1] = a;
                }
            }
        }
    }
}