public class MatrixSum {
    public static void main(String[] args) {
        int[][] mat = { {1, 2}, {3, 4} };
        int sum = 0;
        for (int[] row : mat)
            for (int val : row)
                sum += val;
        System.out.println("Matrix Sum: " + sum);
    }
}