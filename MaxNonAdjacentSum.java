 public class MaxNonAdjacentSum {

    public static int findMaxSum(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int include = nums[0];  // include current element
        int exclude = 0;        // exclude current element

        for (int i = 1; i < nums.length; i++) {
            int newInclude = exclude + nums[i];
            int newExclude = Math.max(include, exclude);

            include = newInclude;
            exclude = newExclude;
        }

        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 10};
        System.out.println("Max Non-Adjacent Sum: " + findMaxSum(arr));
    }
} 