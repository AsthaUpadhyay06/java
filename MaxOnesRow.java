 public class MaxOnesRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1},
            {1, 1, 1},
            {0, 0, 1}
        };

        int maxCount = 0;
        int rowIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }

        System.out.println("Row with max 1s: " + rowIndex);
    }
} 