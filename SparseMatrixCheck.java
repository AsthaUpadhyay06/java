 class SparseMatrixCheck {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 3},
            {0, 0, 0},
            {1, 0, 0}
        };

        int zeroCount = 0, total = matrix.length * matrix[0].length;

        for (int[] row : matrix) {
            for (int val : row) {
                if (val == 0) zeroCount++;
            }
        }

        if (zeroCount > total / 2)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not a Sparse Matrix");
    }
}
