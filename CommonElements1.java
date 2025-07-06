 public class CommonElements1 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 3, 5, 8, 9};

        System.out.print("Common: ");
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
