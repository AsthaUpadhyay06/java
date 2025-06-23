 public class TriangleMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Lower Triangle:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        System.out.println("Upper Triangle:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
} {
    
}
