 public class MinArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 3, 9};
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        System.out.println("Minimum = " + min);
    }
} 