public class CountZeros {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2},
            {3, 0, 0},
            {4, 5, 6}
        };
        int count = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num == 0) count++;
            }
        }

        System.out.println("Total zeros: " + count);
    }
}