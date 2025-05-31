import java.util.Arrays;
import java.util.Collections;

public class KthLargest {
    public static int findKthLargest(Integer[] arr, int K) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[K - 1];
    }

    public static void main(String[] args) {
        Integer[] arr = {12, 3, 5, 7, 19};
        int K = 2;
        System.out.println("Kth Largest Element: " + findKthLargest(arr, K));
    }
}