 public class MaxSumSubarrayOfSizeK {
    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size k: " + maxSum(arr, k));
    }
}