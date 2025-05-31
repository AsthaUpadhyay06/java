 public class KadaneAlgorithm {
    public static int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0]; // Initialize with first element
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3}; // Example array
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
    }
}