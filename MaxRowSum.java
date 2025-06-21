 public class MaxRowSum {
    public static void main(String[] args) {
        int[][] mat = { {1, 2}, {10, 20}, {3, 4} };
        int maxSum = 0, rowIdx = -1;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j : mat[i]) sum += j;
            if (sum > maxSum) {
                maxSum = sum;
                rowIdx = i;
            }
        }

        System.out.println("Row with max sum: " + rowIdx);
    }
} 