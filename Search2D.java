public class Search2D {
    public static void main(String[] args) {
        int[][] mat = { {1, 3, 5}, {7, 9, 11} };
        int key = 9;
        boolean found = false;

        for (int[] row : mat)
            for (int val : row)
                if (val == key)
                    found = true;

        System.out.println("Found? " + found);
    }
}