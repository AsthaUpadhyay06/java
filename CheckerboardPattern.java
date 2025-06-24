 public class CheckerboardPattern {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = (i + j) % 2;
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
} 