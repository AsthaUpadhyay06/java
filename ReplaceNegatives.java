 public class ReplaceNegatives {
    public static void main(String[] args) {
        int[][] arr = {
            {-1, 2},
            {3, -4}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < 0)
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
} 