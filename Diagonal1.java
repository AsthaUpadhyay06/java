public public class Diagonal1 {
    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        System.out.print("Main Diagonal: ");
        for (int i = 0; i < mat.length; i++)
            System.out.print(mat[i][i] + " ");
    }
} 