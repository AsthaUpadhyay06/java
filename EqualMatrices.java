 public class EqualMatrices {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {1, 2},
            {3, 4}
        };

        boolean isEqual = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println(isEqual ? "Matrices are equal" : "Matrices are not equal");
    }
}
