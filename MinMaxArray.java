 public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 7, 6, 22, 1};
        int min = arr[0], max = arr[0];

        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.println("Min: " + min + ", Max: " + max);
    }
} 
