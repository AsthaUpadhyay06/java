import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5}; // Example array
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1); // Sort left subarray
            quickSort(arr, pivotIndex + 1, high); // Sort right subarray
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1; // Index for smaller elements
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); // Swap if element is smaller than pivot
            }
        }
        swap(arr, i + 1, high); // Move pivot to correct position
        return i + 1; // Return pivot index
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
} 