 public class BoundaryElements {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Top row
        for (int i = 0; i < cols; i++)
            System.out.print(matrix[0][i] + " ");

        // Right column
        for (int i = 1; i < rows; i++)
            System.out.print(matrix[i][cols - 1] + " ");

        // Bottom row
        if (rows > 1) {
            for (int i = cols - 2; i >= 0; i--)
                System.out.print(matrix[rows - 1][i] + " ");
        }

        // Left column
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--)
                System.out.print(matrix[i][0] + " ");
        }
    }
}