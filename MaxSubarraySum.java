 public class MaxSubarraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // start with the first element
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either take current element or start new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum if currentSum is higher
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum = " + result);
    }
} 