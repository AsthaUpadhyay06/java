 public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean identity = true;

        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                if ((i == j && mat[i][j] != 1) || (i != j && mat[i][j] != 0))
                    identity = false;

        System.out.println(identity ? "Identity Matrix" : "Not Identity Matrix");
    }
} 