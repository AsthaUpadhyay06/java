public class SudokuRowValidator {
    public static void main(String[] args) {
        int[] row = {5, 3, 4, 6, 7, 8, 9, 1, 2};
        boolean[] seen = new boolean[10];

        for (int num : row) {
            if (seen[num]) {
                System.out.println("Invalid row");
                return;
            }
            seen[num] = true;
        }
        System.out.println("Valid row");
    }
} 
