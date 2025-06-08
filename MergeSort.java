import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: already sorted
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            array[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        System.out.println("Original array: " + Arrays.toString(arr));

        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}