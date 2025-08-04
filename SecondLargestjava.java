public class SecondLargestjava {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 9, 8};
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}