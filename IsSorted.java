 public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted ? "Sorted" : "Not Sorted");
    }
}